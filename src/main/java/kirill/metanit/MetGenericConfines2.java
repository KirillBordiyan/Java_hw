package kirill.metanit;
//обобщенные типы в кач-ве ограничений

public class MetGenericConfines2 {
    public static void main(String[] args) {

        Account6<String> acc6_1 = new Account6<>("1111", 5000);
        //вместо String у нас был обощенный тип Т, можно было бы поставить Integer, но мы ограничили строкой
        //другой тип вызовет ошибку, так как транзакция использует объекты Acc с ограниченным типом String
        Account6<String> acc6_2 = new Account6<>("2222", 3000);

        Transaction2<Account6<String>> trans = new Transaction2<Account6<String>>(acc6_1, acc6_2, 1500);
        trans.execute(); //Acc 1: 3500 Acc 2: 4500
        trans = new Transaction2<>(acc6_1, acc6_2, 5000);
        trans.execute();//Invalid

    }
}

class Transaction2 <T extends Account6<String>>{
//вот если бы мы поставили Account6<T>, то могли бы создавать объект транзакции,
//передавая туда объект аккаунт с любым типом данных
    private final T from;
    private final T to;
    private final int sum;

    Transaction2(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){
        if (from.getSum() > sum){
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Acc %s: %d ; Ac %s: %d\n",from.getId(), from.getSum(), to.getId(), to.getSum());
        }else{
            System.out.println("Invalid oper");
        }
    }
}

class Account6<T>{
    private T id;
    private int sum;

    Account6(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    T getId(){return id;}
    int getSum(){return sum;}
    void setSum(int sum){this.sum = sum;}
}