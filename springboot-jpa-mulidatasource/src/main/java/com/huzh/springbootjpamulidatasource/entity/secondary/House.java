package com.huzh.springbootjpamulidatasource.entity.secondary;

import javax.persistence.*;

/**
 * @ClassName House
 * @Description TODO
 * @Date 2019/8/28 18:58
 * @Author huzh
 * @Version 1.0
 */
@Entity
@Table(name = "house")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int houseId;
    private String houseName;
    private String houseIntroduce;

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseIntroduce() {
        return houseIntroduce;
    }

    public void setHouseIntroduce(String houseIntroduce) {
        this.houseIntroduce = houseIntroduce;
    }

    public House(String houseName, String houseIntroduce) {
        this.houseName = houseName;
        this.houseIntroduce = houseIntroduce;
    }
}
