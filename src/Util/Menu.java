package Util;

import Service.MenuLoginService;
import Service.MenuRegisterService;
import Service.menu.inter.MenuService;

public enum Menu {
    LOGIN(1,"login",new MenuLoginService()),
    REGISTER(2,"Register",new MenuRegisterService()),
    ADD_TEACHER(3,"add teachers",null),
    ADD_STUDENT(4,"add students",null),
    SHOW_ALL_STUDENT(5,"show students",null),
    SHOW_ALL_TEACHER(6,"show teachers",null),
    UNKNOWN;

    private String text;
    private MenuService service;
    private int number;
    Menu(){

    }

    Menu(int number,String text,MenuService service){
        this.number=number;
    this.service=service;
        this.text=text;
    }
    public String getText(){
        return text;
    }


    @Override
    public String toString() {
        return number+"."+text;
    }
    public void process(){
        service.process();
    }
   public int getNumber(){
        return this.number;
   }
   public static Menu find(int number){
        Menu[] menus=Menu.values();
       for(int i=0;i<menus.length;i++){
           if(menus[i].getNumber()==number){
               return menus[i];
           }else{

           }
       }
       return Menu.UNKNOWN;
   }
   public static void showAllMenu(){
       Menu[] menus=Menu.values();
       for(int i=0;i<menus.length;i++){
           if(menus[i]!=UNKNOWN)
           System.out.println(menus[i]);
       }
   }


}
