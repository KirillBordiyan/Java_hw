package kirill.programHwOOP.hw7.model.service;

import kirill.programHwOOP.hw7.model.numbers.ComplexNumber;

public class ComplexService implements CalculateInterface<ComplexNumber> {

    @Override
    public ComplexNumber addition(ComplexNumber complexNumber,
                                  ComplexNumber complexNumber3){
        double firstReal = Double.parseDouble(complexNumber.getReal());
        double secondReal = Double.parseDouble(complexNumber3.getReal());

        String resultReal = String.format("%.2f",firstReal+secondReal);

        double firstImg = Double.parseDouble(complexNumber.getImaginary().replace("i",""));
        double secondImg = Double.parseDouble(complexNumber3.getImaginary().replace("i",""));

        String resultImg = String.format("%.2f",firstImg+secondImg) + "i";

        return new ComplexNumber(resultReal, resultImg);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber,
                                  ComplexNumber complexNumber3){

        double firstReal = Double.parseDouble(complexNumber.getReal());
        double secondReal = Double.parseDouble(complexNumber3.getReal());

        double firstImg = Double.parseDouble(complexNumber.getImaginary().replace("i",""));
        double secondImg = Double.parseDouble(complexNumber3.getImaginary().replace("i",""));

        String resReal = String.valueOf((firstReal * secondReal)-(firstImg * secondImg));
        String resImg = (firstReal * secondImg) + (firstImg * secondReal) + "i";



        return new ComplexNumber(resReal, resImg);
    }

    public ComplexNumber divide(ComplexNumber complexNumber,
                                ComplexNumber complexNumber3){

        double secondReal = Double.parseDouble(complexNumber3.getReal());
        double secondImg = Double.parseDouble(complexNumber3.getImaginary().replace("i",""));

        ComplexNumber numerator = multiply(complexNumber,
                new ComplexNumber(complexNumber3.getReal(),
                        String.valueOf(Double.parseDouble(complexNumber3.getImaginary()
                                .replace("i",""))
                                * -1)));

        double denominator = (secondReal * secondReal) + (secondImg * secondImg);


        ComplexNumber result = new ComplexNumber(
                String.format("%.2f",Double.parseDouble(numerator.getReal())/denominator),
                String.format("%.2f",(Double.parseDouble(numerator.getImaginary()
                        .replace("i", ""))
                        / denominator))+ "i");
        return result;
    }
}
