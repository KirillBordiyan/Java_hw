package kirill.programHwOOP.hw1;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class Goods {
    protected String name;
    protected Double price;
    protected Double rate;
    static List<Goods> goodsList = new ArrayList<>();

    public Goods(String name, Double price, Double rate){
        this.name = name;
        this.price = price;
        this.rate = rate;
        goodsList.add(this);
    }
    Goods(String name, Double price){
        this(name, price, 0.0);
    }

    public void setPrise(Double newPrice){
        if(newPrice >= 0.01){
            this.price = newPrice;
        }else{
            throw new IllegalArgumentException("Price cannot be negative or 0, min 0,01");
        }
    }

    @Override
    public String toString() {
        return  "{name='" + name + '\'' +
                ", price=" + price +
                ", rate=" + rate+"}";
    }

    public Goods findByName(String name) throws Exception {
        for (Goods item: goodsList) {
            if(item.getName().equals(name)){
                return item;
            }else{
                throw new Exception("cannot find item");
            }
        }
        return null;
    }

}
