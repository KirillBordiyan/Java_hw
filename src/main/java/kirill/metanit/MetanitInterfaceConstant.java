package kirill.metanit;

public class MetanitInterfaceConstant {
    public static void main(String[] args) {
        WaterPipe wp = new WaterPipe();
        wp.printState(1);
    }
}

//===================== константы ==========
interface Stateable{
    int OPEN = 1; //эта константа
                  //по умолчанию ее модификаторы доступа public static final
                    //значение константы доступно в любом месте программы
    int CLOSED = 0;

    void printState(int n);
    //в этот метод передается параметр и далее он сравнивается с константой интерфейса
    //если есть совпадение, то уже в месте реализации (в классе) будет исполняться определенный блок кода
}

class WaterPipe implements Stateable{
    public void printState(int n){
        if(n == OPEN){
            System.out.println("Water is open!");
        } else if (n == CLOSED) {
            System.out.println("Water is closed!");
        }else{
            System.out.println("invalid data");
        }
    }
}



//==================== множественная реализация =========
interface PrintableExmpl{
    void print(int n);
} //интерфейс с 1 методом

interface SearchableExmpl{
    void search(String args);
} //интерфейс с 1 методом

class Dictionary implements PrintableExmpl, SearchableExmpl{
    int n = 1;
    String args = "бизон";

    public void print(int n){
        System.out.println(n);
    }

    public void search(String args){
        System.out.println(args);
    }
}//класс, который должен реализовывать методы используемых интерфейсов




//=========== наследование интерфейсов ==========
//допустим, предыдущий функционал интерфейса из множественной реализации мы хотим сделать интерфейсом-родителем
//для другого, тогда это будет выглядеть так:
interface AboutAuthorAndPrint extends PrintableExmpl{
    default void getAuthor(String author){ //интерфейс наследник AboutAuthorAndPrint имеет свой метод (по умолчанию)
        System.out.println(author);         //но в ситуации, когда другой класс будет наследоваться от этого интерфейса
                                            //у него обязательно должна быть реализация и интерфейса наследника(AboutAuthorAndPrint)
                                            //и интерфейса-родителя (PrintableExmpl)
    }
}