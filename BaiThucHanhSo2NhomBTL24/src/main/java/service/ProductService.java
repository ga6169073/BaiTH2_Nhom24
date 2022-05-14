package service;

import java.util.List;

import models.Product;
import repository.ProductRepository;
import service.impl.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductServiceImpl{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.getById(id);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product editProduct(Long id, Product product) {
		Product productInDB = productRepository.getById(id);
		
		productInDB.setCode(product.getCode());
		productInDB.setDescription(product.getDescription());
		productInDB.setPrice(product.getPrice());
		
		return productRepository.save(productInDB);
	}

	@Override
	public void deleteProduct(Product product) {
		productRepository.delete(product);
	}

	
	
}