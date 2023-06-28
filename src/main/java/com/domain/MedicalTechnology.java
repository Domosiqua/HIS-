package com.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName medical_technology
 */
@TableName(value ="medical_technology")
@Data
public class MedicalTechnology implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 项目编码
     */
    private String techCode;

    /**
     * 项目名称
     */
    private String techName;

    /**
     * 规格
     */
    private String techFormat;

    /**
     * 
     */
    private BigDecimal techPrice;

    /**
     * 
     */
    private String techType;

    /**
     * 
     */
    private String priceType;

    /**
     * 
     */
    private Integer deptmentId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MedicalTechnology other = (MedicalTechnology) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTechCode() == null ? other.getTechCode() == null : this.getTechCode().equals(other.getTechCode()))
            && (this.getTechName() == null ? other.getTechName() == null : this.getTechName().equals(other.getTechName()))
            && (this.getTechFormat() == null ? other.getTechFormat() == null : this.getTechFormat().equals(other.getTechFormat()))
            && (this.getTechPrice() == null ? other.getTechPrice() == null : this.getTechPrice().equals(other.getTechPrice()))
            && (this.getTechType() == null ? other.getTechType() == null : this.getTechType().equals(other.getTechType()))
            && (this.getPriceType() == null ? other.getPriceType() == null : this.getPriceType().equals(other.getPriceType()))
            && (this.getDeptmentId() == null ? other.getDeptmentId() == null : this.getDeptmentId().equals(other.getDeptmentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTechCode() == null) ? 0 : getTechCode().hashCode());
        result = prime * result + ((getTechName() == null) ? 0 : getTechName().hashCode());
        result = prime * result + ((getTechFormat() == null) ? 0 : getTechFormat().hashCode());
        result = prime * result + ((getTechPrice() == null) ? 0 : getTechPrice().hashCode());
        result = prime * result + ((getTechType() == null) ? 0 : getTechType().hashCode());
        result = prime * result + ((getPriceType() == null) ? 0 : getPriceType().hashCode());
        result = prime * result + ((getDeptmentId() == null) ? 0 : getDeptmentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", techCode=").append(techCode);
        sb.append(", techName=").append(techName);
        sb.append(", techFormat=").append(techFormat);
        sb.append(", techPrice=").append(techPrice);
        sb.append(", techType=").append(techType);
        sb.append(", priceType=").append(priceType);
        sb.append(", deptmentId=").append(deptmentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}