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
public class ProductController {
	@Autowired
	private ProductRepository repository;
	@PostMapping("/addProduct")
	public int saveBook(@RequestBody Product product ) {
	repository.save(product);
	return product.getPId();
}
	@GetMapping("/findSipecificProduct/{id}")
	public Optional<Product> getProduct(@PathVariable int id)
	{
        return repository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		repository.deleteById(id);
		return "Product deleted with id: " +id;
	}
	@GetMapping("/findAll")
	public List<Product> getBooks()
	{
		return repository.findAll();
	}

	@PutMapping("/updateProduct")
 public void updateProduct(@RequestBody Product product) {
	if (product != null)
	    repository.save(product);
}

}
