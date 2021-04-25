package com.unidac.desafiounidac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unidac.desafiounidac.models.Lanche;


public interface LancheRepository extends JpaRepository<Lanche, Long>{

	Lanche findById(long id);
	
}
