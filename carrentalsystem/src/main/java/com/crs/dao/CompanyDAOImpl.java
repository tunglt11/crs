package com.crs.dao;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;

import com.crs.model.Company;

public class CompanyDAOImpl implements CompanyDAO {
	private MongoOperations mongoOps;

	public CompanyDAOImpl(MongoOperations mongoOps) {
		this.mongoOps = mongoOps;
	}

	public void create(Company company) {
		mongoOps.insert(company);
	}

	public List<Company> findAll() {
		return mongoOps.findAll(Company.class);
	}

}
