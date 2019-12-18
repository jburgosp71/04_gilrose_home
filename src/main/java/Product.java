import items.Item;

public class Product {
    private Item item;

    public Product(String name, int sellIn, int quality) {
        this.item = new Item(name, sellIn, quality);
    }

    public String toString() {
        return this.item.toString();
    }

    public void changeQuality() {
        if (canChangeQuality(this.item.quality)) {
           this.item.quality += calculateQualityIncrement();
        }
    }

    private int calculateQualityIncrement() {
        int quality_increment = -1;
        return (this.item.sellIn > 0) ? quality_increment : quality_increment * 2;
    }

    private boolean canChangeQuality(int quality) {
        int MAX_QUALITY = 50;
        int MIN_QUALITY = 0;
        return (quality > MIN_QUALITY) && (quality < MAX_QUALITY);
    }

    public void changeSellIn() {
        int sellIn_increment = -1;
        this.item.sellIn += sellIn_increment;
    }

}
