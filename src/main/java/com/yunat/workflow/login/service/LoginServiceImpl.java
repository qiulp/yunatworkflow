package com.yunat.workflow.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yunat.workflow.login.dao.AdminInfoDAO;
import com.yunat.workflow.login.pojo.AdminInfo;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AdminInfoDAO adminInfoDAO;

	@Transactional
	public AdminInfo getAdminInfo(String username) {
		return adminInfoDAO.getAdminInfo(username);
	}

}
