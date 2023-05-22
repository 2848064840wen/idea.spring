package com.xuwencheng.service.impl;

import com.xuwencheng.dao.impl.BookDaoImpl;
import com.xuwencheng.service.BookService;

public class BookServiceImpl implements BookService {
    BookDaoImpl b;
    @Override
    public void save() {
        System.out.println("book service save");
        b.save();
    }

    public void setB(BookDaoImpl b) {
        this.b = b;
    }
}
