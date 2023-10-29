package Util;

import java.util.Scanner;

public class MenuUtil {

    public static Menu showMenu(){
        System.out.println("please select menu");
        Menu.showAllMenu();
        Scanner sc=new Scanner(System.in);
        int selectMenu=sc.nextInt();
        return Menu.find(selectMenu);
    }
    public static void processMenu(Menu menu){
        menu.process();
    }
}
