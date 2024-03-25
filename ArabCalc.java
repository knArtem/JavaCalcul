public class ArabCalc {
    protected int operand1;
    protected int operand2;
    protected String operation;
    protected int result;

    public ArabCalc(int o1, int o2, String operation) {
        operand1 = o1;
        operand2 = o2;
        this.operation = new String(operation);
        result = Calculation();

    }

    protected int Calculation() {
        if (this.operation.equals("+"))
            return plus();
        else if (this.operation.equals("-"))
            return minus();
        else if (this.operation.equals("*"))
            return multiply();
        else if (this.operation.equals("/"))
            return divide();
        else
            return 0;
    }

    protected int plus(){
        return operand1 + operand2;
    }

    protected int minus() {
        return operand1 - operand2;
    }
    protected int multiply(){
        return operand1 * operand2;
    }

    protected int divide(){
        return operand1 / operand2;
    }

    protected String print_result() throws Exception {
        return Integer.toString(result);
    }
}
