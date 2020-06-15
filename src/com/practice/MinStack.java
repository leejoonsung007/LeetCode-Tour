package com.practice;

import java.util.Stack;

// 155. Min Stack
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//
// push(x) -- Push element x onto stack.
// pop() -- Removes the element on top of the stack.
// top() -- Get the top element.
// getMin() -- Retrieve the minimum element in the stack.
public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min_val = new Stack<>();

    public void push(int x) {
        if (min_val.isEmpty() || x <= min_val.peek()) {
            min_val.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if (min_val.peek().equals(stack.peek())) {
            min_val.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_val.peek();
    }
}
