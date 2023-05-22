package com.xuwencheng.factory;

import com.xuwencheng.dao.BookDao;
import com.xuwencheng.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<BookDao> {
    //    代替原始实例化工厂创建对象
    @Override
    public BookDao getObject() throws Exception {
        return new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BookDaoImpl.class;
    }

    // 是否单例，true 单例 false 非单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
