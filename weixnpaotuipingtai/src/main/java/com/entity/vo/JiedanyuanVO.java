package com.entity.vo;

import com.entity.JiedanyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 跑腿员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiedanyuan")
public class JiedanyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 跑腿员姓名
     */

    @TableField(value = "jiedanyuan_name")
    private String jiedanyuanName;


    /**
     * 头像
     */

    @TableField(value = "jiedanyuan_photo")
    private String jiedanyuanPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 联系方式
     */

    @TableField(value = "jiedanyuan_phone")
    private String jiedanyuanPhone;


    /**
     * 邮箱
     */

    @TableField(value = "jiedanyuan_email")
    private String jiedanyuanEmail;


    /**
     * 工资
     */

    @TableField(value = "new_money")
    private Double newMoney;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：跑腿员姓名
	 */
    public String getJiedanyuanName() {
        return jiedanyuanName;
    }


    /**
	 * 获取：跑腿员姓名
	 */

    public void setJiedanyuanName(String jiedanyuanName) {
        this.jiedanyuanName = jiedanyuanName;
    }
    /**
	 * 设置：头像
	 */
    public String getJiedanyuanPhoto() {
        return jiedanyuanPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setJiedanyuanPhoto(String jiedanyuanPhoto) {
        this.jiedanyuanPhoto = jiedanyuanPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getJiedanyuanPhone() {
        return jiedanyuanPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setJiedanyuanPhone(String jiedanyuanPhone) {
        this.jiedanyuanPhone = jiedanyuanPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getJiedanyuanEmail() {
        return jiedanyuanEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setJiedanyuanEmail(String jiedanyuanEmail) {
        this.jiedanyuanEmail = jiedanyuanEmail;
    }
    /**
	 * 设置：工资
	 */
    public Double getNewMoney() {
        return newMoney;
    }


    /**
	 * 获取：工资
	 */

    public void setNewMoney(Double newMoney) {
        this.newMoney = newMoney;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
