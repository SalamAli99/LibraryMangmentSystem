package com.library.librarymanagmentsystem.Controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.library.librarymanagmentsystem.Entity.BorrowEntity;
import com.library.librarymanagmentsystem.Reposotries.BookRepostry;
import com.library.librarymanagmentsystem.Reposotries.BorrowRepositry;
import com.library.librarymanagmentsystem.Reposotries.PatronRepositry;

@RestController
public class BorrowController {
@Autowired
BorrowRepositry borrowRepositry;
BookRepostry bookRepostry;
BorrowEntity borrowEntity;
PatronRepositry patronRepositry;

@PostMapping("/borrow/{bookid}/patron/{patronid}")
public LocalDate allowBorrow
( @PathVariable("bookid") int  bookid, @PathVariable("patronid") int patronid)
   {
    int isBorrowed=0;
    bookRepostry.findById(bookid);
    patronRepositry.findById(patronid);
    if (isBorrowed==1) {
        return null;

    }
    else if(isBorrowed==0){
        isBorrowed=1;
        borrowEntity.setBorrwingDate(LocalDate.now());
        return borrowEntity.getBorrwingDate();
    }
        return null;
   }

   @PutMapping("/borrow/{bookid}/patron/{patronid}")
   public LocalDate returnBook( @PathVariable("bookid") int  bookid, @PathVariable("patronid") int patronid)
   {

 int isBorrowed=0;
    bookRepostry.findById(bookid);
    patronRepositry.findById(patronid);
    if (isBorrowed==0) {
        return null;

    }
    else if(isBorrowed==1){
        isBorrowed=0;
        borrowEntity.setReturnDate(LocalDate.now());
        return borrowEntity.getReturnDate();
    }
        return null;
   }
    
}

