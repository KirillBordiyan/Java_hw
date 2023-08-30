package kirill.metanit;

public class MetImplementsInter {
    public static void main(String[] args) {
        Journal2 j = new Journal2("abc");
        j.printPrinter();
    }
}

class Printer2{ //класс, который содержит вложенный интерфейс с 1 методом
    interface Printable2{
        void printPrinter();
    }
}


class Journal2 implements Printer2.Printable2{ //это класс, который использует вложенный интерфейс класса Printer2
    String name;                                //пример обращения выглядит так
    Journal2(String name){ //конструктор объекта класса
        this.name = name;
    }
    public void printPrinter(){ //реализация метода интерфейса, вложенного в класс
        System.out.println(name);
    }
}
