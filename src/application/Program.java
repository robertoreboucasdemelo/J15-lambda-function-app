package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));
		
		// Modo 01 - Implementação via Interface
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		// Modo 02 - Reference Method com Metodo Estatico
		//List<String> names = list.stream().map(Product:: staticUpperCaseName).collect(Collectors.toList());
		
		// Modo 03 - Reference Method com Metodo Não Estatico
		//List<String> names = list.stream().map(Product:: noStaticUpperCaseName).collect(Collectors.toList());
		
		// Modo 04 - Expressão Lambda Declarada
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		// Modo 05 - Expressão Lambda Inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
