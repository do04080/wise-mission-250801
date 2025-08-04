package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 명언 앱==");
        while (true) {
            System.out.println("명령)");
            String input=sc.nextLine();
            if(input.equals("종료")) break;
        }

    }
}
