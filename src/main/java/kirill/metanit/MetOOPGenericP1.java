package kirill.metanit;

/*Generic - обобщения
позволяют уйти от жесткого определения используемых типов
в процессе разработки мы можем не знать, какой именно тип представляет значение в id,
например, для пользователя банковского счета,
и при попытке получить число в данном случае мы столкнемся с исключением java.lang.ClassCastException.
*/
public class MetOOPGenericP1 {
    public static void main(String[] args) {
        Accaunt acc1 = new Accaunt("1", 0); // <> необходимо указывать, какой все-таки тип будет подаваться
        System.out.println(acc1.getId());
        System.out.println(acc1.getSum());
        acc1.setSum(5000);
        System.out.println(acc1.getSum());

        Account2<String> acc2 = new Account2<>("123fg", 3000);
        System.out.println(acc2.getId());
    }
}
//допустим, будет класс банковской среды

class Accaunt implements Accaunter<String>{ //<T> - любая буква, обозначает любой тип переменной
    private String id;
    private int sum;

    Accaunt(String id, int sum){
        this.id = id;       //но в этом случае Accaunt жестко привязан к String, 2 вариант смотреть ниже Accaunt2
        this.sum = sum;
    }

    public String getId(){return id;} //получаем id типа T
    public int getSum(){return sum;} // получаем сумму
    public void setSum(int sum){this.sum = sum;} //сетаем сумму для объекта
}

interface Accaunter<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}

interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class Account2<T> implements Accountable<T>{

    private T id;
    private int sum;

    Account2(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}