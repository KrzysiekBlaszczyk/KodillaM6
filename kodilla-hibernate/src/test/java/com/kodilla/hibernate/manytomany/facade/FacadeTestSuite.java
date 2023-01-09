package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    Facade facade;

    @Test
    @Transactional
    public void testRetrieveCompanyByPartOfName() {
        //given
        Company company1 = new Company("Apple");
        Company company2 = new Company("Sony");
        companyDao.save(company1);
        companyDao.save(company2);
        //when
        List<Company> result = facade.retrieveCompanyByPartOfName("pl");
        //Then
        Assert.assertEquals(1, result.size());
        //cleanup
        companyDao.delete(company1);
        companyDao.delete(company2);

    }

    @Test
    @Transactional
    public void testRetrieveEmployeeByPartOfLastName() {
        //given
        Employee employee1 = new Employee("Krzysiek", "Blaszczyk");
        Employee employee2 = new Employee("Jan", "Nowak");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        //when
        List<Employee> result = facade.retrieveEmployeeByPartOfLastName("wa");
        //then
        Assert.assertEquals(1, result.size());
        //cleanup
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
    }
}
