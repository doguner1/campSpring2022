package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandsRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

@RestController //annotation - Bilgilendirme
//Program çalıştığında tüm dosyaları tarıyor ve bakıyor ki burada restcontoller var
//yani erişim burada olacakmış anlamını doğurmuş olduk

@RequestMapping("/api/brands") //api/brands diyorsa BrandsController diyor demek (adresleme))
public class BrandsController {
	private BrandService brandService;

	@Autowired /*Git parametlerine bak,
	uygulamayı tara,
	kim brandService yi implement ediyor, ->BrandManager,
	onun newlenmiş halini bana ver demek
	*/
	
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	

	@GetMapping("/getall")
	List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateBrandsRequest createBrandsRequest) {
		this.brandService.add(createBrandsRequest);
	}
}
