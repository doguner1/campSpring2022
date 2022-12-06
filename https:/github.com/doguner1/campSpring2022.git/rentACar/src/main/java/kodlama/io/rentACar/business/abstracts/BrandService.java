package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandsRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {

	//!! List<Brand> getAll();
	//Olduğu gibi veri tabanı nesnelerini gösterdik. Bu artık yasak
	//Kullanıcı tüm datayı görmemeli
	
	List<GetAllBrandsResponse> getAll();
	
	void add(CreateBrandsRequest createBrandsRequest); //Bana bir create... ver. Create.. ise 
	//Şuan uydurup sadece name barındıran bir sınıf
	
}


/* requests -> istek demek yani gönderdiğimiz data ya istek denir
 * responses -> bizim ona verdiğimiz yanıttır.
 * 
 * Yukardaki getAll methodu bir responses dir
 * Evet istek de bulunuyor ama biz ona datayı veriyoruz yanıt veriyoruz
 * 
 * List<Brand> getAll(); kalktı artık. Tüm datamızı vermeyeceğiz
 * 
 * 
 */

