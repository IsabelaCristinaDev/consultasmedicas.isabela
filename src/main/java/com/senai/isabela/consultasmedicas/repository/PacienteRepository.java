package com.senai.isabela.consultasmedicas.repository;

import com.senai.isabela.consultasmedicas.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}