package kirill.programHwOOP.hw1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Category {
    String name;
    static List<String> categories = new ArrayList<>();
    List<Goods> categoryGoods;

    public Category(String name, List<Goods> listOfGoods) {
        if(!(categories.contains(name))){
            this.name = name;
            this.categoryGoods = listOfGoods;
            categories.add(name);
        }else{
            throw new IllegalArgumentException("Same category already exists");
        }
    }


    @Override
    public String toString() {
        StringBuilder goodsList = new StringBuilder();
        for (Goods good : categoryGoods) {
            goodsList.append(good.getName()).append(" ");
        }
        return name + ": " + String.format(goodsList.toString()).trim();
    }
}
