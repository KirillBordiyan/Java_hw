package kirill.programHwOOP.hw1;

import java.util.ArrayList;
import java.util.List;


public class Basket extends User{
    List<Goods> basket;

    protected Basket(String name){
        super(name);
        this.basket = new ArrayList<>();
    }


    public void addItem(Goods goods) {
        basket.add(goods);
    }
}
