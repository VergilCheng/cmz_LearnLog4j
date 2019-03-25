package cn.usetc.test;

import org.apache.log4j.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Test.class);//对应%C
        logger.debug("这是一个调试信息");//对应%m
        logger.info("这是一个普通信息");//对应%m

        //如下演示日志如何使用
        try {
            int i = 5/0;
        } catch (Exception e) {
            /*
              我们会将错误打印堆栈注释掉，防止程序出错后不会继续运行，但是这样会导致我们不能对错误进行debug，
              所以我们要在catch语句中写日志处理，将错误堆栈打印到文件中
             */
            //e.printStackTrace();
            logger.error(e.getMessage());
        }
        System.out.println("结束");

    }
}
