package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
    @Override
    public void log(Customer customer) {
        System.out.println("Hibernate ile eklendi" + customer.getFirstName());

    }

    @Override
    public void verification(Customer customer) {

    }
}
