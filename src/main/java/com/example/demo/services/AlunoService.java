package com.example.demo.services;

import com.example.demo.models.AlunoModel;
import com.example.demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoModel criarAluno(AlunoModel alunoModel){
        return alunoRepository.save(alunoModel);
    }

    public List<AlunoModel> listarAlunos(){
        return alunoRepository.findAll();
    }

    public void deletarAluno(Long id){
        alunoRepository.deleteById(id);
    }




}
