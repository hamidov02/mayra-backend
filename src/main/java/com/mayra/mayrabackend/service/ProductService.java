package com.mayra.mayrabackend.service;

import com.mayra.mayrabackend.model.Product;
import com.mayra.mayrabackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> findProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setName(productDetails.getName());
                    product.setDescription(productDetails.getDescription());
                    product.setPrice(productDetails.getPrice());
                    product.setStockCount(productDetails.getStockCount());
                    // Update other fields as necessary
                    return productRepository.save(product);
                })
                .orElseGet(() -> {
                    productDetails.setId(id);
                    return productRepository.save(productDetails);
                });
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

