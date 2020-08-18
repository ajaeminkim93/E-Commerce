package com.jmkecommerce.ecommerce.dao;

import com.jmkecommerce.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// repository is an interface that allows developer to design  a data access contract
// The Spring Data JPA framework can then inspect that contract, and automatically build the interface implementation under the covers for you
                                            // <Entity type, Primary Key type>
public interface ProductRepository extends JpaRepository<Product, Long> {



}


