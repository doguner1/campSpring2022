package kodlama.io.rentACar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}

}

//entities görünce aklımıza veri tababı nesneleri gelecek
//dataAccess görünce aklımıza veri erişim kodların yazıldığı yer aklımıza gelecek
//concretes ->Somut