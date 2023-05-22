package com.xuwencheng.service.impl;

import com.xuwencheng.dao.impl.BookDaoImpl;
import com.xuwencheng.dao.impl.UserBookDaoImpl;
import com.xuwencheng.service.BookService;

public class BookServiceImpl implements BookService {
    BookDaoImpl b;
    UserBookDaoImpl u;

    /*public BookServiceImpl(BookDaoImpl b) {
        this.b = b;
    }*/

    public BookServiceImpl(BookDaoImpl b, UserBookDaoImpl u) {
        this.b = b;
        this.u = u;
    }

    @Override
    public void save() {
        System.out.println("book service save");
        b.save();
        u.save();
    }
/*
    public void setB(BookDaoImpl b) {
        this.b = b;
    }

    public void setU(UserBookDaoImpl u){
        this.u = u;
    }*/

}
