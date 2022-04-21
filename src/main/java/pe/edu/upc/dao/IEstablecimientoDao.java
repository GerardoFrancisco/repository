package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Establecimiento;

public interface IEstablecimientoDao {

	public void insert(Establecimiento es);

	public List<Establecimiento> list();

	public void delete(int idEstablecimiento);
}
