package com.vp.webservice.soap.client;

import java.util.List;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

import com.vp.webservice.service.ArrayOfXsdAnyType;
import com.vp.webservice.service.ProductService;
import com.vp.webservice.service.ProductServiceService;

public class CalculatorClient {

	public static CalculatorSoap getCalServiceStub() {
		Calculator calc = new Calculator();
		CalculatorSoap calcSoap = calc.getCalculatorSoap();
		return calcSoap;
	}
 
	
	public static ProductService getProductServiceStub() {
		ProductServiceService productService = new ProductServiceService();
		ProductService prodSoap = productService.getProductService() ;
		
		return prodSoap;
	}
	
	public static void main(String[] args) {
		/*
		CalculatorSoap calcSoap = getCalServiceStub();
		System.out.println("Sum = " + calcSoap.add(20, 30));
		System.out.println("Remainder = " + calcSoap.subtract(20, 30));
		*/
		
		
		ProductService prodSoap = getProductServiceStub();
		ArrayOfXsdAnyType productArray = prodSoap.getProducts("AZ");
		List<Object> productReturned =  productArray.getItem();
		System.out.println("productReturned : " + productReturned);
		
		//prodSoap.addProduct("My New product here ");
	}

}
