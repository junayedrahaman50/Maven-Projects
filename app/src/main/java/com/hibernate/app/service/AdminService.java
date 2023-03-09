package com.hibernate.app.service;

import com.hibernate.app.entity.Admin;

public interface AdminService {
void registerAdmin(Admin admin);
boolean loginAdmin(String username, String password);
}
