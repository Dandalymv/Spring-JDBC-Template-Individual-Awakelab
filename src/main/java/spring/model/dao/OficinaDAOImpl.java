package spring.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import spring.model.bean.Oficina;

@Repository
public class OficinaDAOImpl implements IOficinaDAO{
	
	@Autowired
	JdbcTemplate template;
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void create(Oficina o) {
		String sql = "insert into oficinas (nombre_oficina, direccion, comuna, "
				+ "region, telefono, correo, espacios, horario, valor) values (?, ?, ?, ?, ?, ?, ?, ?, ?,)";
		template.update(sql, new Object[] {o.getNombreOficina(), o.getDireccion(), o.getComuna(), o.getRegion(), 
				o.getTelefono(), o.getCorreo(), o.getEspacios(), o.getHorario(), o.getValorDiario()});
		
	}

	@Override
	public List<Oficina> readAll() {
		String sql = "select idoficinas, nombre_oficina, direccion, "
				+ "comuna, region, telefono, correo, espacios, horario, valor "
				+ "from oficinas";
		return template.query(sql, new OficinaRowMapper());
	}

	@Override
	public Oficina readOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Oficina o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	class OficinaRowMapper implements RowMapper<Oficina> {
		public Oficina mapRow(ResultSet rs, int rowNum) throws SQLException{
			return new Oficina(
					rs.getString("nombre_oficina"), 
					rs.getString("direccion"), 
					rs.getString("comuna"), 
					rs.getString("region"), 
					rs.getString("telefono"), 
					rs.getString("correo"), 
					rs.getString("espacios"),
					rs.getString("horario"),
					rs.getString("valor"),
					rs.getInt("idoficinas"));
		}
	}
}
