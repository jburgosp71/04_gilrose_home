import items.Item;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GildedRoseTest {
    @Test
    public void everyDayDecreaseSellInAndQuality(){
        Product product = new Product("GoldCoin",2,2);

        Shop shop = new Shop(new Product[]{product});
        shop.update();

        assertThat(product.toString(),is(new Product("GoldCoin",1,1).toString()));
    }
}
