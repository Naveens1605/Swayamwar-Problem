package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int swayamvar(String a,String b,int n){
        Queue<Character> q = new LinkedList<>();
        Queue<Character> w = new LinkedList<>();
        for(char c: b.toCharArray()) {
            q.add(c);
        }
        for(char d: a.toCharArray()) {
            w.add(d);
        }
              for (int i=0;i<n+1;i++) {
                  if (w.peek() == q.peek()) {
                      q.remove(q.peek());
                      w.remove(w.peek());
                  }
                  if (w.peek() != q.peek()) {
                      q.add(q.peek());
                      q.remove(q.peek());
                  }
              }
        return q.size();
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Bride and Groom:");
        int n = sc.nextInt();
        System.out.println("Enter List of bride:");
        String stb1 = sc.next();
        int max_b = stb1.length() < n ? stb1.length():n;
        String stb = stb1.substring(0,max_b);
        System.out.println("Enter list of groom:");
        String stg1 = sc.next();
        int max_g = stg1.length() < n ? stg1.length():n;
        String stg = stg1.substring(0,max_g);
        System.out.println(swayamvar(stb,stg,n));
    }
}
