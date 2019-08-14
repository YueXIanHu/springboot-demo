package com.huzh.springbootcache.entity;

import javax.persistence.*;

/**
 * @ClassName House
 * @Description TODO
 * @Date 2019/8/5 15:25
 * @Author huzh
 * @Version 1.0
 */
@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 10)
    private String houseName;
    private String houseSize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(String houseSize) {
        this.houseSize = houseSize;
    }

    public House(String houseName, String houseSize) {
        this.houseName = houseName;
        this.houseSize = houseSize;
    }

    public House(int id, String houseName, String houseSize) {
        this.id = id;
        this.houseName = houseName;
        this.houseSize = houseSize;
    }

    public House() {
    }
}
