package com.example.posproduct.repository;

import com.example.posproduct.model.Product;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @Transactional
//    @Modifying
//    @Query("UPDATE Product p SET p.quantity = :quantity WHERE p.id = :productId") // Product should be entity not table name
//    int updateProductQuantityById(@Param("productId") long productId, @Param("quantity") int quantity);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Product findById(long productId);
}
