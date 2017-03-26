package wang.sunce.common;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Sunce on 2017/3/23 0023.
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    private long id;
    private long optimistic;

    private String status;

    private String remark;
    private Date createTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Version
    public long getOptimistic() {
        return optimistic;
    }

    public void setOptimistic(long optimistic) {
        this.optimistic = optimistic;
    }

    @Column(name = "status", length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "remark", length = 200)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "create_time" )
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
