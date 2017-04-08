package wang.sunce.entity;

import wang.sunce.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "shop")
public class Shop extends BaseEntity{

    /** 操作员类型 */
    private String type;

    /** 店铺号 */
    private String shopNo;

    /** 手机号 */
    private String phoneNo;

    /** 店铺名称 */
    private String shopName;

    /** 规模 */
    private String size;

    /** 省份 */
    private String province;

    /** 城市 */
    private String city;

    /** 地址 */
    private String address;

    @Column(name = "type", length = 50)
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

    @Column(name = "phone_no", length = 20)
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Column(name = "shop_name", length = 100)
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Column(name = "province", length = 100)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Column(name = "city", length = 100)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "address", length = 500)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "type='" + type + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", shopName='" + shopName + '\'' +
                ", size='" + size + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}