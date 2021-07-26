package com.sat.quiz.service;

import com.sat.quiz.entity.Role;

/*
 * Interface used for DAO service method declaration for Role entity class
 * 
 * 
 * 
 */


public interface RoleService {

	Role findRoleById(long id);

	Role findRoleByName(String theRoleName);
	   
    void save(Role role);
    
    void delete(Role role);
    
}
