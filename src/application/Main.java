package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SellerDao SellerDao = DaoFactory.createSellerDao();

		System.out.println("===TEST 1: find seller by ID ===");
		Seller seller = SellerDao.findById(3);
		System.out.println(seller);

	}

}
