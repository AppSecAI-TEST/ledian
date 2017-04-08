package wang.sunce.entity;

import wang.sunce.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order extends BaseEntity{

    /** 店铺号 */
    private String shopNo;

    /**  */
    private Double totalAmount;

    /**  */
    private String orderNo;

    @Column(name = "shop_no", length = 50)
    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    @Column(name = "total_amount")
    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Column(name = "order_no", length = 50)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "Order{" +
                "shopNo='" + shopNo + '\'' +
                ", totalAmount=" + totalAmount +
                ", orderNo='" + orderNo + '\'' +
                '}';
    }
}