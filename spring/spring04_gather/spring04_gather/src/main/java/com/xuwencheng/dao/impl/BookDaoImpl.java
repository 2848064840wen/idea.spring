package com.xuwencheng.dao.impl;

import com.xuwencheng.dao.BookDao;

import java.util.*;

public class BookDaoImpl implements BookDao {

    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties properties;

    @Override
    public void save() {
        System.out.println("Dao impl·······");

        System.out.println("遍历数组\t" + Arrays.toString(array));
        System.out.println("list集合\t" + list);
        System.out.println("set集合\t" + set);
        System.out.println("map集合\t" + map);
        System.out.println("properties集合\t" + properties);
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
