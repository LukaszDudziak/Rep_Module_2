package d2.AdvancedOOP;

import java.util.*;
import java.util.regex.Pattern;

public class ShoppingCart {
    List<CartItem> cartItems = new ArrayList<>();


    public void addProduct(Product product, int quantity) {


        if (cartItems.isEmpty()) {
            cartItems.add(new CartItem(product, quantity));

        } else {
            ListIterator iterator = cartItems.listIterator();
            while (iterator.hasNext()) {
                CartItem cartItem = new CartItem(product, quantity);
                CartItem cartItem1 = (CartItem) iterator.next();
                if (cartItem1.getProduct().getName().equals(cartItem.getProduct().getName())) {
                    cartItem1.setQuantity(cartItem1.getQuantity() + cartItem.getQuantity());
                   // updateProduct(product,quantity);
                }
                    if (!cartItem.getProduct().getName().equals(cartItem1.getProduct().getName())) {
                       iterator.add(cartItem);
                    }
                }
            }
        }



    public void removeProduct(Product product) {
        Iterator iterator = cartItems.iterator();
        while (iterator.hasNext()) {
            CartItem cartItem = (CartItem) iterator.next();
            if (cartItem.getProduct().equals(product)) {
                iterator.remove();
            }

        }
    }

    public void updateProduct(Product product, int quantity) {
        ListIterator listIterator = cartItems.listIterator();
        while (listIterator.hasNext()) {
            CartItem cartItem = (CartItem) listIterator.next();
            if (cartItem.getProduct().getName().equals(product.getName())) {
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
            }
        }
    }

    //Iterator itr = al.iterator();
    //        while (itr.hasNext())
    //        {
    //            int x = (Integer)itr.next();
    //            if (x < 10)
    //                itr.remove();
    //        }
}
