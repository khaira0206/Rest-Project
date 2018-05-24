package trng.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import trng.rest.bean.Customer;
import trng.rest.service.ICustomerService;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Customer> getCustomers() {

	return  customerService.getAllCustomer();
	}
	
	@RequestMapping(value="/{customerId}", method = RequestMethod.GET)
	public @ResponseBody Customer getCustomerById(@PathVariable("customerId") String id) {

	
	return  customerService.getCustomerById(Integer.parseInt(id));
	}
	
	@RequestMapping(value="/delete/{customerId}", method = RequestMethod.PUT)
	public @ResponseBody boolean deleteCustommer(@PathVariable("customerId") String id) {
		
		return customerService.deleteCustomer(Integer.parseInt(id));
	}
	
	
}
