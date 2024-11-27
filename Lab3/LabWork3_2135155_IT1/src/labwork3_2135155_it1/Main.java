package labwork3_2135155_it1;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        CartView view = new CartView(cart);
        ShoppingCartController controller = new ShoppingCartController(cart);

        controller.addItem("Laptop");
        controller.addItem("Smartphone");
        controller.removeItem("Laptop");
    }
}
