package com.naveen.ecommerce.projection;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.naveen.ecommerce.entity.Product;
import com.naveen.ecommerce.entity.ProductCategory;

@Projection(name = "product", types = Product.class)
public interface ProductProjection {
	Long getId();

	ProductCategory getCategory();

	String getSku();

	String getName();

	String getDescription();

	BigDecimal getUnitPrice();

	String getImageUrl();

	boolean getActive();

	int getUnitsInStock();

	Date getDateCreated();

	Date getLastUpdated();
}
