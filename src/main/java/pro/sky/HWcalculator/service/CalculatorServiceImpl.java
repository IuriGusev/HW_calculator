package pro.sky.HWcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
    public String plus(int num1, int num2){
        int result = num1+num2;
        return num1 + " + "  + num2 + " = " + result;
    }
    public String subtract(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String devide(int num1, int num2) {
        double result = (double) num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
