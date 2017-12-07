package com.labcloud.prog1.repositories;

import com.labcloud.prog1.emines.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.util.List;

public interface ProductsRepositories extends MongoRepository<Products, String> {

    List<Products> findByName(@Param("ProductName") String name);
    List<Products> findByAmount(@Param("ProductByAmount") BigInteger amount);
    List<Products> findByPrice(@Param("ProductByPrice") BigInteger price);
    List<Products> findByAmountAfter(@Param("ProductByAmountAfter") BigInteger amount);
    List<Products> findByAmountBefore(@Param("ProductByAmountBefore") BigInteger amount);
    List<Products> findByPriceAfter(@Param("ProductByPriceAfter") BigInteger price);
    List<Products> findByPriceBefore(@Param("ProductByPriceBefore") BigInteger price);
    //List<Products> findTopByAmount(@Param("ProductAmount") BigInteger amount);
    //List<Products> findByPriceLessThan(@Param("ProductPrice") BigInteger price);
    //List<Products> findByPriceBefore(@Param("ProductPriceBefore") BigInteger price);
}
