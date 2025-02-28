package project.test.project.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.test.project.test.model.Product;
import project.test.project.test.service.IProductServices;
import project.test.project.test.repository.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServices implements IProductServices
{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> getProductForId(UUID id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteProductForId(UUID id) {
         productRepository.deleteById(id);
    }

}
