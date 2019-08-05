package com.example.demo.thread;

/**
 * Created by gqy on 2019/8/5.
 */
class SomeTread extends Thread {
    private String name;
    @Override
    public void run(){
        int n = 10;
        while (n>0)
        {
            try {
                System.out.println(name+" 第"+n+"个数字");
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n--;
        }
    }

    SomeTread(String name)
    {
        this.name = name;
        System.out.println("Thread-name:"+name);
    }

    public static void main(String[] args)
    {
        SomeTread oneThread = new SomeTread("Thread1");
        oneThread.start();

        SomeTread twoThread = new SomeTread("Thread2");
        twoThread.start();

        SomeTread threeThread = new SomeTread("Thread3");
        threeThread.start();
    }

}