package com.crs.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crs.dao.CompanyDAO;
import com.crs.model.Bank;
import com.crs.model.BankAccount;
import com.crs.model.Company;

public class CompanyTest {

	public static void main(String[] args) {		
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		 CompanyDAO companyDAO = ctx.getBean("companyDAO", CompanyDAO.class);
		 
		 /*Company company = new Company();
		 company.setAddress("15 Quang Trung, Da nang");
		 company.setPhoneNumber("0978906456");
		 BankAccount bankAccount = new BankAccount();
		 bankAccount.setAccountNo("00108985001");
		 bankAccount.setAccountOwnerName("Le Thanh Tung");
		 bankAccount.setBankName(Bank.TienphongBank);
		 bankAccount.setAccountStatus("active");
		 company.setBankAccount(bankAccount);
		 
		 companyDAO.create(company);
		 System.out.println("insert a company completed");*/
		 
		 
		 List<Company> companies = companyDAO.findAll();
		 for (Company c : companies) {
			System.out.println(c.getCompanyId());
			System.out.println(c.getCompanyName());
			System.out.println(c);
		}
	}

}
