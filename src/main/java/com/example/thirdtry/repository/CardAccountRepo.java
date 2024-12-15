package com.example.thirdtry.repository;
import com.example.thirdtry.model.CardAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardAccountRepo extends JpaRepository<CardAccount,Integer> {
}
