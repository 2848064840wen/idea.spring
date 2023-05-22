package com.xuwencheng;

import com.xuwencheng.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 获取IOC容器
        ApplicationContext xt = new ClassPathXmlApplicationContext("ApplitionCollect.xml");




        // 获取bean


/*        BookDao bookDao = (BookDao) xt.getBean("bookDao");


        bookDao.save();*/
        BookService bs = (BookService) xt.getBean("bs");

        bs.save();




    }
}
