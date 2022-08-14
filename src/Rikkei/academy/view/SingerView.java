package Rikkei.academy.view;
import Rikkei.academy.model.Singer;
import Rikkei.academy.controller.SingerController;

import java.util.List;
import java.util.Scanner;

public class SingerView {
    Scanner scanner = new Scanner(System.in);

    private final SingerController singerController = new SingerController();
    public void viewSinger(){
        List<Singer> singerList= singerController.showListSinger();
        System.out.println("-------ID------NAME-------AGE");
        for (int i=0 ; i< singerList.size(); i++) {
            System.out.println("-------"+ singerList.get(i).getId()
                    + "---------"+ singerList.get(i).getName()
                    + "----------" + singerList.get(i).getAge());
        }

    }

   public void sortSingerList(){
       singerController.sortSingerList();
        System.out.println("Finish sorted");

    }


    public void createSinger(){
        System.out.println("Nhập vào tên ca sĩ: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi ca sĩ: ");
        int age =Integer.parseInt(scanner.nextLine());
        singerController.createSinger(new Singer(singerController.showListSinger().size() + 1, name, age));

    }

    public void updateSinger(){
        System.out.println("Enter singer id to update: ");
        int id = scanner.nextInt();
        if(!isValid(id)){
            System.out.println("Invalid id");
            return;
        }
        Singer singer = singerController.findById(id);
        System.out.println("Enter new name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter new age: ");
        int age = Integer.parseInt(scanner.nextLine());
        singer.setName(name);
        singer.setAge(age);

    }

    public void deleteSinger(){
        System.out.println("Enter singer id to delete: ");
        int id =  Integer.parseInt(scanner.nextLine());
        if(!isValid(id)){
            System.out.println("Invalid id");
            return;
        }
        System.out.println("Sure to delete? Y/N");
        String check = scanner.nextLine();
        if(check.equalsIgnoreCase("y")){
            singerController.deleteSinger(id);
        } else if (check.equalsIgnoreCase("n")){
            System.out.println("Not delete yet");
        } else {
            System.out.println("Invalid choice");
        }

    }

    public void showDetailSinger(){
        System.out.println("Enter singer id to show: ");
        int id = scanner.nextInt();
        Singer singer = singerController.findById(id);
        System.out.println("Your singer: Id = " + singer.getId() + " - Name: " + singer.getName() + " - Age: " +singer.getAge());
    }

    private boolean isValid(int id){
        int size = singerController.showListSinger().size();
        return id >= 0 && id < size;
    }

}
