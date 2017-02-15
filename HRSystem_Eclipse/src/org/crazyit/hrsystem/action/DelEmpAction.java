package org.crazyit.hrsystem.action;

import org.crazyit.hrsystem.action.base.MgrBaseAction;
import org.crazyit.hrsystem.domain.Employee;

import com.opensymphony.xwork2.ActionContext;

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
public class DelEmpAction extends MgrBaseAction
{
	// ��������Ա���ĳ�Ա����
	private Employee emp;
	private Integer id;

	// emp��setter��getter����
	public void setEmp(Employee emp)
	{
		this.emp = emp;
	}
	public Employee getEmp()
	{
		return this.emp;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	public String execute()
		throws Exception
	{
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		// ��ȡHttpSession�е�user����
		
		// ɾ�����û�
		mgr.delEmp(id);
		
		return SUCCESS;
	}
}