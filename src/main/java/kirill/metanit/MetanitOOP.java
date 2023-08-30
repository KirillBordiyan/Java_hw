package kirill.metanit;

public class MetanitOOP {
    public static void main(String[] args) {
        //создали и посмотрели на конструктор класса Employee
        Employee tom = new Employee("Tommy", "Raiphaizen");
        System.out.println(tom.getName()); //Tommy
        tom.display(); //Employee: Tommy 	 Bank: Raiphaizen


        //тоже самое проделаем с классом Client
        //посмотрим на результат вывода display
        Client sam = new Client("Sam", "Raiphaizen", "1234");
        System.out.println(sam.getName());
        System.out.println(sam.getPassword());
        sam.display(); //Client Sam used bank Raiphaizen, his password (confident) is 1234

        //попробуем через Object
        //обратное (нисходящее) преобразование немного сложнее
        //вариант 1
        Object alice = new Client("Alice", "Raiphaizen","3344");
        Client alice2 = (Client)alice;
        alice2.display();
        //вариант 2
        Object jhon = new Employee("Jhon", "Alpha-bank");
        ((Employee)jhon).display();
        //или еще пример
        Object nick = new Client("Nick", "Alpha-bank","9987");
        ((Client)nick).display();


        //также можно использовать условие через instanceof
        Object ronn = new Client("Ronn", "Alpha-bank", "5656");
        if(ronn instanceof Employee employeeRonn){ //это выражение проверяет, является ли перемнная ronn объектом
            employeeRonn.display();                //класса Employee (как переменная employeeRonn) и
        }else{                                     //возвращает true, если да
            System.out.println("this person is not employee");
        }
        //пример, если да
        Object harry = new Employee("Harry", "Alpha-bank");
        if(harry instanceof Employee employeeRonn){
            employeeRonn.display();
        }else{
            System.out.println("this person is not employee");
        }


    }
}


abstract class  Person{

    //класс Person имеет поле name
    private String name;

    //конструктор создания экземпляра класса
    //надо передать String name, чтобы этот параметр name присвоился объекту класса
    public Person(String name){
        this.name = name;
    }

    //геттер имени объекта (берем поле name из текущего объекта)
    public String getName(){
        return name;
    }

    //получаем ифну
    //будет реализован дальше
    public abstract void display();

}

class Employee extends Person{
    //наследники не могут наследоваться от нескольких классов - только от одного
    //отсутствует множественное наследование
    //однако!!! смотреть интерфейсы

    //название банка сотрудника
    private String bank;

    //конструктор объекта Employee
    //поле name получаем через super(name) - берем из конструктора класса Person (он базовый)
    public Employee(String name, String company){
        super(name);
        this.bank = company;
    }


    //реализуем метод display()
    public void display(){
        System.out.printf("Employee:%s \t Bank:%s \n", super.getName(), bank);
    }

}


class Client extends Person{

    //у клиента есть код
    private String password;
    //а также инфа о его банке
    private String bank;

    //конструктор создания объекта Client с помощью конструктора класса Person (super(name)) и собственных полей
    //bank & password
    public Client(String name, String bank, String password){
        super(name);
        this.bank = bank;
        this.password = password;
    }

    //попробуем получить password этого клиента
    public String getPassword(){
        return password;
    }

    //реализуем свои метод display для объекта класса Client
    public void display(){
        System.out.printf("Client %s used bank %s, his password (confident) is %s\n", super.getName(), bank, password);
    }
}
