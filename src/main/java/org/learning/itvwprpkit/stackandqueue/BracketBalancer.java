package org.learning.itvwprpkit.stackandqueue;

import org.learning.itvwprpkit.content.BracketContent;
import org.learning.itvwprpkit.reader.BracketReader;

import java.io.File;

public class BracketBalancer {
    private static final String PATH = "src/main/resources/balancedbrakets.txt";

    public static void main(String[] args) {
        File file = new File(PATH);
        BracketBalancer bb = new BracketBalancer();
        BracketContent content = bb.readInput(file);
        int n = content.getN();
        String[] contentS = content.getS();
        for (int i = 0; i < n; i++) {
            top = -1;
            if (bb.isBalanced(contentS[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static int top = -1;

    private boolean isBalanced(String content) {
        top = -1;
        boolean balanced = true;
        char[] contentChar = content.toCharArray();
        int length = contentChar.length;
        char[] stack = new char[length];
        for (int i = 0; i < length; i++) {
            if (contentChar[i] == '{' || contentChar[i] == '[' || contentChar[i] == '(') {
                push(stack, contentChar[i]);
            } else {
                char contentCharINst = pop(stack);
                if((contentChar[i] == '}' && contentCharINst != '{') || (contentChar[i] == ']' && contentCharINst != '[')
                 || (contentChar[i] == ')' && contentCharINst != '(')) {
                    balanced = false;
                    break;
                }

            }
        }
//        if(top !=-1){
//            balanced = false;
//        }
        return balanced;
    }

    private void push(char[] stack, char c) {
        stack[++top] = c;
    }

    private char pop(char[] stack) {
        if (top > -1) {
            char c = stack[top--];
            return c;
        } else {
            return 'a';
        }
    }


    private BracketContent readInput(File file) {
        BracketReader reader = new BracketReader();
        return reader.read(file);
    }

}
