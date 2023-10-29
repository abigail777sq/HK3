package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.infraestructure.ProfessorRepository;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;
    public Professor saveProfessor(Professor professor){
        return professorRepository.save(professor);
      }
}
