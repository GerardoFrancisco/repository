package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Establecimiento;
import pe.edu.upc.service.IEstablecimientoService;

@Named
@RequestScoped
public class EstablecimientoController {
	@Inject
	private IEstablecimientoService eService;

	private Establecimiento e;
	List<Establecimiento> listaEstablecimientos;

	// constructor
	@PostConstruct
	public void init() {
		this.listaEstablecimientos = new ArrayList<Establecimiento>();
		this.e = new Establecimiento();
		this.list();
	}

	// métodos

	public String newEstablecimiento() {
		this.setE(new Establecimiento());
		return "establecimiento.xhtml";
	}

	public void insert() {
		try {
			eService.insert(e);
		} catch (Exception ex) {
			System.out.println("Error al insertar en el controller establecimiento");
		}
	}

	public void list() {
		try {
			listaEstablecimientos = eService.list();
		} catch (Exception ex) {
			System.out.println("Error al listar en controller establecimiento");
		}
	}

	public void delete(Establecimiento e) {
		try {
			eService.delete(e.getIdEstablecimiento());
			this.list();
		} catch (Exception ex) {
			System.out.println("Error al eliminar en elcontroller persona");
		}
	}

	// getters and setters

	public Establecimiento getE() {
		return e;
	}

	public void setE(Establecimiento e) {
		this.e = e;
	}

	public List<Establecimiento> getListaEstablecimientos() {
		return listaEstablecimientos;
	}

	public void setListaEstablecimientos(List<Establecimiento> listaEstablecimientos) {
		this.listaEstablecimientos = listaEstablecimientos;
	}

}
