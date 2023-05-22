package com.xuwencheng.dao.impl;

import com.xuwencheng.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save");
    }

    // bean初始化的操作
    public void init(){
        System.out.println("bean。。。。初始化");
    }

    // bean销毁的操作
    public void destory(){
        System.out.println("bean。。。。销毁操作");
    }
}
