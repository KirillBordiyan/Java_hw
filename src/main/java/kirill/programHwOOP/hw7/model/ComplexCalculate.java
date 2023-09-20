package kirill.programHwOOP.hw7.model;

public class ComplexCalculate implements CalcutateInterface<ComplexNumber>{

    @Override
    public ComplexNumber addition(ComplexNumber complexNumber,   // 3, (+ 3i)
                                  ComplexNumber complexNumber3){  // 4, (- 2i)
        Double firstReal = Double.parseDouble(complexNumber.getReal()); //3
        Double secondReal = Double.parseDouble(complexNumber3.getReal());//4

        String resultReal = String.format("%.2f",firstReal+secondReal); //7


        Double firstImg = Double.parseDouble(complexNumber.getImaginary().replace("i",""));//3
        Double secondImg = Double.parseDouble(complexNumber3.getImaginary().replace("i",""));//-2

        String resultImg = String.format("%.2f",firstImg+secondImg) + "i";//1i

        return new ComplexNumber(resultReal, resultImg);//7, 1i
    }

    public ComplexNumber multiply(ComplexNumber complexNumber,
                                  ComplexNumber complexNumber3){

        Double firstReal = Double.parseDouble(complexNumber.getReal());
        Double secondReal = Double.parseDouble(complexNumber3.getReal());

        Double firstImg = Double.parseDouble(complexNumber.getImaginary().replace("i",""));
        Double secondImg = Double.parseDouble(complexNumber3.getImaginary().replace("i",""));

        String resReal = String.valueOf((firstReal * secondReal)+(firstImg * secondImg * -1));
        String resImg = (firstReal * secondImg) + (firstImg * secondReal) + "i";


        return new ComplexNumber(resReal, resImg);
    }

    public ComplexNumber divide(ComplexNumber complexNumber,
                                ComplexNumber complexNumber3){

        Double secondReal = Double.parseDouble(complexNumber3.getReal());
        Double secondImg = Double.parseDouble(complexNumber3.getImaginary().replace("i",""));

        ComplexNumber cheslitel = multiply(complexNumber,
                new ComplexNumber(complexNumber3.getReal(),
                        String.valueOf(Double.parseDouble(complexNumber3.getImaginary().replace("i","")) * -1)));

        Double znamenatel = (secondReal * secondReal) + (secondImg * secondImg);


        ComplexNumber result = new ComplexNumber(
                String.format("%.2f",Double.parseDouble(cheslitel.getReal())/znamenatel),
                String.format("%.2f",(Double.parseDouble(cheslitel.getImaginary().replace("i", "")) / znamenatel))+ "i");


        return result;
    }

    //TODO надо как-то LSP выполнить через комплексное и обыкновенное
}
