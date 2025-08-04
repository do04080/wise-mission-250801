package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 명언 앱==");

        String content="";
        String author="";

        while (true) {
            System.out.print("명령)");
            String command=sc.nextLine();
            if(command.equals("등록")) {
                System.out.print("명언 : ");
                content=sc.nextLine();
                System.out.print("작가 : ");
                author=sc.nextLine();
            } else if(command.equals("종료")) break;
        }

    }
}
