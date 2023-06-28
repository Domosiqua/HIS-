package com.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName settle_category
 */
@TableName(value ="settle_category")
@Data
public class SettleCategory implements Serializable {
    /**
     * ID主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 类别编码
     */
    private String settleCode;

    /**
     * 类别名称
     */
    private String settleName;

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
        SettleCategory other = (SettleCategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSettleCode() == null ? other.getSettleCode() == null : this.getSettleCode().equals(other.getSettleCode()))
            && (this.getSettleName() == null ? other.getSettleName() == null : this.getSettleName().equals(other.getSettleName()))
            && (this.getSequenceNo() == null ? other.getSequenceNo() == null : this.getSequenceNo().equals(other.getSequenceNo()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSettleCode() == null) ? 0 : getSettleCode().hashCode());
        result = prime * result + ((getSettleName() == null) ? 0 : getSettleName().hashCode());
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
        sb.append(", settleCode=").append(settleCode);
        sb.append(", settleName=").append(settleName);
        sb.append(", sequenceNo=").append(sequenceNo);
        sb.append(", delmark=").append(delmark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}