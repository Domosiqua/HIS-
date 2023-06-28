package com.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName medical_record_disease
 */
@TableName(value ="medical_record_disease")
@Data
public class MedicalRecordDisease implements Serializable {
    /**
     * 病历id
     */
    private Integer medicalRecordId;

    /**
     * 疾病id
     */
    private Integer diseaseId;

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
        MedicalRecordDisease other = (MedicalRecordDisease) that;
        return (this.getMedicalRecordId() == null ? other.getMedicalRecordId() == null : this.getMedicalRecordId().equals(other.getMedicalRecordId()))
            && (this.getDiseaseId() == null ? other.getDiseaseId() == null : this.getDiseaseId().equals(other.getDiseaseId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMedicalRecordId() == null) ? 0 : getMedicalRecordId().hashCode());
        result = prime * result + ((getDiseaseId() == null) ? 0 : getDiseaseId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", medicalRecordId=").append(medicalRecordId);
        sb.append(", diseaseId=").append(diseaseId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}