package br.com.residencia.api_desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.residencia.api_desafio.entity.User_skill;
import br.com.residencia.api_desafio.repository.UserSkillRepository;

@Service
public class UserSkillService {
    @Autowired
	UserSkillRepository userSkillRepository;

    public List<User_skill> getAll(){
		return userSkillRepository.findAll();
	}

    public User_skill getById(Integer id) {
		return userSkillRepository.findById(id).orElse(null) ;
	}

    public User_skill saveUserSkill(User_skill userSkill) {
		return userSkillRepository.save(userSkill);
	}

    public User_skill updateUserSkill(Integer id, User_skill userSkill) {
		User_skill userSkillAtualizado = userSkillRepository.findById(id).orElse(null);
		if(userSkillAtualizado != null) {
            userSkillAtualizado.setUser(userSkill.getUser());
            userSkillAtualizado.setSkill(userSkill.getSkill());
            userSkillAtualizado.setKnowledgeLevel(userSkill.getKnowledgeLevel());
			return userSkillRepository.save(userSkillAtualizado);
		}else {
			return null;
		}
	}

    public Boolean deleteUserSkill(Integer id) {
		User_skill userSkill = userSkillRepository.findById(id).orElse(null);
		if(userSkill != null) {
			userSkillRepository.delete(userSkill);
			return true;
		}else {
			return false;
		}
	}
}
