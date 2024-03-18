package com.yue.example.common.model;

import java.io.Serializable;

/**
 * 用户
 */
public class User implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
