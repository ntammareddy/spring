package com.naveen.ecommerce.projection;

import java.util.Set;

import org.springframework.data.rest.core.config.Projection;

import com.naveen.ecommerce.entity.Product;
import com.naveen.ecommerce.entity.ProductCategory;

@Projection(name = "productCategory", types = ProductCategory.class)
public interface ProductCategoryProjection {
	Long getId();

	String getCategoryName();

	Set<Product> getProducts();
}
