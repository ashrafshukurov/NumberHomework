package Service;

import Service.menu.inter.MenuService;

public class MenuRegisterService  implements MenuService {

    @Override
    public void process() {
        System.out.println("Register");
    }
}
