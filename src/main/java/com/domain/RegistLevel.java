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
 * @TableName regist_level
 */
@TableName(value ="regist_level")
@Data
public class RegistLevel implements Serializable {
    /**
     * ID主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 号别编码
     */
    private String registCode;

    /**
     * 号别名称
     */
    private String registName;

    /**
     * 挂号费
     */
    private BigDecimal registFee;

    /**
     * 挂号限额
     */
    private Integer registQuota;

    /**
     * 显示顺序号
     */
    private Integer sequenceNo;

    /**
     * 删除标记
     */
    private Integer delmark;

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
        RegistLevel other = (RegistLevel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegistCode() == null ? other.getRegistCode() == null : this.getRegistCode().equals(other.getRegistCode()))
            && (this.getRegistName() == null ? other.getRegistName() == null : this.getRegistName().equals(other.getRegistName()))
            && (this.getRegistFee() == null ? other.getRegistFee() == null : this.getRegistFee().equals(other.getRegistFee()))
            && (this.getRegistQuota() == null ? other.getRegistQuota() == null : this.getRegistQuota().equals(other.getRegistQuota()))
            && (this.getSequenceNo() == null ? other.getSequenceNo() == null : this.getSequenceNo().equals(other.getSequenceNo()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegistCode() == null) ? 0 : getRegistCode().hashCode());
        result = prime * result + ((getRegistName() == null) ? 0 : getRegistName().hashCode());
        result = prime * result + ((getRegistFee() == null) ? 0 : getRegistFee().hashCode());
        result = prime * result + ((getRegistQuota() == null) ? 0 : getRegistQuota().hashCode());
        result = prime * result + ((getSequenceNo() == null) ? 0 : getSequenceNo().hashCode());
        result = prime * result + ((getDelmark() == null) ? 0 : getDelmark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", registCode=").append(registCode);
        sb.append(", registName=").append(registName);
        sb.append(", registFee=").append(registFee);
        sb.append(", registQuota=").append(registQuota);
        sb.append(", sequenceNo=").append(sequenceNo);
        sb.append(", delmark=").append(delmark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}