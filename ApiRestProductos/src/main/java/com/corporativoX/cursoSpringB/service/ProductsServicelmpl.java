package com.corporativoX.cursoSpringB.service;

import com.corporativoX.cursoSpringB.domain.Product;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Lazy
@Service
@ConditionalOnProperty(name= "service.products", havingValue = "list")
public class ProductsServicelmpl implements ProductService {

    public ProductsServicelmpl(){
        System.out.println("Instancia de la clase ProducsServiceImpl");
    }

    //Instancia de clase
    List<Product> products = new ArrayList<>(Arrays.asList(

            new Product(1, "Portatil", 799.99, 10),
            new Product(2, "Smarphone", 499.99, 25),
            new Product(3, "Tablet", 299.99, 15),
            new Product(4, "Smartwatch", 199.99, 30)

    ));


    @Override
    public List<Product> getProducts() {
        return products;
    }
}
