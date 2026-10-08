package empmng.entity;

import static org.assertj.core.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void testEmployee() {
        Employee employee = new Employee();
        assertThat(employee).isNotNull();
    }

    @Test
    void testEmployeeStringStringString() {
        Employee employee = new Employee("1", "佐藤", "2001/01/01");
        
        LocalDate birthday = LocalDate.of(2001, 1, 1);
        
        
        assertThat(employee.getNo()).isEqualTo(1);
        assertThat(employee.getName()).isEqualTo("佐藤");
        assertThat(employee.getBirthday()).isEqualTo(birthday);
        
    }

    @Test
    void testGetNo() {
        Employee employee = new Employee("1", "佐藤", "2001/01/01");
        
        
        assertThat(employee.getNo()).isEqualTo(1);

    }

    @Test
    void testSetNo() {
        Employee employee = new Employee();
        
        employee.setNo(1);
        assertThat(employee.getNo()).isEqualTo(1);

    }

    @Test
    void testGetName() {
        Employee employee = new Employee("1", "佐藤", "2001/01/01");
        
        
        assertThat(employee.getName()).isEqualTo("佐藤");
    }

    @Test
    void testSetName() {
        Employee employee = new Employee();
        
        employee.setName("佐藤");
        assertThat(employee.getName()).isEqualTo("佐藤");
    }

    @Test
    void testGetBirthday() {
        Employee employee = new Employee("1", "佐藤", "2001/01/01");
        LocalDate birthday = LocalDate.of(2001, 1, 1);

        assertThat(employee.getBirthday()).isEqualTo(birthday);
    }

    @Test
    void testSetBirthday() {
        Employee employee = new Employee();
        
        LocalDate birthday = LocalDate.of(2001, 1, 1);
        employee.setBirthday(birthday);
        
        
        assertThat(employee.getBirthday()).isEqualTo(birthday);
    }

    @Test
    void testGetAge() {
        Employee employee = new Employee("1", "佐藤", "2001/01/01");
        
        
        assertThat(employee.getAge()).isEqualTo(25);
    }

    @Test
    void testCompareTo() {
        Employee emp1 = new Employee("1", "佐藤", "1996/01/01");
        Employee emp2 = new Employee("2", "田中", "2001/01/01");
        
        int compareNo = emp1.getNo() - emp2.getNo();
        
        
    }

}
















