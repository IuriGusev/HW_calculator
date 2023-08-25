package pro.sky.HWcalculator.service;

public interface CalculatorService {
    String welcome();
    int plus(int num1, int num2);
    int subtract (int num1, int num2);
    int multiply (int num1, int num2);
    Integer divide(Integer num1, Integer num2);
}
