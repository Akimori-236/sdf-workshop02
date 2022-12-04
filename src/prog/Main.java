package prog;

import cart.Item;
import cart.Orange;
import cart.Apple;


public class Main {
    public static void main(String[] args) {
        // Item apple = new Item("Apple", "apple");
        // Item orange = new Item("Orange", "orange");

        // apple.setPrice(.5f);
        // apple.setQuantity(10);

        // orange.setPrice(.5f);
        // orange.setQuantity(10);

        Apple apple = new Apple();
        apple.setAppleType("ringo");
        Orange orange = new Orange();

        System.out.println(apple.getCode());
        System.out.println(orange.getCode());
        

        Item item = apple;
        System.out.println(item.getCode());
        orange = (Orange)item; //this will throw ClassCastException as Item item was Apple

        if (item instanceof Orange) { // check if item is orange before casting it
            item = (Orange)item; // WILL NOT RUN
        }

    }
}
