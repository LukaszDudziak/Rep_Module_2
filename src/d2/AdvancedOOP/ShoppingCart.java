package d2.AdvancedOOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    List<CartItem> cartItems = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        CartItem cartItem = new CartItem();

            if (cartItem.equals(product)) {
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
            } else {
                cartItem.setProduct(product);
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
                cartItems.add(cartItem);
            }
        }
    }

    public void removeProduct(Product product) {
        cartItems.remove(product);
    }
}


