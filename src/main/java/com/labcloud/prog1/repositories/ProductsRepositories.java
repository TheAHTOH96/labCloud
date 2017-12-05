package com.labcloud.prog1.repositories;

import com.labcloud.prog1.emines.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepositories extends MongoRepository<Products, String> {
}
