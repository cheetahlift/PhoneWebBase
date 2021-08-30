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
@TableName("shoppingcar")
public class Shoppingcar implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "shoppingid", type = IdType.AUTO)
      private Integer shoppingid;

    @TableField("userid")
    private Integer userid;

    @TableField("goodid")
    private Integer goodid;

    @TableField("nums")
    private Integer nums;

    
    public Integer getShoppingid() {
        return shoppingid;
    }

      public void setShoppingid(Integer shoppingid) {
          this.shoppingid = shoppingid;
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
    
    public Integer getNums() {
        return nums;
    }

      public void setNums(Integer nums) {
          this.nums = nums;
      }

      public static final String SHOPPINGID = "shoppingid";

      public static final String USERID = "userid";

      public static final String GOODID = "goodid";

      public static final String NUMS = "nums";

      @Override
    public String toString() {
        return "Shoppingcar{" +
              ", shoppingid=" + shoppingid +
                  ", userid=" + userid +
                  ", goodid=" + goodid +
                  ", nums=" + nums +
              "}";
    }
}
