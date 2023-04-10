package lengthconverter.lengthconverterapplication.Controller;

import lengthconverter.lengthconverterapplication.Service.LengthConverterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class LengthConverterController {
    LengthConverterService lengthConverterService = new LengthConverterService();

    @GetMapping("/")
    public String home(){
        return "Welcome to length converter app!";
    }

    @GetMapping("/metertocentimeter/data={data}")
    public BigDecimal convertMeterToCentimeter(@PathVariable("data") BigDecimal input){
        return lengthConverterService.meterToCentimeter(input);
    }

    @GetMapping("/centimetertometer/data={data}")
    public BigDecimal convertCentimeterToMeter(@PathVariable("data") BigDecimal input){
        return lengthConverterService.centimeterToMeter(input);
    }

    @GetMapping("/metertokilometer/data={data}")
    public BigDecimal convertMeterToKilometer(@PathVariable("data") BigDecimal input){
        return lengthConverterService.meterToKilometer(input);
    }

    @GetMapping("/kilometertometer/data={data}")
    public BigDecimal convertKilometerToMeter(@PathVariable("data") BigDecimal input){
        return lengthConverterService.kilometerToMeter(input);
    }

    @GetMapping("/millimetertocentimeter/data={data}")
    public BigDecimal convertMillimeterToCentimeter(@PathVariable("data") BigDecimal input){
        return lengthConverterService.millimeterToCentimeter(input);
    }

    @GetMapping("/centimetertomillimeter/data={data}")
    public BigDecimal convertCentimeterToMillimeter(@PathVariable("data") BigDecimal input){
        return lengthConverterService.centimeterToMillimeter(input);
    }
}
