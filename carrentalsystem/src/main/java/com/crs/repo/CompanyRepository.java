package com.crs.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crs.model.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, String>{
}
