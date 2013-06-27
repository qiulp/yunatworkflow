package com.yunat.workflow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunat.workflow.web.dao.ContactDAO;
import com.yunat.workflow.web.pojo.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;

	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
	}

	public void removeContact(Integer id) {
		contactDAO.removeContact(id);

	}

}
