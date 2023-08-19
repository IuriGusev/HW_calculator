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
        return calculatorService.plus(num1, num2);
    }
    @GetMapping("/subtract")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.subtract(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping("/devide")
    public String devide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.devide(num1, num2);
    }
}

