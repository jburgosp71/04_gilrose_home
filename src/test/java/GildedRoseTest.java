import items.Item;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GildedRoseTest {
    @Test
    public void shouldFail() {
        assertThat(true, is(true));
    }

    @Test
    public void everyDayDecreaseSellInAndQuality(){
        Item item = new Item("GoldCoin",2,2);

        Shop shop = new Shop(new Item[]{item});
        shop.update();

        assertThat(item.toString(),is(new Item("GoldCoin",1,1).toString()));
    }
}
