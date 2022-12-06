package kodlama.io.rentACar.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;


public interface BrandRepository extends JpaRepository<Brand,Integer>{
	//Bir interface başka bir interfaceyi implements etmez extends eder
	//List<Brand> getAll(); //getAll çağıran biri markaları listeler demek
	//Üsteki operasyon geçersiz kaldı çünkü JpaRepository içinde var

}
