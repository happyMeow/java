package com.example.demo.thread;

/**
 * Created by gqy on 2019/8/5.
 */
class SomeTread extends Thread {
    private String name;
    @Override
    public void run(){
        super.run();
        int n = 10;
        while (n>0)
        {
            System.out.println(name+" 第"+n+"个数字");
            //Thread.currentThread().sleep(50);
            Thread.currentThread().yield();
            n--;
        }
    }

    SomeTread(String name, int pro)
    {
        this.name = name;
        super.setPriority(pro);
        System.out.println("Thread-name:"+name);
    }

    public static void main(String[] args)
    {
        SomeTread oneThread = new SomeTread("Thread1", Thread.MAX_PRIORITY);
        oneThread.start();

        SomeTread twoThread = new SomeTread("Thread2",Thread.NORM_PRIORITY);
        twoThread.start();

        SomeTread threeThread = new SomeTread("Thread3",Thread.MIN_PRIORITY);
        threeThread.start();
    }

}