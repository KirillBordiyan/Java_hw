package kirill.metanit;

//Обобщенные классы могут участвовать в иерархии наследования:
// могут наследоваться от других, либо выполнять роль базовых классов
public class MetGenAndExtends {
    public static void main(String[] args) {
        DepositAcc da1 = new DepositAcc<String>("123", "first obj");
        System.out.printf("%s %s\n", da1.getId(), da1.get_name()); //123 first obj
        //при создании объекта можно явно указать тип данных этого объекта
        //тогда будет подсказка

        DepositAcc da2 = new DepositAcc<Integer>(567, "sec obj");
        System.out.printf("%d %s\n",da2.getId(), da2.get_name()); // 567 sec obj

    }
}

//базовый обобщенный класс
class Account8<T>{
    private final T _id;
    Account8(T id){
        _id = id;
    }
    T getId(){return _id;}

}

class DepositAcc<T> extends Account8<T>{ //наследуем этот класс от класса Аккаунт8
    String _name;

    DepositAcc(T id, String name){
        super(id);//в конструкторе объекта класса мы ссылаемся на конструктор этого параметра в классе Акканут
        //а не создаем новый
        //при этом, этот класс может создавать и использовать свои параметры
        _name = name;
    }
    String get_name(){return _name;}
}


/*

класс-наследник вообще может не быть обобщенным
Здесь при наследовании явным образом указывается тип, который будет использоваться конструкциями базового класса,
 то есть тип Integer.
Затем в конструктор базового класса передается значение именно этого типа

class Account<T>
{
    private T _id;
    T getId(){return _id;}
    Account(T id)
    {
        _id = id;
    }
}

class DepositAccount extends Account<Integer>{

    DepositAccount(){
        super(5);
    }
}
 */