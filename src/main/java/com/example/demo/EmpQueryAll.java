package com.example.demo;

import java.util.List;

import org.hibernate.Session;

import com.example.model.EmpBean;
import com.example.util.HibernateUtil;

public class EmpQueryAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<EmpBean>emps=session.createQuery("from EmpBean",EmpBean.class).list();
		for (EmpBean empBean : emps) {
			System.out.println(empBean.getEmpno()+","+empBean.getEname()+","+empBean.getSalary());
		}
		session.close();
	}

}
