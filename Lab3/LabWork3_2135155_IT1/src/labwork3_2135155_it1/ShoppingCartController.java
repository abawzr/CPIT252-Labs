package labwork3_2135155_it1;

public class ShoppingCartController {

    private ShoppingCart cart;

    public ShoppingCartController(ShoppingCart cart) {
        this.cart = cart;
    }

    public void addItem(String item) {
        cart.addItem(item);
    }

    public void removeItem(String item) {
        cart.removeItem(item);
    }
}
