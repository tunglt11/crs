package com.crs.controller;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crs.dao.CompanyDAO;
import com.crs.model.Company;

@RestController
@RequestMapping("/company")
public class CompanyController {

	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	CompanyDAO companyDAO = ctx.getBean("companyDAO", CompanyDAO.class);

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Company> getAllCompany() {
		return companyDAO.findAll();
	}
}
