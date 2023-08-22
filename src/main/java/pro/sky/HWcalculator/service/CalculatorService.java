package pro.sky.HWcalculator.service;

public interface CalculatorService {
    String welcome();
    Integer plus(int num1, int num2);
    Integer subtract (int num1, int num2);
    Integer multiply (int num1, int num2);
    Double divide(int num1, int num2);
}
