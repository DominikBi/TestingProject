package Calculator;

import java.util.ArrayList;

public class LinearConverter {
    private ArrayList<Integer> numbers;
    private ArrayList<Parameter> parameters;

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public ArrayList<Parameter> getParameters() {
        return parameters;
    }

    LinearConverter(String input){
        String currentNumber = "";
        numbers = new ArrayList<>();
        parameters = new ArrayList<>();
        for(char c : input.toCharArray()){
            if(c == ';'){
                numbers.add(Integer.parseInt(currentNumber));
                currentNumber = "";
                System.out.println(numbers);
            }
            if(!(c == ' ')) {
                try {
                    currentNumber += String.valueOf(Character.digit(c,10));


                } catch (NumberFormatException e) {
                    switch (c){
                        case '+': parameters.add(Parameter.PLUS);
                        case '-': parameters.add(Parameter.MINUS);
                        case '*': parameters.add(Parameter.MULTIPY);
                        case '/': parameters.add(Parameter.DIVIDE);
                        default: System.err.println("Wrong syntax used! ");

                    }
                }
            }else {
                numbers.add(Integer.parseInt(currentNumber));
                currentNumber = "";

            }
        }
    }
}
