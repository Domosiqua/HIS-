package com.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName disease
 */
@TableName(value ="disease")
@Data
public class Disease implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 疾病助记编码
     */
    private String diseaseCode;

    /**
     * 疾病名称
     */
    private String diseaseName;

    /**
     * 国际ICD编码
     */
    private String diseaseicd;

    /**
     * 疾病所属分类
     */
    private String diseaseCategory;

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
        Disease other = (Disease) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDiseaseCode() == null ? other.getDiseaseCode() == null : this.getDiseaseCode().equals(other.getDiseaseCode()))
            && (this.getDiseaseName() == null ? other.getDiseaseName() == null : this.getDiseaseName().equals(other.getDiseaseName()))
            && (this.getDiseaseicd() == null ? other.getDiseaseicd() == null : this.getDiseaseicd().equals(other.getDiseaseicd()))
            && (this.getDiseaseCategory() == null ? other.getDiseaseCategory() == null : this.getDiseaseCategory().equals(other.getDiseaseCategory()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDiseaseCode() == null) ? 0 : getDiseaseCode().hashCode());
        result = prime * result + ((getDiseaseName() == null) ? 0 : getDiseaseName().hashCode());
        result = prime * result + ((getDiseaseicd() == null) ? 0 : getDiseaseicd().hashCode());
        result = prime * result + ((getDiseaseCategory() == null) ? 0 : getDiseaseCategory().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", diseaseCode=").append(diseaseCode);
        sb.append(", diseaseName=").append(diseaseName);
        sb.append(", diseaseicd=").append(diseaseicd);
        sb.append(", diseaseCategory=").append(diseaseCategory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}