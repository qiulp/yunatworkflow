package com.yunat.workflow.web.dao;

import com.yunat.workflow.web.pojo.Contact;

public interface ContactDAO {
	public void addContact(Contact contact);

	public void removeContact(Integer id);

}
