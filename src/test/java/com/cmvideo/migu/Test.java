package com.cmvideo.migu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmvideo.migu.dao.Dao;
import com.cmvideo.migu.domain.Domain;

public class Test {

	public static void main(String[] args){
		System.out.println("Hello World!");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", Test.class);
		
		Domain domain = new Domain("ddd444");
		
		Dao dao = ctx.getBean(Dao.class);
		dao.saveOrUpate(domain);
		System.out.println("ID：" + domain.getId());
		
//		BasicDataSource dataSource = ctx.getBean(BasicDataSource.class);
//		System.out.println("dataSource：" + dataSource.getUrl());
	}
}
