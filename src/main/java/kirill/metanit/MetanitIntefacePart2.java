package kirill.metanit;

public class MetanitIntefacePart2 {
    public static void main(String[] args) {
        Calculatable result = new Calculation();
        System.out.println(result.sum(1,2,3));
        System.out.println(result.sum(6,7));
    }
}


interface Calculatable{
    //По умолчанию все методы в интерфейсе фактически имеют модификатор public.
    // Однако начиная с Java 9 мы также можем определять в интерфейсе методы с модификатором private.
    // Они могут быть статическими и нестатическими, но они не могут иметь реализации по умолчанию.
    default int sum(int a, int b){
        return sumAll(a,b);
    }

    default int sum(int a, int b, int c){
        return sumAll(a,b,c);
    }

    //например вот метод sumAll будет private
    //он используется неоднократно в самом интерфейсе, однако напоказ нет необходимости его выносить
    //значит, сделав его приватным (скрытым для объектов класса, который использует этот интерфейс),
    // мы будем просто вызывать методы этого интерфейса (эти методы по умолчанию) и получать необходимый результат
    private int sumAll(int... values){
        int result = 0;
        for(int item: values){
            result += item;
        }
        return result;
    }

}

class Calculation implements Calculatable{
    //этот класс пуст, незачем здесь методы, которые можно по умолчанию написать в
    //интерфейсе

}
