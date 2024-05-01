package task2;

public class Customer {

    private Cart cart;



    public Customer() {

        cart = new Cart();

    }



    public void addToCart(Item item) {

        cart.addItem(item);

    }



    // Інші методи, які використовують cart

}
