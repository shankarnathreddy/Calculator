import java.util.Scanner;

class ScientificCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double num1, num2;
String operator;

try {
System.out.print("Enter first number: ");
num1 = scanner.nextDouble();

System.out.print("Enter operator (+, -, *, /, ^,sin,cos,tan,log,sinh,cosh,tanh,asin,acos,atan): ");
operator = scanner.next();

if (operator.equals("^")) {
System.out.print("Enter exponent: ");
num2 = scanner.nextDouble();
} else {
System.out.print("Enter second number: ");
num2 = scanner.nextDouble();
}

double result = 0.0;

switch (operator) {
case "+":
result = num1 + num2;
break;
case "-":
result = num1 - num2;
break;
case "*":
result = num1 * num2;
break;
case "sin":
result = Math.sin(num1);
break;
case "sinh":
result = Math.sinh(num1);
break;
case "asin":
result = Math.asin(num1);
break;


case "cos":
result = Math.cos(num1);
break;
case "cosh":
result = Math.cosh(num1);
break;
case "acos":
result = Math.acos(num1);
break;

case "tan":
result = Math.tan(num1);
break;
case "tanh":
result = Math.tanh(num1);
break;
case "atan":
result = Math.atan(num1);
break;


case "log":
result = Math.log(num1);
break;

case "/":
if (num2 == 0.0) {
throw new ArithmeticException("Division by zero is not allowed");
}
result = num1 / num2;
break;
case "^":
result = Math.pow(num1, num2);
break;
default:
throw new IllegalArgumentException("Invalid operator");
}

System.out.println("Result: " + result);
} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
} finally {
scanner.close();
}
}
}