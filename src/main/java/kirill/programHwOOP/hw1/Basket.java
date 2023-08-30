package kirill.programHwOOP.hw1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Basket extends User{
    List<Goods> basketGoods;

    public Basket(String name) {
        super(name);
        this.basketGoods = new ArrayList<>();
    }//todo доделать корзину

    void addItem(Goods good){
        basketGoods.add(good);
    }



}
