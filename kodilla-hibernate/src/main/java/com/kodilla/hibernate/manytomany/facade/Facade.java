package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class Facade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> retrieveCompanyByPartOfName (String partOfCompanyName) {
        return companyDao.retrieveCompaniesByPartOfName(partOfCompanyName);
    }

    public List<Employee> retrieveEmployeeByPartOfLastName (String partOfLastName) {
        return employeeDao.retrieveEmployeeWithPartOfLastName(partOfLastName);
    }
}
