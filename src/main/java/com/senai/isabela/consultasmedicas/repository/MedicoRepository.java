package com.senai.isabela.consultasmedicas.repository;
import com.senai.isabela.consultasmedicas.entidades.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}