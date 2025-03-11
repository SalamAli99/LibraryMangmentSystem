package com.library.librarymanagmentsystem.Reposotries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.librarymanagmentsystem.Entity.BookEntity;

public interface BookRepostry extends JpaRepository<BookEntity,Integer> {


}
