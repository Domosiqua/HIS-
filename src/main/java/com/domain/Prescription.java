package com.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName prescription
 */
@TableName(value ="prescription")
@Data
public class Prescription implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 挂号id
     */
    private Integer registerId;

    /**
     * 药品id
     */
    private Integer drugId;

    /**
     * 用法用量和频次
     */
    private String drugUsage;

    /**
     * 数量
     */
    private Integer drugNumber;

    /**
     * 开立时间
     */
    private LocalDateTime creationTime;

    /**
     * 状态(已开立、已缴费、已发药、已退药、已退费)
     */
    private String drugState;

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
        Prescription other = (Prescription) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegisterId() == null ? other.getRegisterId() == null : this.getRegisterId().equals(other.getRegisterId()))
            && (this.getDrugId() == null ? other.getDrugId() == null : this.getDrugId().equals(other.getDrugId()))
            && (this.getDrugUsage() == null ? other.getDrugUsage() == null : this.getDrugUsage().equals(other.getDrugUsage()))
            && (this.getDrugNumber() == null ? other.getDrugNumber() == null : this.getDrugNumber().equals(other.getDrugNumber()))
            && (this.getCreationTime() == null ? other.getCreationTime() == null : this.getCreationTime().equals(other.getCreationTime()))
            && (this.getDrugState() == null ? other.getDrugState() == null : this.getDrugState().equals(other.getDrugState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegisterId() == null) ? 0 : getRegisterId().hashCode());
        result = prime * result + ((getDrugId() == null) ? 0 : getDrugId().hashCode());
        result = prime * result + ((getDrugUsage() == null) ? 0 : getDrugUsage().hashCode());
        result = prime * result + ((getDrugNumber() == null) ? 0 : getDrugNumber().hashCode());
        result = prime * result + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        result = prime * result + ((getDrugState() == null) ? 0 : getDrugState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", registerId=").append(registerId);
        sb.append(", drugId=").append(drugId);
        sb.append(", drugUsage=").append(drugUsage);
        sb.append(", drugNumber=").append(drugNumber);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", drugState=").append(drugState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}