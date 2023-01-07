package br.com.residencia.api_desafio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.residencia.api_desafio.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	Optional<User> findByUserLogin(String userLogin);
}