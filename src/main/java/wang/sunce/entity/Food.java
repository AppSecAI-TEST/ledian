package wang.sunce.entity;

import wang.sunce.common.BaseEntity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "food")
public class Food extends BaseEntity {

    /** 食品编号 */
    private String foodNo;

    /** 食品名称 */
    private String foodName;

    /** 食品状态 */
    private String foodStatus;

    /** 价格 */
    private Double price;

    /** 食品类型 */
    private String type;

    /** 店铺编号 */
    private String shopNo;

    @Column(name = "food_no", length = 30)
    public String getFoodNo() {
        return foodNo;
    }

    public void setFoodNo(String foodNo) {
        this.foodNo = foodNo;
    }

    @Column(name = "food_name", length = 200)
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Column(name = "food_status", length = 50)
    public String getFoodStatus() {
        return foodStatus;
    }

    public void setFoodStatus(String foodStatus) {
        this.foodStatus = foodStatus;
    }

    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Column(name = "type", length = 200)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "shop_no", length = 50)
    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    @Override
    public String toString() {
        return
                " foodName='" + foodName ;
    }
}