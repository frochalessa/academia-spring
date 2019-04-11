package com.felliperocha.academia.repositories;

import com.felliperocha.academia.domain.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {
}
