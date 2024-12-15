package com.example.thirdtry.repository;
import com.example.thirdtry.model.UserFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFieldsRepo extends JpaRepository<UserFields,Integer> {
}
