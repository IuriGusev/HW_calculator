package pro.sky.HWcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public int plus(int num1, int num2){
        return num1 + num2;
    }
    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
