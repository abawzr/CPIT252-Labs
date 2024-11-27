package labwork3_2135155_it1;

public class CartView implements Observer {

    private ShoppingCart cart;

    public CartView(ShoppingCart cart) {
        this.cart = cart;
        cart.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Cart contents: " + cart.getItems());
    }
}
