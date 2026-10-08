package empmng.logic;

import java.util.List;

import empmng.dao.DAOFactory;
import empmng.dao.EmployeeDao;
import empmng.entity.Employee;
import empmng.exception.EmployeeNoAlreadyUsedException;
import empmng.exception.EmployeeNotFoundException;

public class EmployeeLogic {
    
    public List<Employee> getEmployees() {
        //DAOFactoryのインスタンス取得（daoFactory）
        DAOFactory daoFactory = DAOFactory.getInstance();
        
        //EmployeeDaoのインスタンス取得
        EmployeeDao employeeDao = daoFactory.getEmployeeDao();
        
        //EmployeeDaoを経由してEmployeeを取得
        return employeeDao.getEmployees();
    }
    
    
    
    public void removeEmployee(int no) throws EmployeeNotFoundException {
        
        DAOFactory daoFactory = DAOFactory.getInstance();
        EmployeeDao employeeDao = daoFactory.getEmployeeDao();
        
        if (!employeeDao.isExist(no)) {
            throw new EmployeeNotFoundException(no);
        }
        employeeDao.removeEmployee(no); 
    }
    
    
    
    public void addEmployee(Employee employee) throws EmployeeNoAlreadyUsedException{
        
        DAOFactory daoFactory = DAOFactory.getInstance();
        EmployeeDao employeeDao = daoFactory.getEmployeeDao();
        
        int no = employee.getNo();
        
        if (employeeDao.isExist(no)) {
            throw new EmployeeNoAlreadyUsedException(no);
        }
        employeeDao.addEmployee(employee);
        
        
        
        
    }
    
    
}


