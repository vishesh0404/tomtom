package com.online.app.repo;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.app.entity.Product;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
