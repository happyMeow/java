package com.example.demo.Enum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gqy on 2019/7/23.
 */
public class Coffee {

    CoffeeSize coffeeSize;
    Logger logger = LoggerFactory.getLogger(Coffee.class);

    public static void main(String[] args)
    {
        Coffee coffee = new Coffee();
        coffee.coffeeSize = CoffeeSize.HUGE;
        coffee.describe();
    }

    public void describe()
    {
       logger.info(coffeeSize.name()+":"+coffeeSize.getOunces());
    }

    enum CoffeeSize{
        BIG(8),HUGE(10),OVERSIZE(15);
        private int ounces;
        CoffeeSize(int ounces)
        {
            this.ounces = ounces;
        }

        public int getOunces()
        {
            return this.ounces;
        }
    }
}
