package com.guangzhou.pcsold.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("payinfo")
public class Payinfo implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "payid", type = IdType.AUTO)
      private Integer payid;

    @TableField("orderid")
    private Integer orderid;

    @TableField("shoppingid")
    private Integer shoppingid;

    @TableField("paydate")
    private LocalDateTime paydate;

    
    public Integer getPayid() {
        return payid;
    }

      public void setPayid(Integer payid) {
          this.payid = payid;
      }
    
    public Integer getOrderid() {
        return orderid;
    }

      public void setOrderid(Integer orderid) {
          this.orderid = orderid;
      }
    
    public Integer getShoppingid() {
        return shoppingid;
    }

      public void setShoppingid(Integer shoppingid) {
          this.shoppingid = shoppingid;
      }
    
    public LocalDateTime getPaydate() {
        return paydate;
    }

      public void setPaydate(LocalDateTime paydate) {
          this.paydate = paydate;
      }

      public static final String PAYID = "payid";

      public static final String ORDERID = "orderid";

      public static final String SHOPPINGID = "shoppingid";

      public static final String PAYDATE = "paydate";

      @Override
    public String toString() {
        return "Payinfo{" +
              ", payid=" + payid +
                  ", orderid=" + orderid +
                  ", shoppingid=" + shoppingid +
                  ", paydate=" + paydate +
              "}";
    }
}
