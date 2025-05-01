package com.escola.senai.service;


import com.escola.senai.Interface.Alunorepository;
import com.escola.senai.model.Aluno;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class AlunoService {

    private final Alunorepository alunorepository;

    public AlunoService(Alunorepository alunorepository) {
        this.alunorepository = alunorepository;
    }

    public List<Aluno> listaDeTodosAlunos (){
        return (List<Aluno>) alunorepository.findAll();
    }

    public Aluno salvaNovAluno (Aluno aluno){
        return alunorepository.save(aluno);
    }


    public Aluno buscarAlunoPorId(Long id) {
        return alunorepository.findById(id).orElse(null);
    }

    public void excluirAluno(Long id ){
        alunorepository.deleteById((id));
    }




}
