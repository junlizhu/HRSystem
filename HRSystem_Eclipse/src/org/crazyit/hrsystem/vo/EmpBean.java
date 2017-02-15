package org.crazyit.hrsystem.vo;

import java.io.Serializable;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class EmpBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	private String empName;
	private Integer emp_id;
	/**
	 * @return the emp_id
	 */
	public Integer getEmp_id() {
		return emp_id;
	}
	/**
	 * @param emp_id the emp_id to set
	 */
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	private String empPass;
	private double amount;
	private int age;
	private double phone;


	// 无参数的构造器
	public EmpBean()
	{
	}
	// 初始化全部成员变量的构造器
	public EmpBean(int id ,String empName , String empPass , double amount,int age,double phone)
	{	
		this.emp_id = id;
		this.empName = empName;
		this.empPass = empPass;
		this.amount = amount;
		this.age = age;
		this.phone = phone;
	}

	// empName的setter和getter方法
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getEmpName()
	{
		return this.empName;
	}

	// empPass的setter和getter方法
	public void setEmpPass(String empPass)
	{
		this.empPass = empPass;
	}
	public String getEmpPass()
	{
		return this.empPass;
	}

	// amount的setter和getter方法
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
	}
	//age的setter和getter方法
		public void setAge(int age)
		{
			this.age = age;
		}
		public int getAge()
		{
			return this.age;
		}
		//phone的setter和getter方法
		public void setPhone(double phone)
		{
			this.phone = phone;
		}
		public double getPhone()
		{
			return this.phone;
		}

}