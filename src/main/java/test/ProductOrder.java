package test;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductOrder implements Serializable {

    @Basic
    private String name;
    @Id
    private Long id;
    @Basic
    private String type;

    public ProductOrder() {

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
   
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
