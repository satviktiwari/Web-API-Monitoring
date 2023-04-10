package lengthconverter.lengthconverterapplication.Service;

import java.math.BigDecimal;

public class LengthConverterService {
    public BigDecimal centimeterToMillimeter(BigDecimal input){
        return input.multiply(new BigDecimal("10"));
    }

    public BigDecimal millimeterToCentimeter(BigDecimal input){
        return input.multiply(new BigDecimal("0.1"));
    }

    public BigDecimal meterToKilometer(BigDecimal input){
        return input.multiply(new BigDecimal("0.001"));
    }

    public BigDecimal kilometerToMeter(BigDecimal input){
        return input.multiply(new BigDecimal("1000"));
    }

    public BigDecimal meterToCentimeter(BigDecimal input){
        return input.multiply(new BigDecimal("100"));
    }

    public BigDecimal centimeterToMeter(BigDecimal input){
        return input.multiply(new BigDecimal("0.01"));
    }

}
