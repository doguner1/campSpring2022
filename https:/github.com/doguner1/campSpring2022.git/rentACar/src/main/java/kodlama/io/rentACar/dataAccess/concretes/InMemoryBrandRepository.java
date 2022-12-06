/*package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository //Bu sınıf bir dataAcces nesnesidir
public class InMemoryBrandRepository implements BrandRepository {

	
	List<Brand> brands; //Bu yazma şekli alt tarafta kalan list<Brand> dan brand a erişebilmek için
	
	public InMemoryBrandRepository() { //InMemoryBrandRepository newleyen biri burayı çalıştıracak
		brands  = new ArrayList<Brand>(); //Bu hareket ile elimzide boş bir liste tanımlanmış oldu
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(3,"Audi"));
		brands.add(new Brand(4,"Fiat"));
		brands.add(new Brand(5,"Renault")); 
		brands.add(new Brand(6,"Toyota"));//Şuan 6 tane güya bellekten eleman gelmiş gibi gösterdik
	}

	@Override
	public List<Brand> getAll() { //içinde markalar barında bir liste döndereceğim
		
		return brands;
	}

}
*/


//Bu sınıf silindi
