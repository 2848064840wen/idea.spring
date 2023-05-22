package com.xuwencheng.factory;

import com.xuwencheng.dao.BookDao;
import com.xuwencheng.dao.impl.BookDaoImpl;

public class UserNewFactory {

    // 实例化工厂
    public BookDao getUserDao(){
        return new BookDaoImpl() ;
    }
}
