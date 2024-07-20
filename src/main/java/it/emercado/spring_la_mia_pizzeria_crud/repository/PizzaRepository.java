package it.emercado.spring_la_mia_pizzeria_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.emercado.spring_la_mia_pizzeria_crud.model.PizzaModel;

public interface PizzaRepository extends JpaRepository<PizzaModel, Integer>{

}
