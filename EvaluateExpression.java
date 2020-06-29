
import java.util.Stack;
public class EvaluateExpression {

   public static int evaluate(String expression) throws Exception

   {

   char[] tokens = expression.toCharArray();

   // Stack for numbers: 'values'

   Stack<Integer> values = new Stack<Integer>();

   // Stack for Operators: 'operatorStack'

   Stack<Character> operatorStack = new Stack<Character>();

   for (int i = 0; i < tokens.length; i++)

   {

   // Current token is a whitespace, skip it

   if (tokens[i] == ' ')

   continue;

   // Current token is a number, push it to stack for numbers

   if (tokens[i] >= '0' && tokens[i] <= '9')

   {

   StringBuffer sbuf = new StringBuffer();

   // There may be more than one digits in number

   while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')

   sbuf.append(tokens[i++]);

   values.push(Integer.parseInt(sbuf.toString()));

   }

   // Current token is an opening brace, push it to 'operatorStack'

   else if (tokens[i] == '(')

   operatorStack.push(tokens[i]);

   // Closing brace encountered, solve entire brace

   else if (tokens[i] == ')')

   {

   while (operatorStack.peek() != '(')

   values.push(applyOp(operatorStack.pop(), values.pop(), values.pop()));

   operatorStack.pop();

   }

   // Current token is an operator.

   else if (tokens[i] == '+' || tokens[i] == '-' ||

   tokens[i] == '*' || tokens[i] == '/')

   {

   // While top of 'operatorStack' has same or greater precedence to current

   // token, which is an operator. Apply operator on top of 'operatorStack'

   // to top two elements in values stack

   while (!operatorStack.empty() && hasPrecedence(tokens[i], operatorStack.peek()))

   values.push(applyOp(operatorStack.pop(), values.pop(), values.pop()));

   // Push current token to 'operatorStack'.

   operatorStack.push(tokens[i]);

   }

   }

   // Entire expression has been parsed at this point, apply remaining

   // operatorStack to remaining values

   while (!operatorStack.empty())

   values.push(applyOp(operatorStack.pop(), values.pop(), values.pop()));

   // Top of 'values' contains result, return it

   return values.pop();

   }

   // Returns true if 'op2' has higher or same precedence as 'op1',

   // otherwise returns false.

   public static boolean hasPrecedence(char op1, char op2)

   {

   if (op2 == '(' || op2 == ')')

   return false;

   if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))

   return false;

   else

   return true;

   }

   // A utility method to apply an operator 'op' on operands 'a'

   // and 'b'. Return the result.

   public static int applyOp(char op, int b, int a)

   {

   switch (op)

   {

   case '+':

   return a + b;

   case '-':

   return a - b;

   case '*':

   return a * b;

   case '/':

   if (b == 0)

   throw new

   UnsupportedOperationException("Cannot divide by zero");

   return a / b;

   }

   return 0;

   }

   // Driver method to test above methods

   public static void main(String[] args) throws Exception

   {

   System.out.println(evaluate("10 + 4 * 6"));

   System.out.println(evaluate("100 * 65 + 12"));

   System.out.println(evaluate("100 * ( 2 + 12 )"));

   System.out.println(evaluate("100 * ( 2 + 12 ) / 34"));

   }

   }

  

