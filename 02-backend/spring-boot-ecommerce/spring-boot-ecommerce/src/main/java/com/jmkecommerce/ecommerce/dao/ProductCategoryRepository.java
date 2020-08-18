package com.jmkecommerce.ecommerce.dao;

import com.jmkecommerce.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// data access object                           // Name of JSON Entry, path to product-category
// provides interface or persistence mechanism
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {



}
