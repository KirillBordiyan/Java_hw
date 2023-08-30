package kirill.metanit;


//интерфейсы как ограничения
//класс транзакции работает с переменными любого типа
//однако, если мы хотим совершить операцию с объектами класса Аккаунт (который наследуется от интерфейса),
//мы не можем передать туда любой тип данных - тк Аккаунт должен реализовать методы интерфейса с использованием
//типов этого интерфейса.

public class MetGenericConfInterface {
    public static void main(String[] args) {
        Account7 acc7_1 = new Account7("1111", 5000);
        Account7 acc7_2 = new Account7("2222", 4000);

        Transaction3<Account7> tran = new Transaction3<>(acc7_1, acc7_2, 3000);
        tran.execute();
    }
}

interface Accountable2{
    String getId();
    int getSum();
    void setSum(int sum);
}

class Account7 implements Accountable2{
    private String id;
    private int sum;

    Account7(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId(){return id;}
    public int getSum(){return sum;}
    public void setSum(int sum){this.sum = sum;}
}

class Transaction3<T extends Account7>{ //транзакции могут работать только с объектами Аккаунт7
    private final T from;
    private final T to;
    private final int sum;

    Transaction3(T from, T to, int sum){
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

/*
class Person{}
interface Accountable{}

class Transaction<T extends Person & Accountable>{}

Также можно установить сразу несколько ограничений. Например, пусть класс Transaction может работать только с объектами,
которые одновременно реализуют интерфейс Accountable и являются наследниками класса Person:

*/
