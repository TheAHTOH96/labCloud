package com.labcloud.prog1.repositories;

import com.labcloud.prog1.emines.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

public interface ProductsRepositories extends MongoRepository<Products, String> {

    Set<Products> findByName(@Param("ProductName") String name);
    Set<Products> findByAmount(@Param("ProductByAmount") BigInteger amount);
    Set<Products> findByPrice(@Param("ProductByPrice") BigInteger price);
    Set<Products> findByAmountLessThanEqual(@Param("ProductByAmountLessThanEqual") BigInteger amount);
    Set<Products> findByAmountGreaterThanEqual(@Param("ProductByAmountGreaterThanEqual") BigInteger amount);
    Set<Products> findByPriceLessThanEqual(@Param("ProductByPriceLessThanEqual") BigInteger price);
    Set<Products> findByPriceGreaterThanEqual(@Param("ProductByPriceGreaterThanEqual") BigInteger price);

}
