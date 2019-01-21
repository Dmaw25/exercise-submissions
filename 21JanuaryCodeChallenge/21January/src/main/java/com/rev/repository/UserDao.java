package com.rev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rev.beans.User;
import com.rev.beans.User_Role;

@Repository
public interface UserDao extends JpaRepository<User,Integer>{
	public List<User> getByUserRole(User_Role u);
}
