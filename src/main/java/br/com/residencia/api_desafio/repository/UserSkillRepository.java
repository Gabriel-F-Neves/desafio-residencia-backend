package br.com.residencia.api_desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.residencia.api_desafio.entity.User_skill;

public interface UserSkillRepository extends JpaRepository<User_skill,Integer> {
    
}
