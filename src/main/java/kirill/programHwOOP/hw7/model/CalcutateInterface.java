package kirill.programHwOOP.hw7.model;

public interface CalcutateInterface<T> {
    public T addition(T firstOperand, T secondOperand );
    public T multiply(T firstOperand, T secondOperand);
    public T divide(T firstOperand, T secondOperand);
}
