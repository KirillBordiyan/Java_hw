package kirill.programHwOOP.hw1;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    String name;
    Basket basket = new Basket(name+"'s basket");
    public User(String name){
        this.name = name;
    }
/*todo придумать как происходит покупка товаров, скорее всего понадобится доп метод в товаре "купить"/"вернуть"
  */
    public void buy(String itemName, List<Category> categories){
        if(categories.contains()){
            basket.addItem(itemName);
            categories.remove(itemName);
        }else{
            throw new IllegalArgumentException("Good not in that category");
        }


    }





}
