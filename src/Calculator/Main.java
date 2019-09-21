package Calculator;

public class Main {
    public static void main(String[] args){
        UserRequest userRequest = new UserRequest();
        if(userRequest.isLinear()){
            LinearConverter linearConverter = new LinearConverter(userRequest.getText());
            System.out.println("Numbers: " + linearConverter.getNumbers());
        }

    }
}
