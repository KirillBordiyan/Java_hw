package kirill.helper;

public class HelperHw1 {
    public int countNTriangle(int n){
        int result = 0;
        for(int i = 1; i<=n;i++){
            result += i;
        }
        return result;
    }

    //Напишите функцию printPrimeNums,
    // которая выведет на экран все простые числа от 1 до 1000, каждое на новой строке.
    //Напишите свой код в методе printPrimeNums класса Answer.

    public void PrintNums(){
        for(int i = 2; i <= 1000; i++){
            boolean IsPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    IsPrime = false;
                }
            }
            if(IsPrime){
                System.out.println(i);
            }
        }
    }


    public int calculate(char op, int a, int b){
        int result = 0;
        try {
            switch (Character.toString(op)) {
                case ("+"):
                    return result = a + b;
                case ("-"):
                    result = a - b;
                    break;
                case ("*"):
                    result = a * b;
                    break;
                case ("/"):
                    result = a / b;
                    break;
                default:
                    throw new Exception("invalid operator");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}





