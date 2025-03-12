public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3) {
            return "Error";
        }

        try {
            int leftOperand = Integer.parseInt(args[0]);
            String operator = args[1];
            int rightOperand = Integer.parseInt(args[2]);

            switch (operator) {
                case "+":
                    return Integer.toString(leftOperand + rightOperand);
                case "-":
                    return Integer.toString(leftOperand - rightOperand);
                case "*":
                    return Integer.toString(leftOperand * rightOperand);
                case "/":
                    if (rightOperand == 0) {
                        return "Error";
                    }
                    return Integer.toString(leftOperand / rightOperand);
                case "%":
                    if (rightOperand == 0) {
                        return "Error";
                    }
                    return Integer.toString(leftOperand % rightOperand);
                default:
                    return "Error";
            }
        } catch (NumberFormatException e) {
            return "Error";
        }
    }
}