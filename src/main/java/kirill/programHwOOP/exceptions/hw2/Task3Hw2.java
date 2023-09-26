package kirill.programHwOOP.exceptions.hw2;

public class Task3Hw2 {
    //задание 3, начальный вариант (для удобства поменял начальный printSum() на printSum2())
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum2(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum2(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }



    //вариант исправления: так как в каждом блоке catch разная обработка ошибок (вывод в консоль разного текста),
    //то мы не можем их объединить, плюс ко всему - NullPointerException & IndexOutOfBoundsException это наследники
    //(пусть и не прямые) класса Throwable.
    //Так как блоки catch идут по очереди, не было бы смысла обрабатывать каждое исключение по своему -
    // все попадало бы под Throwable.
    //нет нужды в throws Exception в шапке, так как мы их обрабатываем try-catch
    //также нет смысла пробрасывать ошибку в методе printSum()
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
