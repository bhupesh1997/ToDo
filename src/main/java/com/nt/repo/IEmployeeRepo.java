package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nt.model.ToDo;

public interface IEmployeeRepo extends JpaRepository<ToDo, Integer> 
{
 
}
