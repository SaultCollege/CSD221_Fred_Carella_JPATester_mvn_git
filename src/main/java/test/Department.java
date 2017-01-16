package test;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department implements Serializable {

    @OneToMany(targetEntity = Employee.class,mappedBy = "department")
    private Collection<Employee> employeeList;
    @Basic
    private String name;
    @Id
    private Long id;

    public Department() {

    }
   
    public Collection<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public void setEmployeeList(Collection<Employee> employeeList) {
        this.employeeList = employeeList;
    }
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
