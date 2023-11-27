package com.Mapping.JPAMApping.Repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Mapping.JPAMApping.DTO.OrderResponse;
import com.Mapping.JPAMApping.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	@Query("select new com.Mapping.JPAMApping.DTO.OrderResponse(c.name ,p.productName) from Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInforamtion();
}
