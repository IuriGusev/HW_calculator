package pro.sky.HWcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HWcalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

   private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.plus(num1,num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.subtract(num1,num2);
        return num1 + " - " + num2 + " = " + result;
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.multiply(num1,num2);
        return num1 + " * " + num2 + " = " + result;
    }
    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num2 == 0) {
            return "На 0 делить нельзя";
        }
        Integer result = calculatorService.divide(num1,num2);
        return num1 + " / " + num2 + " = " + result;
    }
}

