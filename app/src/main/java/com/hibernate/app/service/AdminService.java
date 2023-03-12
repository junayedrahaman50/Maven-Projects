package com.hibernate.app.service;

import javax.persistence.PersistenceException;

import com.hibernate.app.entity.Admin;
import com.hibernate.app.exception.GlobalException;
import com.hibernate.app.model.AdminDTO;


public interface AdminService {
void registerAdmin(Admin admin);
boolean loginAdmin(String username, String password);
AdminDTO getAdminById(int id) throws GlobalException;
AdminDTO updateAdmin(int id, Admin admin);
void deleteAdmin(int id) throws PersistenceException;
}
