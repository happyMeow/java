package com.example.demo.StaticFinal;

/**
 * Created by gqy on 2019/7/23.
 */
public class StaticFinalUse {
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.makeCount();

        Dog dog2 = new Dog();
        dog2.makeCount();

        Dog dog3 = new Dog();
        dog3.makeCount();
    }
}

abstract class Animal
{
    public static int num = 0;
    public static final int num2 = 0;
    abstract void makeCount();
}

class Dog extends Animal{
    public Dog()
    {
        this.num++;
    }
    @Overridegit
    public void makeCount()
    {
        System.out.println("Dog:"+num);
        System.out.println("Dog:"+num2);
    }
}