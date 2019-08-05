package com.example.demo.thread;

/**
 * Created by gqy on 2019/8/5.
 */
public class SomeRunnable implements Runnable {
    private String name;

    SomeRunnable(String name)
    {
        this.name = name;
    }

    @Override
    public void run() {
        int n = 10;
        while (n>0)
        {
            try {
                System.out.println(name+"--"+n+"个数字");
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n--;
        }
    }

    public static void main(String[] args)
    {
        SomeRunnable oneRunable = new SomeRunnable("Thread-1");
        oneRunable.run();

        SomeRunnable twoRunable = new SomeRunnable("Thread-2");
        twoRunable.run();

        SomeRunnable threeRunable = new SomeRunnable("Thread-3");
        threeRunable.run();
    }
}
