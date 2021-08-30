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
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "userid", type = IdType.AUTO)
      private Integer userid;

    @TableField("username")
    private String username;

    
    public Integer getUserid() {
        return userid;
    }

      public void setUserid(Integer userid) {
          this.userid = userid;
      }
    
    public String getUsername() {
        return username;
    }

      public void setUsername(String username) {
          this.username = username;
      }

      public static final String USERID = "userid";

      public static final String USERNAME = "username";

      @Override
    public String toString() {
        return "User{" +
              ", userid=" + userid +
                  ", username=" + username +
              "}";
    }
}
