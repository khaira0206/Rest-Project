package trng.rest.dao;

import java.util.List;

import trng.rest.bean.Customer;

public interface CustomerRepositry {

	Customer findByFname(String firstname);
	Customer findByLname(String lastname);
	Customer getCustomerById(int id);
	List<Customer> getAllCustomer();
	boolean deleteCustomer(int id);
	
}
