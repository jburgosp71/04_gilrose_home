import items.Item;

public class Shop {
    private Item[] items;

    public Shop(Item[] items) {

        this.items = items;
    }

    public void update() {
        for (Item item: items) {
            item.quality -= 1;
            item.sellIn  -= 1;
        }
    }
}
