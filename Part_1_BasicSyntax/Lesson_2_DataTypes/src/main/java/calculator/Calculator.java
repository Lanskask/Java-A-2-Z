package calculator;

/**
 * @param first, second
 * @return result
 * @author smurtazin
 * @since 01.10.2016
 * @version 0.2
 */
class Calculator {

    private double result;

    void add(double first, double second){
        result = first + second;
    }

    void substruct(double first, double second){
        result = first - second;
    }

    void multiple(double first, double second){
        result = first * second;
    }

    public void div(double first, double second){
        this.result = first / second;
    }

    public double getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }
}