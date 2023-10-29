package main;

import Util.Menu;
import Util.MenuUtil;

public class Main {
    public static void main(String[] args) {

        Menu menu=MenuUtil.showMenu();
        menu.process();
    }
}
