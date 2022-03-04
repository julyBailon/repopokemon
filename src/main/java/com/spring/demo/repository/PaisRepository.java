package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.entity.Paises;

public interface PaisRepository extends JpaRepository<Paises, Long> {

}
