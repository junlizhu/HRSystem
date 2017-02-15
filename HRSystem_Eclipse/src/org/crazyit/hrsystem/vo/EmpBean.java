package org.crazyit.hrsystem.vo;

import java.io.Serializable;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
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


	// �޲����Ĺ�����
	public EmpBean()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public EmpBean(int id ,String empName , String empPass , double amount,int age,double phone)
	{	
		this.emp_id = id;
		this.empName = empName;
		this.empPass = empPass;
		this.amount = amount;
		this.age = age;
		this.phone = phone;
	}

	// empName��setter��getter����
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getEmpName()
	{
		return this.empName;
	}

	// empPass��setter��getter����
	public void setEmpPass(String empPass)
	{
		this.empPass = empPass;
	}
	public String getEmpPass()
	{
		return this.empPass;
	}

	// amount��setter��getter����
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
	}
	//age��setter��getter����
		public void setAge(int age)
		{
			this.age = age;
		}
		public int getAge()
		{
			return this.age;
		}
		//phone��setter��getter����
		public void setPhone(double phone)
		{
			this.phone = phone;
		}
		public double getPhone()
		{
			return this.phone;
		}

}