package kirill.programHwOOP.hw7.model.numbers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegularNumber implements DefaultNumbers {
    private String real;

    public RegularNumber(String real){
        this.real = real;
    }

    @Override
    public String toString() {
        return real;
    }
}
