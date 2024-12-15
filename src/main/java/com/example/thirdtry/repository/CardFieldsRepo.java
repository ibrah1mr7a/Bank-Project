package com.example.thirdtry.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardFieldsRepo extends JpaRepository<CardFieldsRepo,Integer> {
}
