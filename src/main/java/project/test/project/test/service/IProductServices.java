package project.test.project.test.service;

import project.test.project.test.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IProductServices {
    List<Product> getAllProducts();

    Product saveProduct(Product product);

    Optional<Product> getProductForId(UUID id);

    void deleteProductForId(UUID id);
}
