package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱==");

        List<WiseSaying> list = new ArrayList<>();

        int count=0;
        while (true) {
            System.out.print("명령)");
            String command=sc.nextLine();
            if(command.equals("등록")) {
                System.out.print("명언 : ");
                String content=sc.nextLine();
                System.out.print("작가 : ");
                String author=sc.nextLine();
                count++;
                list.add(new WiseSaying(count,content,author));
                System.out.println(count+"번 명언이 등록되었습니다.");
            } else if(command.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-------------------");
                for(int i=0;i<list.size();i++){
                    System.out.println("%d / %s / %s " .formatted(list.get(i).num,list.get(i).author,list.get(i).content));
                }
            }
            else if(command.equals("종료")) break;
        }
    }
}
