package com.hibernate.Repository;

import com.hibernate.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    public List<Product> findByNameOrDescription(String name, String description);

    List<Product> findByNameLike(String name);
}
