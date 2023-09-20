package kirill.programHwOOP.hw7.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComplexNumber {
    private String real;
    private String imaginary;

    public ComplexNumber(String real, String imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(String real){
        this(real, "0.0");
    }

    @Override
    public String toString() {
        return this.getReal()+ " + (" + this.getImaginary()+")";
    }
}
