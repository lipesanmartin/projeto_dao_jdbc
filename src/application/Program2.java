package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		// Department dep = new Department(10, "Teste1");
		// departmentDao.insert(dep);
		// departmentDao.update(dep);
		// departmentDao.deleteById(10);
		// System.out.println(departmentDao.findById(2));
		List<Department> list = new ArrayList<>();
		list.addAll(departmentDao.findAll());
		for (Department obj : list) {
			System.out.println(obj);

		}
	}

}
