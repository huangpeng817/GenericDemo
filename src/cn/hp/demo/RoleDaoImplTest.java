package cn.hp.demo;

import org.junit.Test;

public class RoleDaoImplTest {

	RoleDaoImpl daoImpl = new RoleDaoImpl();
	
	@Test
	public void testSave() throws Exception {
		Role role = new Role();
		role.setId(33L);
		role.setName("程序员");
		role.setDesc("写代码");
		String insertSql = daoImpl.save(role);
		System.out.println("插入的sql语句： " + insertSql);
	}
	
	@Test
	public void testDelete() throws Exception {
		daoImpl.delete(5L);
	}
	
	@Test
	public void testUpdate() throws Exception {
		Role entity = new Role();
		daoImpl.update(entity);
	}
	
	@Test
	public void testGetById() throws Exception {
		daoImpl.getById(13L);
	}
	
	@Test
	public void testGetByIds() throws Exception {
		Long[] ids = {5L, 10L, 23L}; 
		daoImpl.getByIds(ids);
	}
	
	@Test
	public void testFindAll() throws Exception {
		daoImpl.findAll();
	}
}
