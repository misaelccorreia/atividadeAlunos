package com.example.demo.services;

import com.example.demo.models.AlunoModel;
import com.example.demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // ------------------------- Completando o CRUD em aula
    public Optional<AlunoModel> buscarPorId(Long id){
        return alunoRepository.findById(id);
    }



    public AlunoModel atualizar(Long id, AlunoModel alunoModel){
        AlunoModel model = alunoRepository.findById(id).get();
        model.setNome(alunoModel.getNome());
        return alunoRepository.save(model);
    }


}
