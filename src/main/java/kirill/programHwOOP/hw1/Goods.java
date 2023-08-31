package kirill.programHwOOP.hw1;


import lombok.Getter;
import lombok.Setter;




@Getter
@Setter
public class Goods {
    protected String name;
    protected Double price;
    protected Double rate;
    protected Integer count;

    public Goods(String name, Double price, Double rate, Integer count){
        this.name = name;
        this.price = price;
        this.rate = rate;
        this.count = count;
    }
    Goods(String name, Double price){
        this(name, price, 0.0, 1);
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
        return  "[name=" + name  +
                ", price=" + price +
                ", rate=" + rate +
                ", count=" + count + "]";
    }
}
