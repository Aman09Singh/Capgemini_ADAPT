
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	
	@Autowired
	DaoRepo mDao;
	
	public void placeProduct(Products orders) {
		mDao.save(orders);
	}
	public void updateProduct(String id,Products order) {
		mDao.save(order);
	}
	public Optional<Products> viewProduct(String id) {
		return mDao.findById(id);
	}
	
	public List<Products> viewProducts() {
		return mDao.findAll();
	}
	public void deleteProducts(String id) {
		mDao.deleteById(id);
	}
}
