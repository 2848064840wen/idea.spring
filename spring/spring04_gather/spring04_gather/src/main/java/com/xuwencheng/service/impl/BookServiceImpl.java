package com.xuwencheng.service.impl;

import com.xuwencheng.dao.impl.BookDaoImpl;
import com.xuwencheng.service.BookService;

public class BookServiceImpl implements BookService {
    BookDaoImpl bookDao;

    @Override
    public void save() {
        System.out.println("Service impl·············");
    }
}
