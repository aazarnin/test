package products;

import java.util.List;

/* Корзина в интернет-магазине
 * реализовать интерфейс и протестировать*/
public interface Basket {

    /* добавить продукт в корзину с заданным количеством */
    void addProduct(Product product, int quantity);

    /* удалить продукт из корзины */
    void removeProduct(Product product);

    /* изменить количество продукта */
    void updateProductQuantity(Product product, int quantity);

    /* получить список продуктов */
    List<Product> getProducts();
}