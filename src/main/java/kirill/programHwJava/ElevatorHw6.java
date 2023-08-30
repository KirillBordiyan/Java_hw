package kirill.programHwJava;
import java.time.temporal.ValueRange;

public class ElevatorHw6 {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(2, 10);
        System.out.println(elevator);
    }
}

//    Создать собственный класс, описывающий Лифт.
//        У класса должно быть приватное поле, указывающее на текущий этаж.
//        У класса должен быть 2 конструктора:
//        1. принимающий диапазон минимального и максимального значения лифта.
//        2. принимающий максимальное значение. в этом случае минимальное значение = 1
//        По умолчанию лифт находится в позиции минимального этажа.
//
//        У класса должен быть метод move(int floor), который меняет состояние лифта и отвозит его на указанный этаж.
//
//        Пример кода:
//        Elevator elevator = new Elevator(2, 7); // лифт находится в позиции 2
//        elevator.move(4); // лифт поднялся на 4 этаж
//
//        Доп задание:
//        Добавить проверку аргументов конструктора и метода move:
//        1. В констукторе запретить создавать лифт, у которого minFloor >= maxFloor
//        2. В методе move запретить перемещаться на этаж, который не входит в допустимый диапазон.
//
//        По желанию можно определить метод toString, в котором будет возвращаться диапазон и текущий этаж.
//        Пример: [1, 10] -> 3


class Elevator{


    int minLevel;
    int maxLevel;
    private int currentLevel;

    public Elevator(int minLevel, int maxLevel) {
            if((minLevel > 0 && maxLevel> 0) && (minLevel < maxLevel)){
                this.minLevel = minLevel;
                this.maxLevel = maxLevel;
                this.currentLevel = minLevel;
            }else{
                throw new IllegalArgumentException("""
                        
                        Этажи не могут быть отрицательными;
                        Последний должен быть выше первого;
                        Первый и последний не могут быть равны!""");
            }
    }

    public Elevator(int maxLevel){
        this(1, maxLevel);
    }

    public void move(int floor){
        ValueRange vlr = ValueRange.of(minLevel,maxLevel);
        if(vlr.isValidIntValue(floor)){
            setCurrentLevel(floor);
        }else {
            throw new IndexOutOfBoundsException(
                    "\nпереместиться можно только в пределах от "+minLevel+" до "+maxLevel+"\n");

        }
    }

    public String toString(){
        /*
        call sout({name});
        */
        return "Текущий этаж: "+currentLevel
                +"\nМаксимальный: "+ maxLevel
                +"\nМинимальный: "+minLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    private void setCurrentLevel(int currentLevel) {
        /*
        use only in class Elevator,
        to set new currentLevel parameter use method "move"
        */
        this.currentLevel = currentLevel;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(int minLevel) {
        if(minLevel > 0 && minLevel < maxLevel) {
            this.minLevel = minLevel;
        }else {
            throw new IllegalArgumentException("""
                    
                    Последний должен быть выше первого;
                    Первый и последний не могут быть равны""");
        }
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        if(maxLevel > 0 && maxLevel>minLevel) {
            this.maxLevel = maxLevel;
        }else{
            throw  new IllegalArgumentException("""
                    
                    Максимальный не может быть ниже установленного минимального;
                    Максимальный этаж не может быть отрицательным
                    """);
        }
    }

}
