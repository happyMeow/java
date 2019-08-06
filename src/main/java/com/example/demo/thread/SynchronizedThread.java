package com.example.demo.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by gqy on 2019/8/5.
 */
public class SynchronizedThread {
    class Bank {

        private volatile int account = 100;
        private Lock lock = new ReentrantLock();

        public int getAccount() {
            return account;
        }

        /**
         * 用同步方法实现
         *
         * @param money
         */
        public synchronized void save(int money) {
            account += money;
            int s =10 ;


        }

        public void save2(int money) {
            lock.lock();
            try{
                account += money;
            }finally {
                lock.unlock();
            }
        }
        /**
         * 用同步代码块实现
         *
         * @param money
         */
        public void save1(int money) throws InterruptedException {
            synchronized (this) {
                account += money;
                Thread.sleep(100);
            }
        }
    }

    class NewThread implements Runnable {
        private Bank bank;

        public NewThread(Bank bank) {
            this.bank = bank;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                // bank.save1(10);
                try {
                    bank.save1(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + "账户余额为：" +bank.getAccount());
            }
        }

    }

    /**
     * 建立线程，调用内部类
     */
    public void useThread() {
        Bank bank = new Bank();
        NewThread new_thread = new NewThread(bank);
        System.out.println("线程1");
        Thread thread1 = new Thread(new_thread);
        thread1.start();
        System.out.println("线程2");
        Thread thread2 = new Thread(new_thread);
        thread2.start();
    }

    public static void main(String[] args) {
        SynchronizedThread st = new SynchronizedThread();
        st.useThread();
    }
}
