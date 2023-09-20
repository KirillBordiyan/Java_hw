package kirill.programHwOOP.hw7.model.service;

public interface CalculateInterface<T> {
    public T addition(T firstOperand, T secondOperand );
    public T multiply(T firstOperand, T secondOperand);
    public T divide(T firstOperand, T secondOperand);
}
