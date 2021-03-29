package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SellerDao SellerDao = DaoFactory.createSellerDao();

		System.out.println("===TEST 1: find seller by ID ===");

		Seller seller = SellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n===TEST 2: find seller by department ===");

		Department department = new Department(2, null);
		List<Seller> list = SellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
