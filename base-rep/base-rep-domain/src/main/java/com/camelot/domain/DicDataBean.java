package com.camelot.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * <p>Description: [字典数据表]</p>
 * Created on 2016年3月25日
 * @author  <a href="mailto: liuchao@camelotchina.com">刘超</a>
 * @version 1.0 
 * Copyright (c) 2016 北京柯莱特科技有限公司 交付部 
 * 数据结构例如：
 * 			1级------》dicName:商家类型   dicIdentify:sjlx
 * 			2级------》dicName:生产           2级------》dicName:代理    
 * 			2级------》dicName:授权经销           2级------》dicName:普通经销
 * 界面展示例如：
 * 			商家类型：  生产	代理	授权经销  普通经销
 * 查询方式：
 * 			通过一级节点唯一标识符查询二级节点
 * 			如果有三级节点就通过pid字段查询
 * 			以此类推	   
 */ 
public class DicDataBean implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * <p>Discription:[主键]</p>
     */
    private Long dicId;

    /**
     * <p>Discription:[父级节点id]</p>
     */
    private Long pid;

    /**
     * <p>Discription:[字典名称]</p>
     */
    private String dicName;

    /**
     * <p>Discription:[一级节点唯一标识符]</p>
     */
    private String dicIdentify;

    /**
     * <p>Discription:[字典说明]</p>
     */
    private String dicDemo;

    /**
     * <p>Discription:[创建时间]</p>
     */
    private Date createDt;

    /**
     * <p>Discription:[创建人]</p>
     */
    private Long createBy;

    /**
     * <p>Discription:[修改时间]</p>
     */
    private Date modifyDt;

    /**
     * <p>Discription:[修改人]</p>
     */
    private Long modifyBy;

    /**
     * <p>Discription:[删除标识符]</p>
     */
    private Boolean delFlag;

    private String dicCode;//字典code

    public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode;
    }

    public Long getDicId() {
        return dicId;
    }

    public void setDicId(Long dicId) {
        this.dicId = dicId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName;
    }

    public String getDicIdentify() {
        return dicIdentify;
    }

    public void setDicIdentify(String dicIdentify) {
        this.dicIdentify = dicIdentify;
    }

    public String getDicDemo() {
        return dicDemo;
    }

    public void setDicDemo(String dicDemo) {
        this.dicDemo = dicDemo;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getModifyDt() {
        return modifyDt;
    }

    public void setModifyDt(Date modifyDt) {
        this.modifyDt = modifyDt;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}