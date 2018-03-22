/**  

* Title: LinkMan.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月22日  

* @version 1.0  

*/
package cn.itheima.domain;

/**  

* Title: LinkMan  

* Description: 联系人  

* @author 172219902  

* @date 2018年3月22日  

*/
public class LinkMan {
	/*
	 * CREATE TABLE `cst_linkman` (
	  `lkm_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '联系人编号(主键)',
	  `lkm_name` varchar(16) DEFAULT NULL COMMENT '联系人姓名',
	  
	  `lkm_gender` char(1) DEFAULT NULL COMMENT '联系人性别',
	  `lkm_phone` varchar(16) DEFAULT NULL COMMENT '联系人办公电话',
	  `lkm_mobile` varchar(16) DEFAULT NULL COMMENT '联系人手机',
	  `lkm_email` varchar(64) DEFAULT NULL COMMENT '联系人邮箱',
	  `lkm_qq` varchar(16) DEFAULT NULL COMMENT '联系人qq',
	  `lkm_position` varchar(16) DEFAULT NULL COMMENT '联系人职位',
	  `lkm_memo` varchar(512) DEFAULT NULL COMMENT '联系人备注',
	  PRIMARY KEY (`lkm_id`),
	  KEY `FK_cst_linkman_lkm_cust_id` (`lkm_cust_id`),
	  CONSTRAINT `FK_cst_linkman_lkm_cust_id` FOREIGN KEY (`lkm_cust_id`) REFERENCES `cst_customer` (`cust_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
	) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
	 */
	private Long lkm_id;
	private Character lk_gender;
	private String lkm_name;
	private String lkm_phone;
	private String lkm_mobile;
	private String lkm_email;
	private String lkm_qq;
	private String lkm_position;
	private String lkm_memo;
	//表达多对一关系
	private Customer customer;
	
	//-------------------------
	//不与数据库中的列对应，只为了接收表单参数
	private Long cust_id;
	//-------------------------
	/**
	 * @return the lkm_id
	 */
	public Long getLkm_id() {
		return lkm_id;
	}
	/**
	 * @param lkm_id the lkm_id to set
	 */
	public void setLkm_id(Long lkm_id) {
		this.lkm_id = lkm_id;
	}
	/**
	 * @return the lk_gender
	 */
	public Character getLk_gender() {
		return lk_gender;
	}
	/**
	 * @param lk_gender the lk_gender to set
	 */
	public void setLk_gender(Character lk_gender) {
		this.lk_gender = lk_gender;
	}
	/**
	 * @return the lkm_name
	 */
	public String getLkm_name() {
		return lkm_name;
	}
	/**
	 * @param lkm_name the lkm_name to set
	 */
	public void setLkm_name(String lkm_name) {
		this.lkm_name = lkm_name;
	}
	/**
	 * @return the lkm_phone
	 */
	public String getLkm_phone() {
		return lkm_phone;
	}
	/**
	 * @param lkm_phone the lkm_phone to set
	 */
	public void setLkm_phone(String lkm_phone) {
		this.lkm_phone = lkm_phone;
	}
	/**
	 * @return the lkm_mobile
	 */
	public String getLkm_mobile() {
		return lkm_mobile;
	}
	/**
	 * @param lkm_mobile the lkm_mobile to set
	 */
	public void setLkm_mobile(String lkm_mobile) {
		this.lkm_mobile = lkm_mobile;
	}
	/**
	 * @return the lkm_email
	 */
	public String getLkm_email() {
		return lkm_email;
	}
	/**
	 * @param lkm_email the lkm_email to set
	 */
	public void setLkm_email(String lkm_email) {
		this.lkm_email = lkm_email;
	}
	/**
	 * @return the lkm_qq
	 */
	public String getLkm_qq() {
		return lkm_qq;
	}
	/**
	 * @param lkm_qq the lkm_qq to set
	 */
	public void setLkm_qq(String lkm_qq) {
		this.lkm_qq = lkm_qq;
	}
	/**
	 * @return the lkm_position
	 */
	public String getLkm_position() {
		return lkm_position;
	}
	/**
	 * @param lkm_position the lkm_position to set
	 */
	public void setLkm_position(String lkm_position) {
		this.lkm_position = lkm_position;
	}
	/**
	 * @return the lkm_memo
	 */
	public String getLkm_memo() {
		return lkm_memo;
	}
	/**
	 * @param lkm_memo the lkm_memo to set
	 */
	public void setLkm_memo(String lkm_memo) {
		this.lkm_memo = lkm_memo;
	}
	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/* (non-Javadoc)  
	
	 * Title: toString 
	
	 * Description:   
	
	 * @return  
	
	 * @see java.lang.Object#toString()  
	
	 */
	@Override
	public String toString() {
		return "LinkMan [lkm_id=" + lkm_id + ", lk_gender=" + lk_gender + ", lkm_name=" + lkm_name + ", lkm_phone="
				+ lkm_phone + ", lkm_mobile=" + lkm_mobile + ", lkm_email=" + lkm_email + ", lkm_qq=" + lkm_qq
				+ ", lkm_position=" + lkm_position + ", lkm_memo=" + lkm_memo + "]";
	}
	/**
	 * @return the cust_id
	 */
	public Long getCust_id() {
		return cust_id;
	}
	/**
	 * @param cust_id the cust_id to set
	 */
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	
}
