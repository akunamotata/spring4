package com.cmvideo.migu.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cmvideo.migu.domain.Domain;

public class Dao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void saveOrUpate(Domain domain){
		
		sessionFactory.getCurrentSession().saveOrUpdate(domain);
	}
	
}
