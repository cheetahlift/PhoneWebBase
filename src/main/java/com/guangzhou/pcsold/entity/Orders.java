package com.guangzhou.pcsold.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljs
 * @since 2021-08-19
 */
@TableName("orders")
public class Orders implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "orderid", type = IdType.AUTO)
      private Integer orderid;

    @TableField("userid")
    private Integer userid;

    @TableField("goodid")
    private Integer goodid;

    
    public Integer getOrderid() {
        return orderid;
    }

      public void setOrderid(Integer orderid) {
          this.orderid = orderid;
      }
    
    public Integer getUserid() {
        return userid;
    }

      public void setUserid(Integer userid) {
          this.userid = userid;
      }
    
    public Integer getGoodid() {
        return goodid;
    }

      public void setGoodid(Integer goodid) {
          this.goodid = goodid;
      }

      public static final String ORDERID = "orderid";

      public static final String USERID = "userid";

      public static final String GOODID = "goodid";

      @Override
    public String toString() {
        return "Orders{" +
              ", orderid=" + orderid +
                  ", userid=" + userid +
                  ", goodid=" + goodid +
              "}";
    }
}
