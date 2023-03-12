package com.hibernate.app.dao;

import javax.persistence.PersistenceException;

import com.hibernate.app.entity.Admin;



public interface AdminDao {
//pass object to store admin data, Admin variable stores data of admin type
	void registerAdmin(Admin admin);
	boolean loginAdmin(String username, String password);
	Admin getAdmin(int id);
	Admin updateAdmin(int id, Admin admin);
	void deleteAdmin(int id) throws PersistenceException;
}
