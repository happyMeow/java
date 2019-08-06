package com.example.demo.thread;

/**
 * Created by gqy on 2019/8/5.
 */
public class Bank {
    private int count = 0;
    public void add(int money){
        synchronized (this){
            count +=money;
        }
        System.out.println(System.currentTimeMillis()+"存进："+money);
    }

    public void sub(int money){
        synchronized (this){
            if(count - money<0){
                System.out.println("当前账户余额不足");
                return;
            }
            count -= money;
        }
        System.out.println(+System.currentTimeMillis()+"取出："+money);
    }

    public void getMoney(){
        System.out.println("账户余额："+count);
    }

    public static void main(String[] args)
    {
        Bank bank = new Bank();
        bank.add(80);
        bank.add(12890000);
        bank.sub(80);
        bank.getMoney();
    }
}
