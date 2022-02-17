package com.cg.mts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Admin;

@Repository
public interface IAdminRepository  extends CrudRepository<Admin, Integer> {

}
