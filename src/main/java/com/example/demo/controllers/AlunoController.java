package com.example.demo.controllers;

import com.example.demo.models.AlunoModel;
import com.example.demo.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    private AlunoModel criarAluno(@RequestBody AlunoModel alunoModel){
        return alunoService.criarAluno(alunoModel);
    }

    @GetMapping
    public List<AlunoModel> buscarTodosAlunos(){

        return alunoService.listarAlunos();
    }
    @GetMapping("/{id}")
    public Optional<AlunoModel> buscarAlunoPorId(Long id) {
        return alunoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAluno (long id){
        alunoService.deletarAluno(id);
    }

    @PutMapping("/{id}")
    public AlunoModel atualizar(@PathVariable Long id,@RequestBody AlunoModel alunoModel){
        return alunoService.atualizar(id,alunoModel);
    }









}

