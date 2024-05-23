package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private int empid;
	private String empName;
	private String desgn;
	
	private Bank bank;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, String empName, String desgn, Bank bank) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.desgn = desgn;
		this.bank = bank;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	


}
