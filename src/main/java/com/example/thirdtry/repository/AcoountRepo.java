package com.example.thirdtry.repository;

import com.example.thirdtry.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcoountRepo extends JpaRepository<Account,Integer> {
}
