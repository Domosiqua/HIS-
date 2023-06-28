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
 * @TableName disposal_request
 */
@TableName(value ="disposal_request")
@Data
public class DisposalRequest implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer registerId;

    /**
     * 
     */
    private Integer medicalTechnologyId;

    /**
     * 
     */
    private String disposalInfo;

    /**
     * 
     */
    private String disposalPosition;

    /**
     * 
     */
    private LocalDateTime creationTime;

    /**
     * 
     */
    private Integer disposalEmployeeId;

    /**
     * 
     */
    private Integer inputdisposalEmployeeId;

    /**
     * 
     */
    private LocalDateTime disposalTime;

    /**
     * 
     */
    private String disposalResult;

    /**
     * 
     */
    private String disposalState;

    /**
     * 
     */
    private String disposalRemark;

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
        DisposalRequest other = (DisposalRequest) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegisterId() == null ? other.getRegisterId() == null : this.getRegisterId().equals(other.getRegisterId()))
            && (this.getMedicalTechnologyId() == null ? other.getMedicalTechnologyId() == null : this.getMedicalTechnologyId().equals(other.getMedicalTechnologyId()))
            && (this.getDisposalInfo() == null ? other.getDisposalInfo() == null : this.getDisposalInfo().equals(other.getDisposalInfo()))
            && (this.getDisposalPosition() == null ? other.getDisposalPosition() == null : this.getDisposalPosition().equals(other.getDisposalPosition()))
            && (this.getCreationTime() == null ? other.getCreationTime() == null : this.getCreationTime().equals(other.getCreationTime()))
            && (this.getDisposalEmployeeId() == null ? other.getDisposalEmployeeId() == null : this.getDisposalEmployeeId().equals(other.getDisposalEmployeeId()))
            && (this.getInputdisposalEmployeeId() == null ? other.getInputdisposalEmployeeId() == null : this.getInputdisposalEmployeeId().equals(other.getInputdisposalEmployeeId()))
            && (this.getDisposalTime() == null ? other.getDisposalTime() == null : this.getDisposalTime().equals(other.getDisposalTime()))
            && (this.getDisposalResult() == null ? other.getDisposalResult() == null : this.getDisposalResult().equals(other.getDisposalResult()))
            && (this.getDisposalState() == null ? other.getDisposalState() == null : this.getDisposalState().equals(other.getDisposalState()))
            && (this.getDisposalRemark() == null ? other.getDisposalRemark() == null : this.getDisposalRemark().equals(other.getDisposalRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegisterId() == null) ? 0 : getRegisterId().hashCode());
        result = prime * result + ((getMedicalTechnologyId() == null) ? 0 : getMedicalTechnologyId().hashCode());
        result = prime * result + ((getDisposalInfo() == null) ? 0 : getDisposalInfo().hashCode());
        result = prime * result + ((getDisposalPosition() == null) ? 0 : getDisposalPosition().hashCode());
        result = prime * result + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        result = prime * result + ((getDisposalEmployeeId() == null) ? 0 : getDisposalEmployeeId().hashCode());
        result = prime * result + ((getInputdisposalEmployeeId() == null) ? 0 : getInputdisposalEmployeeId().hashCode());
        result = prime * result + ((getDisposalTime() == null) ? 0 : getDisposalTime().hashCode());
        result = prime * result + ((getDisposalResult() == null) ? 0 : getDisposalResult().hashCode());
        result = prime * result + ((getDisposalState() == null) ? 0 : getDisposalState().hashCode());
        result = prime * result + ((getDisposalRemark() == null) ? 0 : getDisposalRemark().hashCode());
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
        sb.append(", medicalTechnologyId=").append(medicalTechnologyId);
        sb.append(", disposalInfo=").append(disposalInfo);
        sb.append(", disposalPosition=").append(disposalPosition);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", disposalEmployeeId=").append(disposalEmployeeId);
        sb.append(", inputdisposalEmployeeId=").append(inputdisposalEmployeeId);
        sb.append(", disposalTime=").append(disposalTime);
        sb.append(", disposalResult=").append(disposalResult);
        sb.append(", disposalState=").append(disposalState);
        sb.append(", disposalRemark=").append(disposalRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}