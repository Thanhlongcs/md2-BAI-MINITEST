package Rikkei.academy.view;

import Rikkei.academy.controller.SingerController;

import java.util.Scanner;

public class Main {
    public Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1:Show list Singer");
        System.out.println("2:Create Singer:");
        System.out.println("3:Update Singer:");
        System.out.println("4:Detail Singer:");
        System.out.println("5:Delete Singer:");
        System.out.println("6:Sort Singer:");
        System.out.println("7. Exit");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                new SingerView().viewSinger();
                break;
            case 2:
                new SingerView().createSinger();
                break;
            case 3:
                new SingerView().updateSinger();
                break;
            case 4:
                new SingerView().showDetailSinger();
                break;
            case 5:
                new SingerView().deleteSinger();
                break;
            case 6:
                new SingerView().sortSingerList();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        new Main();

    }
    public static void main(String[] args) {
        new Main();
//        System.out.println("SHOW LIST SINGER");
//        System.out.println(new SingerController().showListSinger());
//        System.out.println("CREATE SINGER");
//        new SingerController().createSinger(new Singer(3, "Tuan Hung", 43));
//        System.out.println("LIST SINGER SAU KHI TAO");
//        System.out.println(SingerServiceIMPL.singerList);
    }
}
