package empmng.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import empmng.entity.Employee;

@Mapper
public interface EmployeeMapper {
    
    public List<Employee> getEmployees();
    
    public void removeEmployee(int no);
    
    public void addEmployee(Employee employee);
    
    public boolean isExist(int no);
    
    
        

}
