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
@TableName("image")
public class Image implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "imageid", type = IdType.AUTO)
      private Integer imageid;

    @TableField("imgurl")
    private String imgurl;

    
    public Integer getImageid() {
        return imageid;
    }

      public void setImageid(Integer imageid) {
          this.imageid = imageid;
      }
    
    public String getImgurl() {
        return imgurl;
    }

      public void setImgurl(String imgurl) {
          this.imgurl = imgurl;
      }

      public static final String IMAGEID = "imageid";

      public static final String IMGURL = "imgurl";

      @Override
    public String toString() {
        return "Image{" +
              ", imageid=" + imageid +
                  ", imgurl=" + imgurl +
              "}";
    }
}
