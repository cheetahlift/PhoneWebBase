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
@TableName("ordersdetail")
public class Ordersdetail implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "orderid", type = IdType.AUTO)
      private Integer orderid;

    @TableField("date")
    private LocalDateTime date;

    @TableField("status")
    private String status;

    
    public Integer getOrderid() {
        return orderid;
    }

      public void setOrderid(Integer orderid) {
          this.orderid = orderid;
      }
    
    public LocalDateTime getDate() {
        return date;
    }

      public void setDate(LocalDateTime date) {
          this.date = date;
      }
    
    public String getStatus() {
        return status;
    }

      public void setStatus(String status) {
          this.status = status;
      }

      public static final String ORDERID = "orderid";

      public static final String DATE = "date";

      public static final String STATUS = "status";

      @Override
    public String toString() {
        return "Ordersdetail{" +
              ", orderid=" + orderid +
                  ", date=" + date +
                  ", status=" + status +
              "}";
    }
}
