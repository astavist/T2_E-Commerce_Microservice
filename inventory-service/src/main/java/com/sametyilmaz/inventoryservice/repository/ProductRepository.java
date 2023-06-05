package com.sametyilmaz.inventoryservice.repository;

import com.sametyilmaz.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
