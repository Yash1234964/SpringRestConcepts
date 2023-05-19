package in.ineuron.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@GetMapping("/report/{id}")
	public ResponseEntity<Customer> showAllCustomer(@PathVariable Integer id){
		
		Customer customer=new Customer();
		customer.setCno(id);
		customer.setCname("Sachin");
		customer.setBillAmount(54.4f);
		
		ResponseEntity<Customer> entity=new ResponseEntity<Customer>(customer,HttpStatus.OK);
		
		return entity;
	}
	
	
}
