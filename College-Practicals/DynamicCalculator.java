public class DynamicCalculator {

    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("   Error: Missing Arguments!");
            System.out.println("   How to run this program:");
            System.out.println("   Usage: java DynamicCalculator <num1> <num2> ... <operator_name>");
            System.out.println("   Example for Sum:  java DynamicCalculator 10 20 30 add");
            System.out.println("   Example for Mul:  java DynamicCalculator 5 2 4 mul");
            System.out.println("   Example for sub:  java DynamicCalculator 5 2 4 sub");
            System.out.println("-------------------------------------------------------------------");
            return;
        }

        int len = (args.length);
        String operator = args[len - 1];

        switch (operator) {
            case "+":
                add(args);

                break;
            case "*":
                mul(args);
                break;
            case "-":
                Sub(args);
                break;
            case "/":
                div(args);
                break;
            default:
                System.out.println("  Error: Invalid Operator '" + operator + "'");
                System.out.println(" Please use '+' for Addition or 'x' for Multiplication.");
                break;

        }
    }

    public static void add(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length - 1; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.err.println("Sum :" + sum);
    }

    public static void mul(String[] args) {
        long m = 1L;

        for (int i = 0; i < args.length - 1; i++) {
            m = m * Integer.parseInt(args[i]);
        }
        System.out.println("Multiplication :" + m);
    }

    public static void Sub(String[] args)
    {
        int result = Integer.parseInt(args[0]);

        for(int i=1; i < args.length-1;i++)
        {
            result -= Integer.parseInt(args[i]);
        }
        System.out.println("Subtrection :"+result);
    }
    public static void div(String[] args)
    {
       double result = Double.parseDouble(args[0]); 
        for (int i = 1; i < args.length - 1; i++) {
            int nextNum = Integer.parseInt(args[i]);
            
            
            if (nextNum == 0) {
                System.out.println("  Error: Cannot divide by zero!");
                return;
            }
            result /= nextNum;
        }
        System.out.println("Div: " + result);
    }
}
