package kirill.metanit;

//в данном случае, обощение имеет только класс-наследник
public class MetGenExtendClass {
    public static void main(String[] args) {
        DepositAccount2 dp2 = new DepositAccount2("User1", 1230);
        System.out.printf("%d %s\n",dp2.getId(), dp2.getName());
        dp2.setId(9900);
        System.out.println(dp2.getId());
    }
}


class Account9
{
    private final String _name;
    String getName(){return _name;}
    Account9(String name)
    {
        _name=name;
    }
}

class DepositAccount2<T> extends Account9{

    private T _id;
    T getId(){return _id;}
    DepositAccount2(String name, T id){
        super(name);
        _id = id;
    }
    T setId(T id){return _id = id;}
}

/*

Объект одного обобщенного типа можно привести к другому типу, если они используют один и тот же тип

можно: (если тип одинаковый)
DepositAccount<Integer> depAccount = new DepositAccount(10);
Account<Integer> account = (Account<Integer>)depAccount;
System.out.println(account.getId());

нельзя: (если тип разный)
DepositAccount<Integer> depAccount = new DepositAccount(10);
Account<String> account = (Account<String>)depAccount;

class Account<T>
{
    private T _id;
    T getId(){return _id;}
    Account(T id)
    {
        _id = id;
    }
}

class DepositAccount<T> extends Account<T>{

    DepositAccount(T id){
        super(id);
    }
}
 */