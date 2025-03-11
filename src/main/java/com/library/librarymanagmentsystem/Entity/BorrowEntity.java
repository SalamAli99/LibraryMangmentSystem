package com.library.librarymanagmentsystem.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.Entity;

@Entity
public class BorrowEntity {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name="borrwingDate")
    private LocalDate borrwingDate;
    @Column(name="returnDate")
    private LocalDate returnDate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   
    public LocalDate getBorrwingDate() {
        return borrwingDate;
    }
    public void setBorrwingDate(LocalDate borrwingDate) {
        this.borrwingDate = borrwingDate;
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

}
