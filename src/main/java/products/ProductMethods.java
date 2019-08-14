package products;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMethods implements Basket {

    Product product1 = new Product("123abc","product1");
    Product product2 = new Product("234qwe", "product2");
    Map<Product, Integer> products = new HashMap<>();

    @Test
    public void test() throws Exception {
        addProduct(product1,3);
        addProduct(product2,4);
    }

    @Override
    public void addProduct(Product product, int quantity) {
        int realQuantity = (products.containsKey(product1)?products.get(product1):0)+ quantity;
        products.put(product1,realQuantity);
        System.out.println(products);
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(Product product, int quantity) {
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }
}