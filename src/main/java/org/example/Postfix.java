package org.example;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {

    }
// Hàm xác định độ ưu tiên của toán tử
    public static int precedence(char x) {
        if (x == '(') return 0;
        if (x == '+' || x == '-') return 1;
        if (x == '*' || x == '/' || x == '%') return 2;
        return 3;
    }


    // Chuyen tu bieu thuc trung to sang hau to
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char token : infix.toCharArray()) {
            if (Character.isLetterOrDigit(token)) {
                postfix.append(token);
            } else if (token == '(') {
                stack.push(token);
            } else if (token == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(token) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }


    // Tính giá trị biểu thức hậu tố
    public static double evaluatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char token = postfix.charAt(i);

            if (Character.isWhitespace(token)) continue;

            if (Character.isDigit(token)) {
                double num = 0;
                // Đọc nhiều chữ số liền nhau
                while (i < postfix.length() && Character.isDigit(postfix.charAt(i))) {
                    num = num * 10 + (postfix.charAt(i) - '0');
                    i++;
                }
                i--;
                stack.push(num);
            } else {
                double op1 = stack.pop();
                double op2 = stack.pop();
                double result;

                switch (token) {
                    case '+': result = op2 + op1; break;
                    case '-': result = op2 - op1; break;
                    case '*': result = op2 * op1; break;
                    case '/': result = op2 / op1; break;
                    default:
                        throw new IllegalArgumentException("Toán tử không hợp lệ: " + token);
                }
                stack.push(result);
            }
        }

        return stack.pop();
    }

}
