package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;
	@PostMapping("/addCustomer")
	public String saveBook(@RequestBody Customer customer ) {
	repository.save(customer);
	return "Customer added with id :" + customer.getId();
}
	@GetMapping("/findCustomer/{id}")
	public Optional<Customer> getEmployee(@PathVariable int id)
	{
        return repository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		repository.deleteById(id);
		return "Customer deleted with id: " +id;
	}
	@GetMapping("/findAll")
	public List<Customer> getBooks()
	{
		return repository.findAll();
	}

	@PutMapping("/updateCustomer")
 public void updateEmployee(@RequestBody Customer customer) {
	if (customer != null)
	    repository.save(customer);
}
}
