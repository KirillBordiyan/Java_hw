package kirill.metanit;

/*создали функциональный интерфейс
*создали объект этого интерфейса, в который записали метод в виде лямбды
* далее в метод суммы передали массив и лямбду
*
*
*
 */
public class MetLambdas2 {
    public static void main(String[] args) {

        Expression func = n -> n%2==0;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sum(nums, func));
    }

    private static int sum(int[] numbers, Expression func){
        int res = 0;
        for (int i: numbers){
            if(func.isEqual(i)){
                res+=i;
            }
        }
        return res;
    }

}

interface Expression{
    boolean isEqual(int n);
}