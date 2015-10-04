package com.crs.dao;

import java.util.List;

import com.crs.model.Company;

public interface CompanyDAO {
	public void create(Company company);
	public List<Company> findAll();
}
