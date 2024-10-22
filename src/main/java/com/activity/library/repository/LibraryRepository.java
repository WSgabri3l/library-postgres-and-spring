package com.activity.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.activity.library.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer>{

    @Query("SELECT * FROM Library WHERE Library.genre=:author")
    List<Library> findBookByAuthor(@Param("author") String author);
} 