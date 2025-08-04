package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run(){
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
                for(int i=list.size()-1;i>=0;i--){
                    System.out.println("%d / %s / %s " .formatted(list.get(i).num,list.get(i).author,list.get(i).content));
                }
            } else if (command.startsWith("삭제?id=")) {
                String[] com=command.split("=");
                if(com.length==2) {
                    int num = Integer.parseInt(com[1]);
                    boolean check =false;
                    for(int i=0;i<list.size();i++){
                        if(list.get(i).num==num) {
                            list.remove(i);
                            System.out.println(num + "번 명언이 삭제되었습니다.");
                            check=true;
                            break;
                        }
                    }
                    if(!check){
                        System.out.println(num+"번 명언은 존재하지 않습니다.");
                    }
                }
            }else if (command.startsWith("수정?id=")) {
                String[] com=command.split("=");
                if(com.length==2) {
                    int num = Integer.parseInt(com[1]);
                    boolean check =false;
                    for(int i=0;i<list.size();i++){
                        if(list.get(i).num==num) {
                            System.out.println("명언(기존) : " + list.get(i).content);
                            System.out.print("명언 : ");
                            list.get(i).content=sc.nextLine();
                            System.out.println("작가(기존) : " + list.get(i).author);
                            System.out.print("작가 : ");
                            list.get(i).author=sc.nextLine();
                            check=true;
                        }
                    }
                    if(!check){
                        System.out.println(num+"번 명언은 존재하지 않습니다.");
                    }
                }
            }else if(command.equals("종료")) break;
        }
    }
}
