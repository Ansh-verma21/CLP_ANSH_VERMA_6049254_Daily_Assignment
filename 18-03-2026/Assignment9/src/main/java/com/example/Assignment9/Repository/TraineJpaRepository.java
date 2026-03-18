package com.example.Assignment9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Assignment9.Entities.Trainee;

@Repository
public interface TraineJpaRepository extends JpaRepository<Trainee, Integer>{

}
