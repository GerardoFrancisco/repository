package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEstablecimientoDao;
import pe.edu.upc.entidades.Establecimiento;
import pe.edu.upc.service.IEstablecimientoService;

@Named
public class EstablecimientoServiceImpl implements IEstablecimientoService {

	@Inject
	private IEstablecimientoDao eDao;

	@Override
	public void insert(Establecimiento e) {
		eDao.insert(e);
	}

	@Override
	public List<Establecimiento> list() {
		// TODO Auto-generated method stub
		return eDao.list();
	}

	@Override
	public void delete(int idEstablecimiento) {
		// TODO Auto-generated method stub
		eDao.delete(idEstablecimiento);
	}

}
