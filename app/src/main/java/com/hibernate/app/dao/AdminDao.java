package com.hibernate.app.dao;

import com.hibernate.app.entity.Admin;


public interface AdminDao {
//pass object to store admin data, Admin variable stores data of admin type
	void registerAdmin(Admin admin);
	boolean loginAdmin(String username, String password);
}
