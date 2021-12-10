package spring.model.dao;

import java.util.List;

import spring.model.bean.Oficina;

public interface IOficinaDAO {
	
	public void create(Oficina o);
	public List<Oficina> readAll();
	public Oficina readOne(int id);
	public void update(Oficina o);
	public void delete(int id);

}
