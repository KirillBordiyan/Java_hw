package kirill.metanit;

public class MetanitInterfacePart1 {

    public static void main(String[] args) {
        Book book1 = new Book("Док Живаго", "Б. Пастернак");
        book1.print();
        //теперь с классом Journal
        Journal journal1 = new Journal("Forbs");
        System.out.println(journal1.getName());//эта и следующая строки аналогичны
        journal1.print();

        //переменная типа Printable может хранить ссылку на объект типа Journal
        //но потребуется явное преобразование
        Printable journal2 = new Journal("Affairs");
        journal2.print();//Affairs
        //но
        //journal2.getName(); - просто нельзя, необходимо преобразование типов
        String name = ((Journal)journal2).getName(); //IDE предложит сделать переменную journal2 сразу объектом Journal
        System.out.println(name);
        //т.е. если мы хотим обратиться к методам класса Journal, необходимо сделать явное преобразование типов



        //обращение к статическим методам интерфейса:
        Printable.read(); //по идее можно только в main
    }
}
    //один класс может применить множество интерфейсов
    //они определяют некоторый функционал, который не реализован, но эту реализацию уже производит сам класс
    //они чем-то похожи на абстрактные методы абстрактных классов как в примере MetanitOOP.java
    //например:

interface Printable{ //интерфейс оглавняется словом interface
    default void print(){
        System.out.println("Undefined");
    } //в данном случае интерфейс имеет один метод, о реализации которого не сказано ни байта
    //ОДНАКО
    //после JDK 8 появилась опция методов по умолчанию - частичная реализация метода, если его не реализовали в каком-то классе
    //для этого вначале дописывается default


    //имеются также статические методы интерфейса
    static void read(){
        System.out.println("read printable");
    }
}

class Book implements Printable{
    String name;
    String author;

    Book(String name, String author){ //конструктор объекта класса Book(название книги, автор)
        this.name=name;
        this.author =author;
    }

    public void print(){//этот метод тянется от интерфейса Printable и непоредственно его реализует
        System.out.printf("%s -> %s\n", name, author);
    }
        //но необходимо учитывать, если класс применяет интерфейс, то он должен реализовывать все методы интерфейса
        //если такого не происходит, то класс должен стать абстрактным, а все его наследники уже должны реализовать эти методы
        //также нельзя напрямую создавать объект интерфейса, т.е.
        //Printable pr = new Printable();
        //pr.print();     ----- не сработает

}
//создадим еще один класс, который реализует интерфейс Printable
class Journal implements Printable{
    private String name;

    Journal(String name){//конструктор
        this.name = name;
    }

    String getName(){//геттер параметра имя
        return name;
    }

    public void print(){
        System.out.println(name);
    }
    //учитывая, что у нас есть метод по умолчанию в интерфейсе Printable
    //мы можем не переопределять метод print ни тут, ни в классе Book
    //но на выходе получим то, что описано там, а не ту инфу, что нам требуется

}
