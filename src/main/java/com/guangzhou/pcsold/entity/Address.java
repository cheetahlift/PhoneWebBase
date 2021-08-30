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
@TableName("address")
public class Address implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "userid", type = IdType.AUTO)
      private Integer userid;

    @TableField("address")
    private String address;

    
    public Integer getUserid() {
        return userid;
    }

      public void setUserid(Integer userid) {
          this.userid = userid;
      }
    
    public String getAddress() {
        return address;
    }

      public void setAddress(String address) {
          this.address = address;
      }

      public static final String USERID = "userid";

      public static final String ADDRESS = "address";

      @Override
    public String toString() {
        return "Address{" +
              ", userid=" + userid +
                  ", address=" + address +
              "}";
    }
}
