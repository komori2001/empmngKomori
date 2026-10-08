package empmng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import empmng.entity.Employee;

@Mapper
public interface EmployeeDao {
    
    public List<Employee> getEmployees();
    
    public void removeEmployee(int no);
    
    public void addEmployee(Employee employee);
    
    public boolean isExist(int no);
    
    
        

}
