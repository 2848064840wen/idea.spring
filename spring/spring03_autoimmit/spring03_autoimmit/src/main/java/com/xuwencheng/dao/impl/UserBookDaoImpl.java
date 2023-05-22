package com.xuwencheng.dao.impl;

import com.xuwencheng.dao.UserBookDao;

public class UserBookDaoImpl implements UserBookDao {

    int count;
    String name;

    @Override
    public void save() {
        System.out.println("User dao   " + count + "    " + name);
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }
}
