/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrunnable;

/**
 *
 * @author KAMINI
 */
public class MyRunnable implements Runnable{
    @Override
    public void run(){
       System.out.println(Thread.currentThread().getName());
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyRunnable myRunnable =new MyRunnable();
        Thread t1= new Thread(myRunnable);
        Thread t2= new Thread(myRunnable);
        Thread t3= new Thread(myRunnable);
        t1.start();
        t2.start();
        t3.start();
    }

    
    
}
