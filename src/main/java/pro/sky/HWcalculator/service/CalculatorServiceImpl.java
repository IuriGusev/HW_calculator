package pro.sky.HWcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public Integer plus(int num1, int num2){
        int result = num1+num2;
        return Integer.valueOf(num1 + " + "  + num2 + " = " + result);
    }
    @Override
    public Integer subtract(int num1, int num2) {
        int result = num1 - num2;
        return Integer.valueOf(num1 + " - " + num2 + " = " + result);
    }
    @Override
    public Integer multiply(int num1, int num2) {
        int result = num1 * num2;
        return Integer.valueOf(num1 + " * " + num2 + " = " + result);
    }
    @Override
    public Double divide(int num1, int num2) {
        double result = (double) num1 / num2;
        return Double.valueOf(num1 + " / " + num2 + " = " + result);
    }
}
