package kirill.programHwOOP.hw1;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    String name;
    Basket userBasket;

    public User(String name){
        this.name = name;
        this.userBasket = new Basket(name);
    }

    public void buyItem(String itemName, String itemCategory, List<Category> categoryList) {
        Category category = findByParam(itemCategory, categoryList);
        if(category != null){
            for(Goods goods: category.getCategoryGoods()){
                if(goods.getName().equals(itemName)){
                    userBasket.addItem(goods);
                    category.getCategoryGoods().remove(goods);
                }
            }
        }
    }

    private Category findByParam(String itemCategory, List<Category> categoryList) {
        for(Category category: categoryList){
            if(category.getName().equals(itemCategory)){
                return category;
            }
        }
        return null;
    }
}
