package trng.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trng.rest.bean.Customer;
import trng.rest.dao.CustomerRepositry;
@Service
public class CustomerService implements ICustomerService {

	@Autowired
	CustomerRepositry customerRepositry;
	
	@Override
	public Customer findByFname(String firstname) {
		
		return customerRepositry.findByFname(firstname);
	
	}

	@Override
	public Customer findByLname(String lastname) {

		return customerRepositry.findByFname(lastname);
	}

	@Override
	public Customer getCustomerById(int id) {

		return customerRepositry.getCustomerById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepositry.getAllCustomer();
	}

	public boolean deleteCustomer(int id) {
		return customerRepositry.deleteCustomer(id);
	}

}
