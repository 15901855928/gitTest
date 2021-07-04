package com.ruoyi.test.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 类目详情对象 servericon
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
public class Servericon extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 类别 */
    @Excel(name = "类别")
    private Long type;

    /** 类目名称 */
    @Excel(name = "类目名称")
    private String name;

    /** 图标 */
    @Excel(name = "图标")
    private String icon;

    /** id */
    @Excel(name = "id")
    private Long id;

    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }
    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("type", getType())
            .append("name", getName())
            .append("icon", getIcon())
            .append("id", getId())
            .toString();
    }
}
