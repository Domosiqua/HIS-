package com.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName employee
 */
@TableName(value ="employee")
@Data
public class Employee implements Serializable {
    /**
     * ID主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 密码
     */
    private String password;

    /**
     * 所在科室ID
     */
    private Integer deptmentId;

    /**
     * 挂号级别ID
     */
    private Integer registLevelId;

    /**
     * 班排id
     */
    private Integer schedulingId;

    /**
     * 生效标记
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
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getDeptmentId() == null ? other.getDeptmentId() == null : this.getDeptmentId().equals(other.getDeptmentId()))
            && (this.getRegistLevelId() == null ? other.getRegistLevelId() == null : this.getRegistLevelId().equals(other.getRegistLevelId()))
            && (this.getSchedulingId() == null ? other.getSchedulingId() == null : this.getSchedulingId().equals(other.getSchedulingId()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getDeptmentId() == null) ? 0 : getDeptmentId().hashCode());
        result = prime * result + ((getRegistLevelId() == null) ? 0 : getRegistLevelId().hashCode());
        result = prime * result + ((getSchedulingId() == null) ? 0 : getSchedulingId().hashCode());
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
        sb.append(", realname=").append(realname);
        sb.append(", password=").append(password);
        sb.append(", deptmentId=").append(deptmentId);
        sb.append(", registLevelId=").append(registLevelId);
        sb.append(", schedulingId=").append(schedulingId);
        sb.append(", delmark=").append(delmark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}