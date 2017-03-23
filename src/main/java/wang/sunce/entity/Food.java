package wang.sunce.entity;

import wang.sunce.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Sunce on 2017/3/19 0019.
 */

@Entity
public class Food extends BaseEntity{

    private String foodNo;
    private String foodName;
    private String foodStatus;
    private Double price;
    private String type;

    private String shopNo;

    public void setFoodName(String foodName){
        this.foodName=foodName;
    }

    @Column
    public String getFoodName(){return foodName;}
    @Override
    public String toString() {
       return this.foodName;
    }
}
