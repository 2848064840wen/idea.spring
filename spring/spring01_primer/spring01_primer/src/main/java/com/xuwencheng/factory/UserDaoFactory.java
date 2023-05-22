package com.xuwencheng.factory;

import com.xuwencheng.dao.BookDao;
import com.xuwencheng.dao.impl.BookDaoImpl;

public class UserDaoFactory {
    // 静态工厂
    public static BookDao getBookDao() {
        return new BookDaoImpl();
    }

}
