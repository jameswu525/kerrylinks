package com.ruoyi.project.kerry_bu.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 楼盘对象 kerry_building
 * 
 * @author ruoyi
 * @date 2020-07-01
 */
public class KerryBuilding extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 编号 */
    @Excel(name = "编号")
    private Long no;

    /** 楼盘名 */
    @Excel(name = "楼盘名")
    private String name;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "地址", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "地址", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    /** $column.columnComment */
    @Excel(name = "地址")
    private String remarks;

    /** $column.columnComment */
    private String delFlag;

    /** 可上报的销售额天数 */
    @Excel(name = "可上报的销售额天数")
    private Long countDay;

    /** 是否需要上传图片 */
    @Excel(name = "是否需要上传图片")
    private String isUploadImg;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNo(Long no) 
    {
        this.no = no;
    }

    public Long getNo() 
    {
        return no;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setUpdateDate(Date updateDate) 
    {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate() 
    {
        return updateDate;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setCountDay(Long countDay) 
    {
        this.countDay = countDay;
    }

    public Long getCountDay() 
    {
        return countDay;
    }
    public void setIsUploadImg(String isUploadImg) 
    {
        this.isUploadImg = isUploadImg;
    }

    public String getIsUploadImg() 
    {
        return isUploadImg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("no", getNo())
            .append("name", getName())
            .append("address", getAddress())
            .append("createBy", getCreateBy())
            .append("createDate", getCreateDate())
            .append("updateBy", getUpdateBy())
            .append("updateDate", getUpdateDate())
            .append("remarks", getRemarks())
            .append("delFlag", getDelFlag())
            .append("countDay", getCountDay())
            .append("isUploadImg", getIsUploadImg())
            .toString();
    }
}
