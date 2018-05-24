package trng.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import trng.rest.bean.Customer;

@Service
public class CustomerRepositryImpl implements CustomerRepositry{

	List<Customer> list;
	
	public CustomerRepositryImpl() {
	Customer customer1  = new Customer(1, "harman1", "Singh1", "My Address1", "My City", "my State", "My Country", "12121212");
	Customer customer2  = new Customer(2, "harman2", "Singh2", "My Address2", "My City", "my State", "My Country", "12121212");
	
	Customer customer3  = new Customer(3, "harman3", "Singh3", "My Address3", "My City", "my State", "My Country", "12121212");
	Customer customer4  = new Customer(4, "harman4", "Singh4", "My Address4", "My City", "my State", "My Country", "12121212");

	list =  new ArrayList<>();
	 list.add(customer1);
	 list.add(customer2);
	 list.add(customer3);
	 list.add(customer4);
	
	}

	
	@Override
	public Customer findByFname(String firstname) {

		for(Customer cust: list) {
			if(cust.getFname().equals(firstname)) {
				
				return cust;
			}
		}

		return null;
	}

	@Override
	public Customer findByLname(String lastname) {
		for(Customer cust: list) {
			if(cust.getLname().equals(lastname)) {
				
				return cust;
			}
		}

		return null;
	}
public Customer getCustomerById(int id) {
		
	for(Customer cust: list) {
		if(cust.getId() == (id)) {
			
			return cust;
		}
	}
	return null;
	}

	
	public List<Customer> getAllCustomer() {
		
		return list;
	}


	public boolean deleteCustomer(int id) {
	
		for(Customer cust: list) {
			if(cust.getId() == id) {
				
				list.remove(cust);
				
				return true;
			}
		}
		
		return false;
	}


}
