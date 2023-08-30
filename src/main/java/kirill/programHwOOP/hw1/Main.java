package kirill.programHwOOP.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Goods> furniture = Arrays.asList(
                new Goods("Table", 55.00, 4.0),
                new Goods("Sofa", 122.00, 4.5),
                new Goods("Closed", 73.50, 3.6));

        List<Goods> bath = Arrays.asList(
                new Goods("Mirror", 60.00, 5.0),
                new Goods("Brush", 2.00, 4.0),
                new Goods("Shampoo", 12.75, 4.2));

        List<Goods> kitchen = Arrays.asList(
                new Goods("Forks", 60.60, 5.0),
                new Goods("Sponges", 3.10, 3.7),
                new Goods("Detergent", 15.00, 4.7));

        List<Goods> other = Arrays.asList(
                new Goods("Towels", 6.00, 4.9),
                new Goods("Pedestal", 0.30, 4.7),
                new Goods("Thermos", 11.00, 4.1),
                new Goods("Filter", 4.15, 4.0));


        List<Category> categoryList = Arrays.asList(
                new Category("Furniture", furniture),
                new Category("Bath items", bath),
                new Category("Kitchen goods", kitchen),
                new Category("Other goods", other));


        System.out.println(Category.categories);
        System.out.println(Goods.goodsList);

        User user1 = new User("Alf");
        user1.buy("Towels", categoryList);



    }
}
