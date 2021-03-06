package com.ferhad;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
/*
        var bos = new BalanceOfSymbols();
        String pattern = "{[a('uuiui')sa''{asas''''}]}"; // true pattern
        System.out.println(bos.isValidSymbolPattern(pattern));
*/
        // =============================================================================================================
/*
        var ipp = new InfixPostfixPrefix();
        String expression = "1 + 2 + 4 * 8 / (4 - 3) - 9";
        System.out.println(ipp.calculate(expression)); // 26.0
*/
        // =============================================================================================================
/*
        var stack = new SpecificStack();
        stack.push(1);
        stack.push(2);
        stack.push(6);
        stack.push(5);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.getMinimum());
*/
        // =============================================================================================================
/*
        ArrayWithTwoStacks<Integer> stacks = new ArrayWithTwoStacks<>(11); // 5 for first, 5 for second, 1 for border

        stacks.push(1, 3);
        stacks.push(1, 33);
        stacks.push(1, 87);
        stacks.push(1, 87);
        stacks.push(1, 87);

        stacks.push(2, 32);
        stacks.push(2, 98);
        stacks.push(2, 353);
        stacks.push(2, 353);
        stacks.push(2, 353);

        System.out.println(stacks);

        stacks.pop(1);
        stacks.pop(2);
        System.out.println(stacks);

        System.out.println(stacks.peek(1));
        System.out.println(stacks.peek(2));

        System.out.println(stacks.size());
*/
        // =============================================================================================================
/*
        var ss = new StockSpan();
        int[] b = ss.findSpans(new int[] {6, 3, 4, 5, 2}); // brute-force
        int[] s = ss.findSpansS(new int[] {6, 3, 4, 5, 2}); // stack

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(s));
*/

        // =============================================================================================================

        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        System.out.println(stack);
        stack = Sorting.sort(stack);
        System.out.println(stack);

    }
}
