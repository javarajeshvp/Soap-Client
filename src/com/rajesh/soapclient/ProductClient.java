package com.rajesh.soapclient;

import java.util.List;

import com.rajesh.webservice.service.ProductCatalog;
import com.rajesh.webservice.service.RajeshService;

public class ProductClient {

	public static ProductCatalog getProductServiceStub() {
		RajeshService service = new RajeshService();
		ProductCatalog prodSoap = service.getProductCatalogPort();
		return prodSoap;
	}

	public static void main(String[] args) {

		ProductCatalog prodSoap = getProductServiceStub();

		List<String> products = prodSoap.fetchProducts("CA");

		System.out.println("productReturned : " + products);

		// prodSoap.addProduct("My New product here ");
	}

}