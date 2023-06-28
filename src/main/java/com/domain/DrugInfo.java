package com.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName drug_info
 */
@TableName(value ="drug_info")
@Data
public class DrugInfo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 品药编码（国家药品编码本位码共14位“86”，代表在我国境内生产、销售的所有药品；国家药品编码本位码类别码为“9”，代表药品；国家药品编码本位码本体码的前5位为药品企业标识）
     */
    private String drugCode;

    /**
     * 药品名称
     */
    private String drugName;

    /**
     * 品药规格
     */
    private String drugFormat;

    /**
     * 包装单位
     */
    private String drugUnit;

    /**
     * 生产厂家
     */
    private String manufacturer;

    /**
     * 药剂类型
     */
    private String drugDosage;

    /**
     * 药品类型
     */
    private String drugType;

    /**
     * 药品单价
     */
    private BigDecimal drugPrice;

    /**
     * 拼音助记码
     */
    private String mnemonicCode;

    /**
     * 创建时间
     */
    private LocalDate creationDate;

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
        DrugInfo other = (DrugInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDrugCode() == null ? other.getDrugCode() == null : this.getDrugCode().equals(other.getDrugCode()))
            && (this.getDrugName() == null ? other.getDrugName() == null : this.getDrugName().equals(other.getDrugName()))
            && (this.getDrugFormat() == null ? other.getDrugFormat() == null : this.getDrugFormat().equals(other.getDrugFormat()))
            && (this.getDrugUnit() == null ? other.getDrugUnit() == null : this.getDrugUnit().equals(other.getDrugUnit()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getDrugDosage() == null ? other.getDrugDosage() == null : this.getDrugDosage().equals(other.getDrugDosage()))
            && (this.getDrugType() == null ? other.getDrugType() == null : this.getDrugType().equals(other.getDrugType()))
            && (this.getDrugPrice() == null ? other.getDrugPrice() == null : this.getDrugPrice().equals(other.getDrugPrice()))
            && (this.getMnemonicCode() == null ? other.getMnemonicCode() == null : this.getMnemonicCode().equals(other.getMnemonicCode()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDrugCode() == null) ? 0 : getDrugCode().hashCode());
        result = prime * result + ((getDrugName() == null) ? 0 : getDrugName().hashCode());
        result = prime * result + ((getDrugFormat() == null) ? 0 : getDrugFormat().hashCode());
        result = prime * result + ((getDrugUnit() == null) ? 0 : getDrugUnit().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getDrugDosage() == null) ? 0 : getDrugDosage().hashCode());
        result = prime * result + ((getDrugType() == null) ? 0 : getDrugType().hashCode());
        result = prime * result + ((getDrugPrice() == null) ? 0 : getDrugPrice().hashCode());
        result = prime * result + ((getMnemonicCode() == null) ? 0 : getMnemonicCode().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", drugCode=").append(drugCode);
        sb.append(", drugName=").append(drugName);
        sb.append(", drugFormat=").append(drugFormat);
        sb.append(", drugUnit=").append(drugUnit);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", drugDosage=").append(drugDosage);
        sb.append(", drugType=").append(drugType);
        sb.append(", drugPrice=").append(drugPrice);
        sb.append(", mnemonicCode=").append(mnemonicCode);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}