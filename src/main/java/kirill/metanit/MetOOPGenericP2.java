package kirill.metanit;

import java.util.Arrays;

//обощенные методы
public class MetOOPGenericP2 {
    public static void main(String[] args) {

        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
        // в обобщенных методах, как и в переменных, при вызове надо будет указывать тип переменных
        //это делается перед непосредственно названием метода


        //для классов с несколькими обобщенными переменными используется <T,S> или любые другие буквы
        //главное не запутаться
        Account3<String, Double> acc3 = new Account3<>("123mn", 100.9);
        System.out.println(acc3.getId());
        System.out.println(acc3.getSum());
        System.out.printf("Person %s has %s in acc",acc3.getId(),acc3.getSum());
    }
}

class Printer{
    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
    }
    }
}

class Account3<T,S>{
    private T id;
    private S sum;

    Account3(T id, S sum){
        this.id = id;
        this.sum=sum;
    }

    public T getId(){return id;}
    public S getSum(){return sum;}
    public void setSum(){this.sum = sum;}

}
/* обобщенный конструктор будет выглядеть так: */

class Account4{

    private String id;
    private int sum;

    <T>Account4(T id, int sum){
        this.id = id.toString(); //передается значение любого типа и в последующем переводиться в конкрентый
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}