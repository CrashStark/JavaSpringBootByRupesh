package com.Mapping.JPAMApping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mapping.JPAMApping.DTO.OrderRequest;
import com.Mapping.JPAMApping.DTO.OrderResponse;
import com.Mapping.JPAMApping.Entity.Customer;
import com.Mapping.JPAMApping.Repo.CustomerRepo;
import com.Mapping.JPAMApping.Repo.ProductRepo;

@RestController
public class OrderController {
	  @Autowired
	    private CustomerRepo customerRepository;
	    @Autowired
	    private ProductRepo productRepository;

	    @PostMapping("/placeOrder")
	    public Customer placeOrder(@RequestBody OrderRequest request){
	       return customerRepository.save(request.getCustomer());
	    }

	    @GetMapping("/findAllOrders")
	    public List<Customer> findAllOrders(){
	        return customerRepository.findAll();
	    }
	    @GetMapping("/getJoinInfo")
	    public List<OrderResponse> getJoinInfo(){
	        return customerRepository.getJoinInforamtion();
	    }
	    

	    
	@GetMapping("/msg")
	public String message() {
		return "Message is working";
	}
}
