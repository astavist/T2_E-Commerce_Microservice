package com.sametyilmaz.inventoryservice.repository;

import com.sametyilmaz.inventoryservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
