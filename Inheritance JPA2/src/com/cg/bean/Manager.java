package com.cg.bean;

import javax.persistence.*;

@Entity
public class Manager extends Emp{
	
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
