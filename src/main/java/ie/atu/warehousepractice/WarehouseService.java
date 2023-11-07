package ie.atu.warehousepractice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WarehouseService {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product: " + product.getProductName() + "ProductID" + product.getProductId()
        + "Has been added.");
    }

    public ArrayList<Product> getProducts() {
        System.out.println(products);
        return products;
    }
}
