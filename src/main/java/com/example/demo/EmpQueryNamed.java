package com.example.demo;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.example.model.Emp;
import com.example.util.HibernateUtil;

public class EmpQueryNamed {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Query<Emp>query=session.createQuery("from Emp where empno=?1",Emp.class);
		query.setParameter(1, 1001);
		Emp emp=query.uniqueResult();
		if (emp!=null) {
			System.out.println(emp.getEmpno()+","+emp.getEname()+","+emp.getSalary());
		}
		session.close();
	}
}
