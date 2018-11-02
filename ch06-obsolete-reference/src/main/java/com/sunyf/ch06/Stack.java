package com.sunyf.ch06;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @program: affective-java
 * @description: 无效的引用
 * @author: Mr.Sun
 * @create: 2018-11-02 14:21
 **/
public class Stack {

    private Object[] elements; //数组
    private int size; //栈的元素个数

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    // 入栈
    public void push(Object obj) {
        // 扩容
        ensureCapavity();
        // 入栈
        elements[size++] = obj;
    }

    // 出栈
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object obj = elements[--size];
        elements[size] = null;
        return obj;
    }

    public void ensureCapavity() {
        if (elements.length == size) {
            // 使用Arrays.copyOf()方法扩容
            elements = Arrays.copyOf(elements, size * 2 + 1 );
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 20; i++) {
            stack.push(i);
            //打印栈内的元素个数、栈的容量
            System.out.println(stack.size + ", " + stack.elements.length);
        }
    }

}
