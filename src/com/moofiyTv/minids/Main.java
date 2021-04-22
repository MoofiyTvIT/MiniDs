package com.moofiyTv.minids;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
      Stack<Integer> stack = new Stack<>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      System.out.println(stack.peek());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.toString());


    }


}
