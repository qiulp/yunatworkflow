package com.yunat.workflow.web.service;

import com.yunat.workflow.web.pojo.Contact;

public interface ContactService {

	public void addContact(Contact contact);

	public void removeContact(Integer id);

}
