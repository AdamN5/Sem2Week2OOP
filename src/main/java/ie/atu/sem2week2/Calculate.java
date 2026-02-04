package ie.atu.sem2week2;

import lombok.Getter;
import lombok.Setter;

public class Calculate {
    @Getter
    @Setter
    private int num1;
    @Getter
    @Setter
    private int num2;
    private int total;

    public Calculate(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add() {
        return num1 + num2;
    }
    public int subtract() {
        return num1 - num2;
    }
    public int multiply() {
        return num1 * num2;
    }
    public int divide() {
        return num1 / num2;
    }


}
