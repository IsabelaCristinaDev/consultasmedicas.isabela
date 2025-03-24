package com.senai.isabela.consultasmedicas.repository;

import com.senai.isabela.consultasmedicas.entidades.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}