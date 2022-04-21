package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Establecimiento;

public interface IEstablecimientoService {

	public void insert(Establecimiento es);

	public List<Establecimiento> list();

	public void delete(int idEstablecimiento);
}
