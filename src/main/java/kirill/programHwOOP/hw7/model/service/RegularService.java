package kirill.programHwOOP.hw7.model.service;

import kirill.programHwOOP.hw7.model.numbers.RegularNumber;

public class RegularService implements CalculateInterface<RegularNumber> {

    @Override
    public RegularNumber addition(RegularNumber firstOperand, RegularNumber secondOperand) {
        return new RegularNumber(String.valueOf(Double.parseDouble(firstOperand.getReal())
                + (Double.parseDouble(secondOperand.getReal()))));
    }

    @Override
    public RegularNumber multiply(RegularNumber firstOperand, RegularNumber secondOperand) {
        return new RegularNumber(String.valueOf(Double.parseDouble(firstOperand.getReal())
                * Double.parseDouble(secondOperand.getReal())));
    }

    @Override
    public RegularNumber divide(RegularNumber firstOperand, RegularNumber secondOperand) {
        return new RegularNumber(String.valueOf(Double.parseDouble(firstOperand.getReal())
                / Double.parseDouble(secondOperand.getReal())));
    }
}
