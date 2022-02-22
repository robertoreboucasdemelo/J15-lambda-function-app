package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product,String> {

	// Modo 01 - Implementação via Interface
	
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
