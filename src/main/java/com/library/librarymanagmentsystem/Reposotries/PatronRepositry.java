package com.library.librarymanagmentsystem.Reposotries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.librarymanagmentsystem.Entity.PatronEntity;

public interface PatronRepositry extends JpaRepository<PatronEntity,Integer> {


}
