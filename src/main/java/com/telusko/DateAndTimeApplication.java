package com.telusko;

import com.telusko.bo.CustomerDetails;
import com.telusko.service.ICustomerManagementImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SpringBootApplication
public class DateAndTimeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DateAndTime.class, args);
        ICustomerManagementImpl service = context.getBean(ICustomerManagementImpl.class);
        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setCname("Kundan");
        customerDetails.setCity("Konijedu");
        customerDetails.setDob(LocalDateTime.of(2003,8,23,2,23));
        customerDetails.setRegTime(LocalTime.now());
        customerDetails.setRegDate(LocalDate.now());
        service.registerTheCustomer(customerDetails);
        context.close();
    }

}
