package com.example.demo.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.models.Equipos;

public interface IRegistroDao extends CrudRepository<Equipos, Long> {

}
