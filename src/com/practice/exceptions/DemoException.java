package com.practice.exceptions;

public class DemoException {
    public static void main(String[] args) {
        {
            int i, j,k=0;
            i = 8;
            j = 2;
            try {
                k = i / j;
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(k);
        }
    }
}
