package com.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName register
 */
@TableName(value ="register")
@Data
public class Register implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 病历号
     */
    private String caseNumber;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 性别（男、女）
     */
    private String gender;

    /**
     * 身份证号
     */
    private String cardNumber;

    /**
     * 出生日期
     */
    private LocalDate birthday;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 年龄类型（年、天）
     */
    private String ageType;

    /**
     * 家庭住址
     */
    private String homeAddress;

    /**
     * 本次看诊日期
     */
    private LocalDateTime visitDate;

    /**
     * 午别（上午、下午）
     */
    private String noon;

    /**
     * 本次挂号科室id
     */
    private Integer deptmentId;

    /**
     * 本次挂号医生id
     */
    private Integer employeeId;

    /**
     * 本次挂号级别id
     */
    private Integer registLevelId;

    /**
     * 结算类别id
     */
    private Integer settleCategoryId;

    /**
     * 病历本要否（要、否）
     */
    private String isBook;

    /**
     * 收费方式（现金、银行卡、微信、医保卡、支付宝）
     */
    private String registMethod;

    /**
     * 本次看诊状态（1-已挂号
2-医生接诊
3-看诊结束
4-已退号）
     */
    private Integer visitState;

    /**
     * 挂号金额
     */
    private BigDecimal registMoney;

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
        Register other = (Register) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCaseNumber() == null ? other.getCaseNumber() == null : this.getCaseNumber().equals(other.getCaseNumber()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getAgeType() == null ? other.getAgeType() == null : this.getAgeType().equals(other.getAgeType()))
            && (this.getHomeAddress() == null ? other.getHomeAddress() == null : this.getHomeAddress().equals(other.getHomeAddress()))
            && (this.getVisitDate() == null ? other.getVisitDate() == null : this.getVisitDate().equals(other.getVisitDate()))
            && (this.getNoon() == null ? other.getNoon() == null : this.getNoon().equals(other.getNoon()))
            && (this.getDeptmentId() == null ? other.getDeptmentId() == null : this.getDeptmentId().equals(other.getDeptmentId()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getRegistLevelId() == null ? other.getRegistLevelId() == null : this.getRegistLevelId().equals(other.getRegistLevelId()))
            && (this.getSettleCategoryId() == null ? other.getSettleCategoryId() == null : this.getSettleCategoryId().equals(other.getSettleCategoryId()))
            && (this.getIsBook() == null ? other.getIsBook() == null : this.getIsBook().equals(other.getIsBook()))
            && (this.getRegistMethod() == null ? other.getRegistMethod() == null : this.getRegistMethod().equals(other.getRegistMethod()))
            && (this.getVisitState() == null ? other.getVisitState() == null : this.getVisitState().equals(other.getVisitState()))
            && (this.getRegistMoney() == null ? other.getRegistMoney() == null : this.getRegistMoney().equals(other.getRegistMoney()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCaseNumber() == null) ? 0 : getCaseNumber().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getAgeType() == null) ? 0 : getAgeType().hashCode());
        result = prime * result + ((getHomeAddress() == null) ? 0 : getHomeAddress().hashCode());
        result = prime * result + ((getVisitDate() == null) ? 0 : getVisitDate().hashCode());
        result = prime * result + ((getNoon() == null) ? 0 : getNoon().hashCode());
        result = prime * result + ((getDeptmentId() == null) ? 0 : getDeptmentId().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getRegistLevelId() == null) ? 0 : getRegistLevelId().hashCode());
        result = prime * result + ((getSettleCategoryId() == null) ? 0 : getSettleCategoryId().hashCode());
        result = prime * result + ((getIsBook() == null) ? 0 : getIsBook().hashCode());
        result = prime * result + ((getRegistMethod() == null) ? 0 : getRegistMethod().hashCode());
        result = prime * result + ((getVisitState() == null) ? 0 : getVisitState().hashCode());
        result = prime * result + ((getRegistMoney() == null) ? 0 : getRegistMoney().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", caseNumber=").append(caseNumber);
        sb.append(", realName=").append(realName);
        sb.append(", gender=").append(gender);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append(", ageType=").append(ageType);
        sb.append(", homeAddress=").append(homeAddress);
        sb.append(", visitDate=").append(visitDate);
        sb.append(", noon=").append(noon);
        sb.append(", deptmentId=").append(deptmentId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", registLevelId=").append(registLevelId);
        sb.append(", settleCategoryId=").append(settleCategoryId);
        sb.append(", isBook=").append(isBook);
        sb.append(", registMethod=").append(registMethod);
        sb.append(", visitState=").append(visitState);
        sb.append(", registMoney=").append(registMoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}