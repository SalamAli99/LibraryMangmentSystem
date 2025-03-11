package com.library.librarymanagmentsystem.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagmentsystem.Entity.PatronEntity;
import com.library.librarymanagmentsystem.Reposotries.PatronRepositry;

@RestController
public class PatronController {

    @Autowired
    PatronRepositry patronRepositry;

    @GetMapping("/patrons/")
    public List<PatronEntity> getpatrons(){

        return patronRepositry.findAll();
    }

    @GetMapping("/patrons/{id}")
    public PatronEntity getPatronById(@PathVariable("id") int id){

        return patronRepositry.findById(id).get();
    }

    @PostMapping("/patrons/")
    public PatronEntity createPatron(@RequestBody PatronEntity patronEntity){

        return patronRepositry.save(patronEntity);
    }

    @PutMapping("/patrons/")
    public PatronEntity updatePatron(@RequestBody PatronEntity patronEntity){
         

        return patronRepositry.save(patronEntity);
    }


    @DeleteMapping("/patrons/{id}")
    public void deletePatron(@PathVariable("id") int id){
        patronRepositry.deleteById(id);

    }


}

