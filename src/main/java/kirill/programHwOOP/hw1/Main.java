package kirill.programHwOOP.hw1;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Goods> furniture = Arrays.asList(
                new Goods("Table", 55.00, 4.0,2),
                new Goods("Sofa", 122.00, 4.5,4),
                new Goods("Closed", 73.50, 3.6,3));

        List<Goods> bath = Arrays.asList(
                new Goods("Mirror", 60.00, 5.0,5),
                new Goods("Brush", 2.00, 4.0,20),
                new Goods("Shampoo", 12.75, 4.2, 10));

        List<Goods> kitchen = Arrays.asList(
                new Goods("Forks", 60.60, 5.0,6),
                new Goods("Sponges", 3.10, 3.,1),
                new Goods("Detergent", 15.00, 4.7,1));

        List<Goods> other = Arrays.asList(
                new Goods("Towels", 6.00),
                new Goods("Pedestal", 0.30),
                new Goods("Thermos", 11.00, 4.1,17),
                new Goods("Filter", 4.15, 4.0,2));


        List<Category> categoryList = Arrays.asList(
                new Category("Furniture", furniture),
                new Category("Bath items", bath),
                new Category("Kitchen goods", kitchen),
                new Category("Other goods", other));

        System.out.println(categoryList);

        User user = new User("Alf","123");




        buyItem(user,"Table", "Furniture", categoryList, 2);
        System.out.println(user.getUserBasket());

        User user2 = new User("Sam", "0990");
        buyItem(user2,"Table", "Furniture", categoryList,1);
        System.out.println(user2.getUserBasket());

        System.out.println(categoryList);




    }

    //todo решить, что делать с кол-м и описать результат, если такого кол-ва нет
    static void buyItem(User user, String itemName, String itemCategory, List<Category> categoryList, Integer count) {

        Category goalCategory = findByParam(itemCategory, categoryList);

        if (goalCategory != null) {
            for (Goods goods : goalCategory.getCategoryGoods()) {
                if (goods.getName().equals(itemName)) {
                    user.getUserBasket().addItem(goods);
                    int tempCount = goalCategory.findByName(itemName).getCount();
                    goalCategory.findByName(itemName).setCount(tempCount - count);
                    //
                }
            }
        }


    }



    static Category findByParam(String itemCategory, List<Category> categoryList) {
        for(Category category: categoryList){
            if(category.getName().equals(itemCategory)){
                return category;
            }
        }
        return null;
    }
}
