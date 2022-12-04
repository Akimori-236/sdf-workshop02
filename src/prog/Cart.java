package prog;

import java.io.Console;
import java.util.List;
import java.util.LinkedList;

import cart.Item;
import cart.Apple;
import cart.Orange;

public class Cart {
    public static void main(String[] args) {

        List<Item> cart = new LinkedList<>();
        Console cons = System.console();
        Boolean stop = false;

        while (!stop) {
            String[] input = cons.readLine().toLowerCase().split(" ");

            switch (input[0]) {
                case "list":
                    if (cart.size() <= 0) {
                        System.out.println("Cart is empty");
                    } else {
                        cartList(cart);
                    }
                    break;

                case "add":
                    if (1 < input.length && input.length < 5) {
                        switch (input[1]) {
                            case "apple":
                                try {
                                    Item apple = new Apple();
                                    apple.setQuantity(Integer.parseInt(input[2]));
                                    apple.setPrice(Float.parseFloat(input[3]));
                                    cart.add(apple);
                                } catch (Exception e) {
                                    System.err.println(
                                            "----------\nadd item price qty\nexample: add apple 10 0.5\n----------");
                                }
                                break;

                            case "orange":
                                try {
                                    Item orange = new Orange();
                                    orange.setQuantity(Integer.parseInt(input[2]));
                                    orange.setPrice(Float.parseFloat(input[3]));
                                    cart.add(orange);
                                } catch (Exception e) {
                                    System.err.println(
                                            "----------\nadd item price qty\nexample: add orange 10 0.5\n----------");
                                }
                                break;

                            default:
                                System.err.println("Sorry, can only add apple or orange.");
                        }
                    } else {
                        System.err.println("----------\nadd item price qty\nexample: add apple 10 0.5\n----------");
                    }
                    break;

                case "stop":
                case "checkout":
                    cartTotal(cart);
                    stop = true;
                    break;

                default:
                    System.err.println(
                            "---List of options---\nlist \t\t- List out the contents of the cart\nadd \t\t- Add items into cart (add item price qty)\nstop/checkout \t- Displays total price of cart and exits program");
            }
        }
    }

    public static void cartList(List<Item> cart) {
        for (int i = 0; i < cart.size(); i++) {
            Item x = cart.get(i);
            System.out.printf("%d. %s x %s @ $%.2f each\n", i + 1, x.getName(), x.getQuantity(), x.getPrice());
            // floats use %f, digits use %d
        }
    }

    public static void cartTotal(List<Item> cart) {
        Float cartTotal = 0f;
        for (int i = 0; i < cart.size(); i++) {
            Item y = cart.get(i);
            cartTotal += (y.getPrice() * y.getQuantity());
        }
        System.out.printf("The total price is $%.2f\n", cartTotal);
    }
}