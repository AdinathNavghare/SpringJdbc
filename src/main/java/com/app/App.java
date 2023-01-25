package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.dao.StudentDao;
import com.app.model.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello Adi!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/app/Config.xml");

	//	JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		//String query = "insert into student(id,name,city) values(?,?,?)";
		
	//	String qry="insert into student values(157,'ram','nagar')";
		//int result = template.update(qry);
		//System.out.println("record insert query =" + result);
		
		System.out.println("////////////////insert data/////////////////////////////");
		/*
		 * StudentDao studentDao=context.getBean("studentDao",StudentDao.class); Student
		 * st=new Student(); st.setId(923); st.setName("sai"); st.setCity("satara"); int
		 * rt=studentDao.insert(st); System.out.println(rt+" student added ");
		 */
		
		System.out.println("////////////////update data/////////////////////////////");
		StudentDao stddto=context.getBean("studentDao",StudentDao.class);
		
		Student st=new Student();
		st.setId(15);
		st.setName("ppp");
		st.setCity("mumbai");
		int resultdata=stddto.updateData(st);
		System.out.println("update data"+resultdata);
	
		
	}
}
