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
 * @TableName check_request
 */
@TableName(value ="check_request")
@Data
public class CheckRequest implements Serializable {
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
    private String checkInfo;

    /**
     * 
     */
    private String checkPosition;

    /**
     * 
     */
    private LocalDateTime creationTime;

    /**
     * 查检医生id
     */
    private Integer checkEmployeeId;

    /**
     * 结果输入医生id
     */
    private Integer inputcheckEmployeeId;

    /**
     * 检查时间
     */
    private LocalDateTime checkTime;

    /**
     * 结果
     */
    private String checkResult;

    /**
     * 状态(已开立,已缴费,执行完成,已出结果,已退费,已作废)
     */
    private String checkState;

    /**
     * 
     */
    private String checkRemark;

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
        CheckRequest other = (CheckRequest) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegisterId() == null ? other.getRegisterId() == null : this.getRegisterId().equals(other.getRegisterId()))
            && (this.getMedicalTechnologyId() == null ? other.getMedicalTechnologyId() == null : this.getMedicalTechnologyId().equals(other.getMedicalTechnologyId()))
            && (this.getCheckInfo() == null ? other.getCheckInfo() == null : this.getCheckInfo().equals(other.getCheckInfo()))
            && (this.getCheckPosition() == null ? other.getCheckPosition() == null : this.getCheckPosition().equals(other.getCheckPosition()))
            && (this.getCreationTime() == null ? other.getCreationTime() == null : this.getCreationTime().equals(other.getCreationTime()))
            && (this.getCheckEmployeeId() == null ? other.getCheckEmployeeId() == null : this.getCheckEmployeeId().equals(other.getCheckEmployeeId()))
            && (this.getInputcheckEmployeeId() == null ? other.getInputcheckEmployeeId() == null : this.getInputcheckEmployeeId().equals(other.getInputcheckEmployeeId()))
            && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()))
            && (this.getCheckResult() == null ? other.getCheckResult() == null : this.getCheckResult().equals(other.getCheckResult()))
            && (this.getCheckState() == null ? other.getCheckState() == null : this.getCheckState().equals(other.getCheckState()))
            && (this.getCheckRemark() == null ? other.getCheckRemark() == null : this.getCheckRemark().equals(other.getCheckRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegisterId() == null) ? 0 : getRegisterId().hashCode());
        result = prime * result + ((getMedicalTechnologyId() == null) ? 0 : getMedicalTechnologyId().hashCode());
        result = prime * result + ((getCheckInfo() == null) ? 0 : getCheckInfo().hashCode());
        result = prime * result + ((getCheckPosition() == null) ? 0 : getCheckPosition().hashCode());
        result = prime * result + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        result = prime * result + ((getCheckEmployeeId() == null) ? 0 : getCheckEmployeeId().hashCode());
        result = prime * result + ((getInputcheckEmployeeId() == null) ? 0 : getInputcheckEmployeeId().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        result = prime * result + ((getCheckResult() == null) ? 0 : getCheckResult().hashCode());
        result = prime * result + ((getCheckState() == null) ? 0 : getCheckState().hashCode());
        result = prime * result + ((getCheckRemark() == null) ? 0 : getCheckRemark().hashCode());
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
        sb.append(", checkInfo=").append(checkInfo);
        sb.append(", checkPosition=").append(checkPosition);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", checkEmployeeId=").append(checkEmployeeId);
        sb.append(", inputcheckEmployeeId=").append(inputcheckEmployeeId);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", checkResult=").append(checkResult);
        sb.append(", checkState=").append(checkState);
        sb.append(", checkRemark=").append(checkRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}