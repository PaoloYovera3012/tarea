package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	@Autowired
	private MedicamentoRepository repository;
	
	@Override
	public List<Medicamento> listaMedicamento() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	@Override
	public List<Medicamento> listaMedicamentoPorId(int idMedicamento) {
		return repository.findByIdMedicamento(idMedicamento);
	}
	
	@Override
	public List<Medicamento> listaMedicamentoPorNombreLike(String nombre) {
		return repository.findByNombreLike(nombre);
	}
	
	@Override
	public List<Medicamento> listaMedicamentoPorPrecio(double precio) {
		return repository.findByPrecio(precio);
	}
	
	@Override
	public List<Medicamento> listaMedicamentoPorStock(int stock) {
		return repository.findByStock(stock);
	}
	
	@Override
	public List<Medicamento> listaMedicamentoPorLaboratorio(String laboratorio) {
		return repository.findByLaboratorio(laboratorio);
	}

	

	

	
	

	
	

}
