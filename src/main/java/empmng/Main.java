package empmng;

import empmng.dao.DAOFactory;
import empmng.dao.file.FileEmployeeDao;
import empmng.view.MainMenuView;

public class Main {

    
    public static void main(String[] args) {
        
        DAOFactory daoFactory = DAOFactory.getInstance();
        FileEmployeeDao employeeDao = new FileEmployeeDao();
        
        daoFactory.setEmployeeDao(employeeDao);
        
        MainMenuView mainMenu = new MainMenuView();
        
        while(true) {
            mainMenu.doStart();
        }


    }

}
