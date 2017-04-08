package wang.sunce.entity;

import wang.sunce.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "operator")
public class Operator extends BaseEntity{

    /** 操作员类型 */
    private String type;

    /** 店铺号 */
    private String shopNo;

    /** 手机号 */
    private String phoneNo;

    /** 密码 */
    private String password;

    /** 密码 */
    private String publicPassword;

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

    @Column(name = "password", length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "public_password", length = 50)
    public String getPublicPassword() {
        return publicPassword;
    }

    public void setPublicPassword(String publicPassword) {
        this.publicPassword = publicPassword;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "type='" + type + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", password='" + password + '\'' +
                ", publicPassword='" + publicPassword + '\'' +
                '}';
    }
}
