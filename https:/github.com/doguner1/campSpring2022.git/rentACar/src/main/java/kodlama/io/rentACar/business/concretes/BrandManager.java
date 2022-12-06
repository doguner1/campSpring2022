package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandsRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service //Bu sınıf bir business nesnesidir
public class BrandManager implements BrandService{
	private BrandRepository brandRepository; //gevşek bağlı 
	
	@Autowired /* Bu arkadaşda Cons. parametresine bakıyor,
	kim bu brandRepository interfacesini implement ediyor ->InMemoryBrandRepository,
	gitti buldu çalıştırdı.
	*/
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}


	@Override
	public List<GetAllBrandsResponse> getAll() { //List<Brand> kaldırdık
		
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponses = new ArrayList<GetAllBrandsResponse>();

		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			
			brandsResponses.add(responseItem);
		}
		return brandsResponses;
	}


	@Override
	public void add(CreateBrandsRequest createBrandsRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandsRequest.getName());
		this.brandRepository.save(brand); //Veri tabanı Brand den alınır
		
	} 

	
} 

