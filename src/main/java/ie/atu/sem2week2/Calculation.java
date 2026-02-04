package ie.atu.sem2week2;

public class Calculation {

    private String operation;
    private double total;

    public Calculation(String operation, double total) {
        this.operation = operation;
        this.total = total;
    }

    public String getOperation() {
        return operation;
    }

    public double getTotal() {
        return total;
    }
}
