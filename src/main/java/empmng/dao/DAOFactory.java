package empmng.dao;

public class DAOFactory {
    
    // インスタンス生成
    private static DAOFactory daoFactory = new DAOFactory();
    
    //クラスの外に出せないインスタンス
    private EmployeeDao employeeDao;
    
    //クラスの外に出せないコンストラクタ　privateのためnewしてはいけない
    private DAOFactory() {
    }
    
    //DAOFactoryのインスタンス取得
    public static DAOFactory getInstance() {
        return daoFactory;
        
    }
    
    //EmployeeDaoのインスタンス取得
    public EmployeeDao getEmployeeDao() {
        return employeeDao;
        
    }
    
    //EmployeeDao設定　
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    
    
    
            

}
