package br.com.residencia.api_desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.residencia.api_desafio.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill,Integer> {
    
}
