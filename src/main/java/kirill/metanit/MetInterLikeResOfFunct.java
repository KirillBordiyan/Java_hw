package kirill.metanit;


//здесь рассматриваем вариант, когда интерфейс является параметром класса или результатом метода
//как и с классами, интерфейсы могут использоваться в кач-ве типа параметров метода или в кач-ве возвращаемого типа
public class MetInterLikeResOfFunct {
    public static void main(String[] args) {
        Printable3 pr = CreatePrintable("aabbcc", false); //создаем объект интерфейса через метод,
        pr.print3();                                 //в котором происходит инициализация самих объектов вызываемых классов

        read(new Book3("java", "any")); //например, сюда мы передали объект Book3
        read(new Journal3("Journal 3")); //сюда объект Journal3
        //кидая в метод объекты классов, мы вызываем метод класса, который описывает реализацию метода интерфейса
        read(pr); //сюда ы передаем объект интерфейса (он создается) и далее применяется вызванный метод,
                  // который реализован в соответствующем классе
        //объект интерфейса передан как параметр метода
    }


    static void read(Printable3 p){
        p.print3();
    }//метод принимает объект интерфейса и вызывает метод этого интерфейса для переданного объекта

    static Printable3 CreatePrintable(String name, boolean option){
        if(option){
            return new Book3(name, "undef");
        }else{
            return new Journal3(name);
        }
    }//создаем объект конкретного класса
}


interface  Printable3{
    void print3();
}

class Book3 implements Printable3{
    String name;
    String author;

    Book3(String name, String author){ //по классике, 2 поля класса, конструктор
        this.name = name;
        this.author = author;
    }

    public void print3(){ // и реализация метода интерфейса
        System.out.printf("%s (%s)\n", name, author);
    }
}


class Journal3 implements Printable3{ //аналогично: поле названия, конструктор, реализация print3()
    private String name;

    String getName(){
        return name;
    }

    Journal3(String name){
        this.name = name;
    }

    public void print3(){
        System.out.println(name);
    }
}
