package kirill.metanit;

public class MetGenericConfines {
    public static void main (String[] args) {
        Account5 acc1 = new Account5("1876", 4500);
        Account5 acc2 = new Account5("3476", 1500);

        Transaction<Account5> tran1 = new Transaction<>(acc1, acc2, 4000);
        tran1.execute();
        tran1 = new Transaction<>(acc1, acc2, 4000);
        tran1.execute();
    }
}

class Account5{
    private String id;
    private int sum;

    Account5(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId(){return id;}
    public int getSum(){return sum;}
    public void setSum(int sum){this.sum = sum;}
}

class Transaction<T extends Account5>{ // класс Account выступает как ограничение классу транзакции
    private T from;
    private T to;
    private int sum;

    Transaction(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute(){
        if(from.getSum() > sum){
            from.setSum(from.getSum () - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }else{
            System.out.println("Operation is invalid");
        }
    }

}
