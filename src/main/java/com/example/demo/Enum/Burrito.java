package com.example.demo.Enum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gqy on 2019/7/23.
 */
public class Burrito {

    Spiciness spiciness;
    Logger logger = LoggerFactory.getLogger(Burrito.class);

    public Burrito(Spiciness spiciness){
        this.spiciness = spiciness;
    }

    public void menu()
    {
        switch (spiciness){
            case NOT:
               logger.info("not hot");
               break;
            case MIDDLE:
                logger.info("middle hot");
                break;
            case HOT:
                logger.info("hot");
                break;
        }
    }
    public static void main(String[] args)
    {
        Burrito burrito1 = new Burrito(Spiciness.MIDDLE);
        burrito1.menu();

        Burrito burrito2 = new Burrito(Spiciness.HOT);
        burrito2.menu();
    }
}
