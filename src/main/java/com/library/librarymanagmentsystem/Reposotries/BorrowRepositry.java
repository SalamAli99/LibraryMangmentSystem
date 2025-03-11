package com.library.librarymanagmentsystem.Reposotries;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.librarymanagmentsystem.Entity.BorrowEntity;

public interface BorrowRepositry extends JpaRepository<BorrowEntity,Integer> {

}
