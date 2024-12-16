package com.example.thirdtry.repository;
import com.example.thirdtry.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepo extends JpaRepository<Card,Integer> {
}
