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
 * @TableName inspection_request
 */
@TableName(value ="inspection_request")
@Data
public class InspectionRequest implements Serializable {
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
     * åŒ»æŠ€é¡¹ç›®id
     */
    private Integer medicalTechnologyId;

    /**
     * 目的要求
     */
    private String inspectionInfo;

    /**
     * 检查部位
     */
    private String inspectionPosition;

    /**
     * 开立时间
     */
    private LocalDateTime creationTime;

    /**
     * 检验人员id
     */
    private Integer inspectionEmployeeId;

    /**
     * 结果录入人员id
     */
    private Integer inputinspectionEmployeeId;

    /**
     * 检验时间
     */
    private LocalDateTime inspectionTime;

    /**
     * 检验结果
     */
    private String inspectionResult;

    /**
     * 状态(已开立,已缴费,执行完成,已出结果,已退费,已作废)
     */
    private String inspectionState;

    /**
     * 备注
     */
    private String inspectionRemark;

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
        InspectionRequest other = (InspectionRequest) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegisterId() == null ? other.getRegisterId() == null : this.getRegisterId().equals(other.getRegisterId()))
            && (this.getMedicalTechnologyId() == null ? other.getMedicalTechnologyId() == null : this.getMedicalTechnologyId().equals(other.getMedicalTechnologyId()))
            && (this.getInspectionInfo() == null ? other.getInspectionInfo() == null : this.getInspectionInfo().equals(other.getInspectionInfo()))
            && (this.getInspectionPosition() == null ? other.getInspectionPosition() == null : this.getInspectionPosition().equals(other.getInspectionPosition()))
            && (this.getCreationTime() == null ? other.getCreationTime() == null : this.getCreationTime().equals(other.getCreationTime()))
            && (this.getInspectionEmployeeId() == null ? other.getInspectionEmployeeId() == null : this.getInspectionEmployeeId().equals(other.getInspectionEmployeeId()))
            && (this.getInputinspectionEmployeeId() == null ? other.getInputinspectionEmployeeId() == null : this.getInputinspectionEmployeeId().equals(other.getInputinspectionEmployeeId()))
            && (this.getInspectionTime() == null ? other.getInspectionTime() == null : this.getInspectionTime().equals(other.getInspectionTime()))
            && (this.getInspectionResult() == null ? other.getInspectionResult() == null : this.getInspectionResult().equals(other.getInspectionResult()))
            && (this.getInspectionState() == null ? other.getInspectionState() == null : this.getInspectionState().equals(other.getInspectionState()))
            && (this.getInspectionRemark() == null ? other.getInspectionRemark() == null : this.getInspectionRemark().equals(other.getInspectionRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegisterId() == null) ? 0 : getRegisterId().hashCode());
        result = prime * result + ((getMedicalTechnologyId() == null) ? 0 : getMedicalTechnologyId().hashCode());
        result = prime * result + ((getInspectionInfo() == null) ? 0 : getInspectionInfo().hashCode());
        result = prime * result + ((getInspectionPosition() == null) ? 0 : getInspectionPosition().hashCode());
        result = prime * result + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        result = prime * result + ((getInspectionEmployeeId() == null) ? 0 : getInspectionEmployeeId().hashCode());
        result = prime * result + ((getInputinspectionEmployeeId() == null) ? 0 : getInputinspectionEmployeeId().hashCode());
        result = prime * result + ((getInspectionTime() == null) ? 0 : getInspectionTime().hashCode());
        result = prime * result + ((getInspectionResult() == null) ? 0 : getInspectionResult().hashCode());
        result = prime * result + ((getInspectionState() == null) ? 0 : getInspectionState().hashCode());
        result = prime * result + ((getInspectionRemark() == null) ? 0 : getInspectionRemark().hashCode());
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
        sb.append(", inspectionInfo=").append(inspectionInfo);
        sb.append(", inspectionPosition=").append(inspectionPosition);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", inspectionEmployeeId=").append(inspectionEmployeeId);
        sb.append(", inputinspectionEmployeeId=").append(inputinspectionEmployeeId);
        sb.append(", inspectionTime=").append(inspectionTime);
        sb.append(", inspectionResult=").append(inspectionResult);
        sb.append(", inspectionState=").append(inspectionState);
        sb.append(", inspectionRemark=").append(inspectionRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}