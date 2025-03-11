package com.library.librarymanagmentsystem.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class PatronEntity {

  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
     @Column(name  ="name")
    private String name;
    @Column(name  ="contactInfo")
    private String contactInfo;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

}
