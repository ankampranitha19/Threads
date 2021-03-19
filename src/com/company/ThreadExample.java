package com.company;

public class ThreadExample implements  Runnable{
    public static void main(String args[])
    {
        ThreadExample t=new ThreadExample();
        Thread th=new Thread();
        Thread th1=new Thread();
        t.run();
        th.start();
        th1.start();
        System.out.println(" Name1 : " +th.getName());
        System.out.println("Name2 : " +th1.getName());
        th.setName("Thread");
        System.out.println("Set name1 :" +th.getName());
        th.setPriority(Thread.MIN_PRIORITY);
        th1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("The name for priority1 :"+th.getPriority());
        System.out.println("The name for priority2 :" +th1.getPriority());
    }

    public void run() {
        System.out.println("Thread is running");
    }
}
