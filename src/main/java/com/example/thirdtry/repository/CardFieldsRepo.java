package com.example.thirdtry.repository;
import com.example.thirdtry.model.CardFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardFieldsRepo extends JpaRepository<CardFields,Integer> {
}
