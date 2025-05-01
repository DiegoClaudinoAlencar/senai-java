package com.escola.senai.Controller;

import com.escola.senai.model.Aluno;
import com.escola.senai.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> listaAlunos (){
        return service.listaDeTodosAlunos();
    }

    @PostMapping
    public Aluno cadastrarAluno(@RequestBody Aluno aluno){
        return service.salvaNovAluno(aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscarAlunoPorId(@PathVariable long id){
        return service.buscarAlunoPorId(id);
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable long id, RequestBody Aluno aluno){
        Aluno existe = service.buscarAlunoPorId(id);
        return  service.buscarAlunoPorId(id)
    }

    @DeleteMapping("/{id}")
    public void deletarAluno (@PathVariable long id){
        service.excluirAluno(id);
    }










}


