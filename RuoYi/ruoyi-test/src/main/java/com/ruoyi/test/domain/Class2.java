package com.ruoyi.test.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商铺类别详情对象 class2
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
public class Class2 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String name;

    /** 子名称 */
    @Excel(name = "子名称")
    private String childname;

    /** 商铺图片 */
    @Excel(name = "商铺图片")
    private String childpic;

    /** 类别图标 */
    @Excel(name = "类别图标")
    private String pic;

    /** 子经纬度 */
    @Excel(name = "子经纬度")
    private String childlonlat;

    /** 类别 */
    @Excel(name = "类别")
    private Long type;

    /** 位置经度 */
    @Excel(name = "位置经度")
    private String lon;

    /** 位置纬度 */
    @Excel(name = "位置纬度")
    private String lat;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setChildname(String childname) 
    {
        this.childname = childname;
    }

    public String getChildname() 
    {
        return childname;
    }
    public void setChildpic(String childpic) 
    {
        this.childpic = childpic;
    }

    public String getChildpic() 
    {
        return childpic;
    }
    public void setPic(String pic) 
    {
        this.pic = pic;
    }

    public String getPic() 
    {
        return pic;
    }
    public void setChildlonlat(String childlonlat) 
    {
        this.childlonlat = childlonlat;
    }

    public String getChildlonlat() 
    {
        return childlonlat;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setLon(String lon) 
    {
        this.lon = lon;
    }

    public String getLon() 
    {
        return lon;
    }
    public void setLat(String lat) 
    {
        this.lat = lat;
    }

    public String getLat() 
    {
        return lat;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("childname", getChildname())
            .append("childpic", getChildpic())
            .append("pic", getPic())
            .append("childlonlat", getChildlonlat())
            .append("type", getType())
            .append("lon", getLon())
            .append("lat", getLat())
            .toString();
    }
}
