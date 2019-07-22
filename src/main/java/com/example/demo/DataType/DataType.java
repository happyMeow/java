package com.example.demo.DataType;


import com.example.demo.Logging.Logging;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by gqy on 2019/7/22.
 */
public class DataType {
    public static void main(String[] args)
    {
        Log log = LogFactory.getLog(Logging.class);
        // byte
        log.info("基本类型：byte 二进制位数：" + Byte.SIZE);
        log.info("包装类：java.lang.Byte");
        log.info("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        log.info("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);

        // short
        log.info("基本类型：short 二进制位数：" + Short.SIZE);
        log.info("包装类：java.lang.Short");
        log.info("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        log.info("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);

        // int
        log.info("基本类型：int 二进制位数：" + Integer.SIZE);
        log.info("包装类：java.lang.Integer");
        log.info("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        log.info("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);


        // long
        log.info("基本类型：long 二进制位数：" + Long.SIZE);
        log.info("包装类：java.lang.Long");
        log.info("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        log.info("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);

        // float
        log.info("基本类型：float 二进制位数：" + Float.SIZE);
        log.info("包装类：java.lang.Float");
        log.info("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        log.info("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);

        // double
        log.info("基本类型：double 二进制位数：" + Double.SIZE);
        log.info("包装类：java.lang.Double");
        log.info("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        log.info("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);

        // char
        log.info("基本类型：char 二进制位数：" + Character.SIZE);
        log.info("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        log.info("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        log.info("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);
    }
}
