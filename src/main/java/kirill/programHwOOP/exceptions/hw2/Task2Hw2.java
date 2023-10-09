//package kirill.programHwOOP.exceptions.hw2;
//
//public class Task2Hw2 {
//    public static void main(String[] args) {
//
//        //    Задание 2, начальный вариант:
//        try {
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
//
//        //вариант исправления: объединяет ArithmeticException и IndexOutOfBoundsException
//        //так как массив может иметь длину меньше или переменная d может быть < 0
//        //либо можно в catch поместить отлов  RuntimeException(),
//        // тк это базовый класс для двух используемых в этом коде
//        try {
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException | IndexOutOfBoundsException e) {
//            System.out.println("Catching exception: " + e);
//        }
//    }
//}
