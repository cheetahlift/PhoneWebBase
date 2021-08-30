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
@TableName("goods")
public class Goods implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "goodid", type = IdType.AUTO)
      private Integer goodid;

    @TableField("goodname")
    private String goodname;

    @TableField("goodtype")
    private String goodtype;

    
    public Integer getGoodid() {
        return goodid;
    }

      public void setGoodid(Integer goodid) {
          this.goodid = goodid;
      }
    
    public String getGoodname() {
        return goodname;
    }

      public void setGoodname(String goodname) {
          this.goodname = goodname;
      }
    
    public String getGoodtype() {
        return goodtype;
    }

      public void setGoodtype(String goodtype) {
          this.goodtype = goodtype;
      }

      public static final String GOODID = "goodid";

      public static final String GOODNAME = "goodname";

      public static final String GOODTYPE = "goodtype";

      @Override
    public String toString() {
        return "Goods{" +
              ", goodid=" + goodid +
                  ", goodname=" + goodname +
                  ", goodtype=" + goodtype +
              "}";
    }
}
