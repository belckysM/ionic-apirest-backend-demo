package com.example.demo.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.dao.IRegistroDao;
import com.example.demo.entity.models.Equipos;

@Service

public class RegistroServiceImpl implements IRegistroService {
	@Autowired
	private IRegistroDao registroDao;
	@Override
	public Equipos get(long id) {
		// TODO Auto-generated method stub
		return registroDao.findById(id).get();
	}

	@Override
	public List<Equipos> getAll() {
		// TODO Auto-generated method stub
		return (List<Equipos>) registroDao.findAll();
	}

	@Override
	public void post(Equipos equipo) {
		// TODO Auto-generated method stub
		registroDao.save(equipo);
	}

	@Override
	public void put(Equipos equipo, long id) {
		// TODO Auto-generated method stub
		registroDao.findById(id).ifPresent((x)->{
			equipo.setId(id);
			registroDao.save(equipo);
		});
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		registroDao.deleteById(id);
	}

}
