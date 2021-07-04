package com.ruoyi.test.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 景点列表对象 listpage
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
public class Listpage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 景点名称 */
    @Excel(name = "景点名称")
    private String name;

    /** 首页图片 */
    @Excel(name = "首页图片")
    private String pic;

    /** 背景图片 */
    @Excel(name = "背景图片")
    private String bgpic;

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
    public void setPic(String pic) 
    {
        this.pic = pic;
    }

    public String getPic() 
    {
        return pic;
    }
    public void setBgpic(String bgpic) 
    {
        this.bgpic = bgpic;
    }

    public String getBgpic() 
    {
        return bgpic;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("pic", getPic())
            .append("bgpic", getBgpic())
            .toString();
    }
}
