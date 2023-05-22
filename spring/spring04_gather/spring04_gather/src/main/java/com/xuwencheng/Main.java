package com.xuwencheng;

import com.xuwencheng.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) cxt.getBean("bookDao");

        bookDao.save();
    }
}