package com.example.model;


import javax.persistence.*;


@Entity
@Table(name = "emp")
public class Emp {
	@Id
	private Integer empno;
	private String ename;
	private Integer salary;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	
}
