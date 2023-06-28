package com.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName medical_record
 */
@TableName(value ="medical_record")
@Data
public class MedicalRecord implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 关联挂号表id
     */
    private Integer registerId;

    /**
     * 主诉
     */
    private String readme;

    /**
     * 现病史
     */
    private String present;

    /**
     * 现病治疗情况
     */
    private String presentTreat;

    /**
     * 既往史
     */
    private String history;

    /**
     * 过敏史
     */
    private String allergy;

    /**
     * 体格检查
     */
    private String physique;

    /**
     * 检查/检验建议
     */
    private String proposal;

    /**
     * 注意事项
     */
    private String careful;

    /**
     * 断诊结果
     */
    private String diagnosis;

    /**
     * 理处意见
     */
    private String cure;

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
        MedicalRecord other = (MedicalRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegisterId() == null ? other.getRegisterId() == null : this.getRegisterId().equals(other.getRegisterId()))
            && (this.getReadme() == null ? other.getReadme() == null : this.getReadme().equals(other.getReadme()))
            && (this.getPresent() == null ? other.getPresent() == null : this.getPresent().equals(other.getPresent()))
            && (this.getPresentTreat() == null ? other.getPresentTreat() == null : this.getPresentTreat().equals(other.getPresentTreat()))
            && (this.getHistory() == null ? other.getHistory() == null : this.getHistory().equals(other.getHistory()))
            && (this.getAllergy() == null ? other.getAllergy() == null : this.getAllergy().equals(other.getAllergy()))
            && (this.getPhysique() == null ? other.getPhysique() == null : this.getPhysique().equals(other.getPhysique()))
            && (this.getProposal() == null ? other.getProposal() == null : this.getProposal().equals(other.getProposal()))
            && (this.getCareful() == null ? other.getCareful() == null : this.getCareful().equals(other.getCareful()))
            && (this.getDiagnosis() == null ? other.getDiagnosis() == null : this.getDiagnosis().equals(other.getDiagnosis()))
            && (this.getCure() == null ? other.getCure() == null : this.getCure().equals(other.getCure()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegisterId() == null) ? 0 : getRegisterId().hashCode());
        result = prime * result + ((getReadme() == null) ? 0 : getReadme().hashCode());
        result = prime * result + ((getPresent() == null) ? 0 : getPresent().hashCode());
        result = prime * result + ((getPresentTreat() == null) ? 0 : getPresentTreat().hashCode());
        result = prime * result + ((getHistory() == null) ? 0 : getHistory().hashCode());
        result = prime * result + ((getAllergy() == null) ? 0 : getAllergy().hashCode());
        result = prime * result + ((getPhysique() == null) ? 0 : getPhysique().hashCode());
        result = prime * result + ((getProposal() == null) ? 0 : getProposal().hashCode());
        result = prime * result + ((getCareful() == null) ? 0 : getCareful().hashCode());
        result = prime * result + ((getDiagnosis() == null) ? 0 : getDiagnosis().hashCode());
        result = prime * result + ((getCure() == null) ? 0 : getCure().hashCode());
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
        sb.append(", readme=").append(readme);
        sb.append(", present=").append(present);
        sb.append(", presentTreat=").append(presentTreat);
        sb.append(", history=").append(history);
        sb.append(", allergy=").append(allergy);
        sb.append(", physique=").append(physique);
        sb.append(", proposal=").append(proposal);
        sb.append(", careful=").append(careful);
        sb.append(", diagnosis=").append(diagnosis);
        sb.append(", cure=").append(cure);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}