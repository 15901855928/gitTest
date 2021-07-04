package com.ruoyi.test.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 景区详情对象 detail2
 * 
 * @author ruoyi
 * @date 2021-04-09
 */
public class Detail2 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 中文详情 */
    @Excel(name = "中文详情")
    private String cndetail;

    /** 英文详情 */
    @Excel(name = "英文详情")
    private String endetail;

    /** markerid */
    @Excel(name = "markerid")
    private Long markerid;

    /** 中文标题 */
    @Excel(name = "中文标题")
    private String cntitle;

    /** 英文标题 */
    @Excel(name = "英文标题")
    private String entitle;

    /** 图标 */
    @Excel(name = "图标")
    private String icon;

    /** 图片1 */
    @Excel(name = "图片1")
    private String pic1;

    /** 图片2 */
    @Excel(name = "图片2")
    private String pic2;

    /** 图片3 */
    @Excel(name = "图片3")
    private String pic3;

    /** 图片4 */
    @Excel(name = "图片4")
    private String pic4;

    /** 图片5 */
    @Excel(name = "图片5")
    private String pic5;

    /** 背景图片 */
    @Excel(name = "背景图片")
    private String bgpic;

    /** 中文语音 */
    @Excel(name = "中文语音")
    private String soundcn;

    /** 英文语音 */
    @Excel(name = "英文语音")
    private String sounden;

    /** 香港语音 */
    @Excel(name = "香港语音")
    private String soundhk;

    /** 经度 */
    @Excel(name = "经度")
    private String lontitude;

    /** 纬度 */
    @Excel(name = "纬度")
    private String latitude;

    /** 类别 */
    @Excel(name = "类别")
    private Long type;

    /** 标题背景 */
    @Excel(name = "标题背景")
    private String titlebg;

    /** 剪影图片 */
    @Excel(name = "剪影图片")
    private String cardimg;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCndetail(String cndetail) 
    {
        this.cndetail = cndetail;
    }

    public String getCndetail() 
    {
        return cndetail;
    }
    public void setEndetail(String endetail) 
    {
        this.endetail = endetail;
    }

    public String getEndetail() 
    {
        return endetail;
    }
    public void setMarkerid(Long markerid) 
    {
        this.markerid = markerid;
    }

    public Long getMarkerid() 
    {
        return markerid;
    }
    public void setCntitle(String cntitle) 
    {
        this.cntitle = cntitle;
    }

    public String getCntitle() 
    {
        return cntitle;
    }
    public void setEntitle(String entitle) 
    {
        this.entitle = entitle;
    }

    public String getEntitle() 
    {
        return entitle;
    }
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }
    public void setPic1(String pic1) 
    {
        this.pic1 = pic1;
    }

    public String getPic1() 
    {
        return pic1;
    }
    public void setPic2(String pic2) 
    {
        this.pic2 = pic2;
    }

    public String getPic2() 
    {
        return pic2;
    }
    public void setPic3(String pic3) 
    {
        this.pic3 = pic3;
    }

    public String getPic3() 
    {
        return pic3;
    }
    public void setPic4(String pic4) 
    {
        this.pic4 = pic4;
    }

    public String getPic4() 
    {
        return pic4;
    }
    public void setPic5(String pic5) 
    {
        this.pic5 = pic5;
    }

    public String getPic5() 
    {
        return pic5;
    }
    public void setBgpic(String bgpic) 
    {
        this.bgpic = bgpic;
    }

    public String getBgpic() 
    {
        return bgpic;
    }
    public void setSoundcn(String soundcn) 
    {
        this.soundcn = soundcn;
    }

    public String getSoundcn() 
    {
        return soundcn;
    }
    public void setSounden(String sounden) 
    {
        this.sounden = sounden;
    }

    public String getSounden() 
    {
        return sounden;
    }
    public void setSoundhk(String soundhk) 
    {
        this.soundhk = soundhk;
    }

    public String getSoundhk() 
    {
        return soundhk;
    }
    public void setLontitude(String lontitude) 
    {
        this.lontitude = lontitude;
    }

    public String getLontitude() 
    {
        return lontitude;
    }
    public void setLatitude(String latitude) 
    {
        this.latitude = latitude;
    }

    public String getLatitude() 
    {
        return latitude;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setTitlebg(String titlebg) 
    {
        this.titlebg = titlebg;
    }

    public String getTitlebg() 
    {
        return titlebg;
    }
    public void setCardimg(String cardimg) 
    {
        this.cardimg = cardimg;
    }

    public String getCardimg() 
    {
        return cardimg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cndetail", getCndetail())
            .append("endetail", getEndetail())
            .append("markerid", getMarkerid())
            .append("cntitle", getCntitle())
            .append("entitle", getEntitle())
            .append("icon", getIcon())
            .append("pic1", getPic1())
            .append("pic2", getPic2())
            .append("pic3", getPic3())
            .append("pic4", getPic4())
            .append("pic5", getPic5())
            .append("bgpic", getBgpic())
            .append("soundcn", getSoundcn())
            .append("sounden", getSounden())
            .append("soundhk", getSoundhk())
            .append("lontitude", getLontitude())
            .append("latitude", getLatitude())
            .append("type", getType())
            .append("titlebg", getTitlebg())
            .append("cardimg", getCardimg())
            .toString();
    }
}
