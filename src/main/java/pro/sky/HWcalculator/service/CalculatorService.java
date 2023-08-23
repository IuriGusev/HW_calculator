package pro.sky.HWcalculator.service;

public interface CalculatorService {
    String welcome();
    String plus(int num1, int num2);
    String subtract (int num1, int num2);
    String multiply (int num1, int num2);
    String divide(Integer num1, Integer num2);
}
