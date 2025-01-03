package org.example.leetcode;

import java.util.Stack;

class MinStack {
    private final Stack<Integer> stack;
    private final Stack<Integer> min;

    public MinStack() {
        this.stack = new Stack<>();
        this.min = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (min.isEmpty() || min.peek() >= val) min.push(val);
    }

    public void pop() {
        if (stack.isEmpty()) return;
        if (stack.peek().equals(min.peek())) {
            min.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

