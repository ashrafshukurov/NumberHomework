package Service;

import Service.menu.inter.MenuLoginServiceInter;
import Service.menu.inter.MenuService;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void process() {
        System.out.println("Login");
    }
}
