package com.example.demo.entity.services;

import java.util.List;

import com.example.demo.entity.models.Equipos;

public interface IRegistroService {
	public Equipos get(long id);
	public List<Equipos> getAll();
	public void post(Equipos equipo);
	public void put(Equipos equipo, long id);
	public void delete(long id);
}
