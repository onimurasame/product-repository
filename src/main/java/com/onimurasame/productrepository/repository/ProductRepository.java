package com.onimurasame.productrepository.repository;

import com.onimurasame.productrepository.data.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends CrudRepository<Product, UUID> {
}
