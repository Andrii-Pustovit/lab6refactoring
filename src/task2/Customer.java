package task2;

import java.util.List;

public class Cart {

    List<Item> items;

    public Cart() {
    }

    public void addToCart(Item item) {

        items.addItem(item);

    }

    // Інші методи, які використовують cart

}
