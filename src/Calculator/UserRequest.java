package Calculator;

import java.util.Scanner;

public class UserRequest {

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    public boolean isLinear() {
        return isLinear;
    }

    public void setLinear(boolean linear) {
        isLinear = linear;
    }

    private boolean isLinear;

    public UserRequest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in: ");
        text = scanner.next();
        isLinear = !text.contains("(") && !text.contains(")");
    }
}
