package cn.hp.demo;

import java.sql.SQLException;
import java.util.List;

public interface BaseDao<T> {

	String save(T entity);
	
	void delete(Long id) throws SQLException;
	
	void update(T entity) throws SQLException;
	
	T getById(Long id) throws SQLException;
	
	List<T> getByIds(Long[] ids) throws SQLException;
	
	List<T> findAll() throws SQLException;
}
