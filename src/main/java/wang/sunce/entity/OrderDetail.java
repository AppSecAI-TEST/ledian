package wang.sunce.entity;

import wang.sunce.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "order_detail")
public class OrderDetail extends BaseEntity {

    /** 店铺号 */
    private String shopNo;

    /**  */
    private Double amount;

    /**  */
    private String orderNo;

    /**  */
    private String foodNo;

    /**  */
    private String foodName;

    /**  */
    private String foodType;

    @Column(name = "shop_no", length = 50)
    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    @Column(name = "amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Column(name = "order_no", length = 50)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

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

    @Column(name = "food_type", length = 200)
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "shopNo='" + shopNo + '\'' +
                ", amount=" + amount +
                ", orderNo='" + orderNo + '\'' +
                ", foodNo='" + foodNo + '\'' +
                ", foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                '}';
    }
}