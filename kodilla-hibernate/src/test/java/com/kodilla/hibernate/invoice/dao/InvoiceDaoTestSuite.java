package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product = new Product("telefon");
        Product product1 = new Product("laptop");
        Item item = new Item(product,new BigDecimal(5),3);
        Item item1 = new Item(product1, new BigDecimal(2),19);
        Invoice invoice = new Invoice("FW6/3/2022");
        item1.setInvoice(invoice);
        item.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0,id);

        //Cleanup
        invoiceDao.delete(invoice);

    }
}
