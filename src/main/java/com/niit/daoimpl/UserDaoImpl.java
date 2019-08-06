package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDAO;
import com.niit.model.User;

@SuppressWarnings("hiding")
@Repository
@Transactional
public class UserDaoImpl<User> implements UserDAO {
	
	@Autowired(required=true)
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<com.niit.model.User> getUserList() {
		List<com.niit.model.User> getUserList =sessionFactory.getCurrentSession().createQuery("from User").list();
		return getUserList;
	}

	public <sessionFactory> boolean createUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		return true;
	}

	@SuppressWarnings("unchecked")
	public User getUserById1(String userId) {
		User user =(User) sessionFactory.getCurrentSession().createQuery("From User where userId="+userId).uniqueResult();
		return user;
	}

	public boolean updateUser(UserDAO user) {
		sessionFactory.getCurrentSession().update(user);
		return true;
	}

	public boolean deleteUser(int userId) {
		sessionFactory.getCurrentSession().delete(userId);
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<com.niit.model.User> getUserListByName(String username) {
		return(List<com.niit.model.User>) sessionFactory.getCurrentSession().createQuery("from User where where username like "+"'%").list();
		
	}

	public UserDaoImpl (String userId, String Password) {
		return;
	}

	public boolean createUser(com.niit.model.User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public com.niit.model.User getUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public com.niit.model.User authUser(String userId, String Password) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
	
	
