package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public abstract List<Medicamento> listaMedicamento();
	public abstract List<Medicamento> listaMedicamentoPorId(int idMedicamento);
	public abstract List<Medicamento> listaMedicamentoPorNombreLike(String nombre);
	public abstract List<Medicamento> listaMedicamentoPorPrecio(double precio);
	public abstract List<Medicamento> listaMedicamentoPorStock(int stock);
	public abstract List<Medicamento> listaMedicamentoPorLaboratorio(String laboratorio);
	
	
}
