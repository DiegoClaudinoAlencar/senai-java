package com.escola.senai.service;

import com.escola.senai.Interface.Alunorepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private final Alunorepository alunorepository;

    public AlunoService(Alunorepository alunorepository) {
        this.alunorepository = alunorepository;
    }
}
