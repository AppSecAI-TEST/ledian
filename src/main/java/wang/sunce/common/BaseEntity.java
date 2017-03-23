package wang.sunce.common;

import javax.persistence.Id;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Sunce on 2017/3/23 0023.
 */
public class BaseEntity implements Serializable {

    private long id;
    private long optimistic;

    private String status;

    private String remark;
    private Date create_time;

    public void setId(long id) {
        this.id = id;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setOptimistic(long optimistic) {
        this.optimistic = optimistic;
    }

    @Version
    public long getOptimistic() {
        return optimistic;
    }

}
