package kirill.metanit;

import java.lang.reflect.Type;

//перечисления (enum)
public class MetEnum {
    public static void main(String[] args) {
        Day currentDay = Day.MONDAY;
        System.out.println(currentDay);  //MONDAY


        Book4 book = new Book4("War and Peace", "L. Tolstoy", Types.BELLETRE);
        System.out.printf("Book \"%s\" has a type %s\n", book.name, book.bookType);

        switch (book.bookType) {
            case SCIENCE -> System.out.println("Science");
            case BELLETRE -> System.out.println("Belletre");
            case PHANTASY -> System.out.println("Phantasy");
            case SCIENCE_FICTION -> System.out.println("Science fiction");
        }

        //методы enum:
        //values() - само значени
        Types[] types = Types.values(); //помещаем весь enum в массив, попробуем его перебрать:
        for(Types item: types){
            System.out.println(item);
        }//получим вывод всех типов (жанров) книг
        //ordinal() - порядковый номер (с 0) в списке enum
        System.out.println(Types.BELLETRE.ordinal()); //поз 1


        //конструкторы enum
        //создать константы перечисления с помощью конструктора мы можем только внутри перечисления.
        System.out.println(Colors.RED.getCode());
        System.out.println(Colors.BLUE.getCode());


        //константы enum
        Operation op = Operation.MULTIPLY;
        System.out.println(op.action(5,7));
    }
} /*коротко говоря, есть перечисления enum с типами книг
мы создаем объект book класса Book4
передаем туда параметры названия, автора и тпиа книги как в конструкторе
программа понимает, какое значение имеет тип и подставляет нужное
главное - это указать связь enum и соответствующего параметра в самом конструкторе
*/


//перечисления можно использовать в классах для хранения данных
class Book4{
    String name;
    Types bookType;
    String author;

    Book4(String name, String author, Types type){
        this.name = name;
        bookType = type;
        this.author = author;
    }
}

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

//наверн по стандарту писать капсом, но можно и так как Belletre
enum Types {
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}


/* У enum могут быть конструкторы, поля и методы
обратимся к этому enum в main
 */
enum Colors{
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;
    Colors(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}/*тут у объекта RED есть поле code -приватное, только для этого перечисления
    этот код записывается как параметр объекта класса RED
    и после, мы его возвращаем с помощью метода
*/

/*
можно определять методы для определенных констант
*/
enum Operation{
    SUM{
        public int action(int x, int y){ return x + y;}
    },
    SUBTRACT{
        public int action(int x, int y){ return x - y;}
    },
    MULTIPLY{
        public int action(int x, int y){ return x * y;}
    };
    public abstract int action(int x, int y);
}