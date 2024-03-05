package calculator;

public class Calculator_model {
    private String operation;
    private double number1;
    private double number2;
    private double result;
    public Calculator_model(){
        operation = "";
        number1 = 0;
        number2 = 0;
        result = 0;
    }
    public void setOperation(String operation){
        this.operation = operation;
    }
    public void setNumber1(double number1){
        this.number1 = number1;
    }
    public void setNumber2(double number2){
        this.number2 = number2;
    }

    public String getOperation(){
        return operation;
    }
    public String calculate(String str){
        if(operation.equals("+")){
            result = number1 + number2;
        }else if(operation.equals("-")){
            result = number1 - number2;
        }else if(operation.equals("*")){
            result = number1 * number2;
        }else if(operation.equals("/")){
            result = number1 / number2;
        }
        return result + "";
    }
    public double getResult(){
        return result;
    }
    public void appendNumber(String number){
        if(operation.equals("")){
            number1 = number1 * 10 + Double.parseDouble(number);
        }else{
            number2 = number2 * 10 + Double.parseDouble(number);
        }
    }

    public void clear(){
        operation = "";
        number1 = 0;
        number2 = 0;
        result = 0;
    }
}
