package com.cg.mts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Customer;
@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Integer>, CustomerRepository{

}