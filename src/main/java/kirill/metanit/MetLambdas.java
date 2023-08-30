package kirill.metanit;



public class MetLambdas {
    public static void main(String[] args) {
        Operantable oper = Integer::sum;
        //== (x,y)->x+y;
        int result = oper.calculate(10,10);
        System.out.println(result);

    }
}

interface Operantable{
    int calculate(int x, int y);

}
