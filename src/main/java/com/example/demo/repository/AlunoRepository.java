package com.example.demo.repository;

import com.example.demo.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {

}
