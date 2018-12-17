package com.zenas.resource;

public class User {
    private Long id;
    private String name;
    private short sex;
    private int phonerNum;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    public int getPhonerNum() {
        return phonerNum;
    }

    public void setPhonerNum(int phonerNum) {
        this.phonerNum = phonerNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", phonerNum=" + phonerNum +
                '}';
    }
}
