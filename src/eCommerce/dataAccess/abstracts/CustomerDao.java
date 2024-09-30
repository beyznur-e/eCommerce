package eCommerce.dataAccess.abstracts;

import eCommerce.entities.concretes.Customer;

public interface CustomerDao {
    void log(Customer customer);
    void verification(Customer customer);
}
