package spring.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.model.bean.Oficina;
import spring.model.dao.OficinaDAOImpl;




@Service
public class OficinaService {
	
		
	@Autowired
	OficinaDAOImpl oDAO;
	
	public OficinaService() {
		super();
	}
	
	public List<Oficina> getAll(){
		return oDAO.readAll();
	}
	
	public Oficina getOne(int id) {
		return oDAO.readOne(id);
	}
	
	public void create(Oficina o) {
		oDAO.create(o);
	}
	
	public void update(Oficina o) {
		oDAO.update(o);
	}
	
	public void delete(int id) {
		oDAO.delete(id);
	}
}
