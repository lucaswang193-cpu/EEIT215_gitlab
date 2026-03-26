package com.example.demo;

import java.util.List;

import org.hibernate.Session;

import com.example.model.Emp;
import com.example.model.EmpBean;
import com.example.util.HibernateUtil;

public class EmpQueryAllJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<Emp>emps=session.createQuery("from Emp",Emp.class).list();
		for (Emp empBean : emps) {
			System.out.println(empBean.getEmpno()+","+empBean.getEname()+","+empBean.getSalary());
		}
		session.close();
	}

}
