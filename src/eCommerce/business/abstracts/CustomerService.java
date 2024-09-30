package eCommerce.business.abstracts;

import eCommerce.entities.concretes.Customer;

public interface CustomerService {
    void log(Customer customer);
    void verification(Customer customer);
    }

