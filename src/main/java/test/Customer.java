package test;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer extends Person implements Serializable {

    @ManyToOne(targetEntity = Employee.class)
    private Employee primaryContact;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @OneToMany(targetEntity = ProductOrder.class)
    private Collection<ProductOrder> productOrders;

    public Customer() {

    }
   
    public Employee getPrimaryContact() {
        return this.primaryContact;
    }

    public void setPrimaryContact(Employee primaryContact) {
        this.primaryContact = primaryContact;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public Collection<ProductOrder> getProductOrders() {
        return this.productOrders;
    }

    public void setProductOrders(Collection<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }
}
