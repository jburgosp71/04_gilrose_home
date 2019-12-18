
public class Shop {
    private Product[] products;

    public Shop(Product[] products) {

        this.products = products;
    }

    public void update() {
        for (Product product: products) {
            product.changeQuality();
            product.changeSellIn();
        }
    }
}
