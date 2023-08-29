package kirill.programHwOOP.hw1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class User {
    String name;
    Basket basket = new Basket(name);
    public User(String name){
        this.name = name;
    }
/*todo придумать как происходит покупка товаров, скорее всего понадобится доп мметод в товаре "купить"/"вернуть"
  */
//    public void buy(Goods good){
//        basket.addItem(good);
//
//    }





}
