package calculator;

class Calculator {

    private double result;
//    double first;
//    double second;

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
//        this.result = 2.0;
        this.result = first / second;
    }


    public double getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }

//    public static void main(String[] args) {
////        System.out.println("Enter the expression");
////        String inputExpression = System.io.read("Your expression is: ");
////
////        // replace(char oldChar, char newChar) - замена в строке одного символа на другой;
////        inputExpression.replace(' ','');
////        // split(String regex) - разбивает строку на части, границами разбиения являются вхождения строк, удовлетворяющих регулярному выражению;
////        inputExpression.split("");
//
//        add(1,2);
//        System.out.println("Adding: " + result);
//
//        substruct(1,2);
//        System.out.println("Substract: " + result);
//
//        div(1,2);
//        System.out.println("Div: " + result);
//
//        multiple(1,2);
//        System.out.println("Multiple: " + result);
//    }
}