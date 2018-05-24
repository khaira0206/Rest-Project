package trng.rest.service;

import java.util.List;

import trng.rest.bean.Customer;

public interface ICustomerService {

	Customer findByFname(String firstname);
	Customer findByLname(String lastname);
	Customer getCustomerById(int id);
	List<Customer> getAllCustomer();
	boolean deleteCustomer(int id);
}
