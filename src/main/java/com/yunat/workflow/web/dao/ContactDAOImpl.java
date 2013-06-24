package com.yunat.workflow.web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yunat.workflow.web.pojo.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addContact(Contact contact) {
		sessionFactory.getCurrentSession().save(contact);
	}

	public void removeContact(Integer id) {
		Contact con = (Contact) sessionFactory.getCurrentSession().load(
				Contact.class, id);
		if (null != con)
			sessionFactory.getCurrentSession().delete(con);
	}

}
