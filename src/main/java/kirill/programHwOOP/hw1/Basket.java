package kirill.programHwOOP.hw1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Basket{

    public List<Goods> basket;

    public Basket(){
        this.basket = new ArrayList<>();
    }


    public void addItem(Goods goods) {
        basket.add(goods);
    }

    @Override
    public String toString() {
        return String.format(basket.toString());
    }
}
