package com.xuwencheng;

import com.xuwencheng.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 获取IOC容器
//        ApplicationContext xt = new ClassPathXmlApplicationContext("mainContext.xml");


        ClassPathXmlApplicationContext xt = new ClassPathXmlApplicationContext("mainContext.xml");
        // 关闭钩子
        xt.registerShutdownHook();


        // 获取bean
    /*    BookDao bookDao1 = (BookDao) xt.getBean("bookDao");
        BookDao bookDao2 = (BookDao) xt.getBean("bookDao");*/


        BookDao bookDao = (BookDao) xt.getBean("bookDao");

      /*  System.out.println(bookDao1);
        System.out.println(bookDao2);*/


        bookDao.save();


        // 关闭IOC容器
        /*
        * 如果不使用 ClassPathXmlApplicationContext 类 则没有close关闭的方法
        * java虚拟机并没有给销毁的机会
        * */
//        xt.close();
    }
}
