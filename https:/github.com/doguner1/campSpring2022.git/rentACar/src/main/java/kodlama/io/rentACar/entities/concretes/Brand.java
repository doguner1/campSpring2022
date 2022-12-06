package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands") //Bu Brand bi tablodur ve ismi brands dir. PostgreSQL tablosunda karşılık gelecek yer
@Data //Get set ve parametresiz cons lombak ile otomatik eklendi
@AllArgsConstructor //Parametli cons buradan çağırdık
@NoArgsConstructor
@Entity //Sen bir veri tablosuna denk geliyorsun
public class Brand {

	@Id //sen primary keysin
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id otomatik artırılır
	@Column(name="id") //Sen bir kolunsun ve veri tabanındaki karşılığın id koluna karşı geliyorsun
	private int id;
	
	@Column(name="name") //Sende name karşı geliyorsun
	private String name;
	/*Yukardaki işlemler sayesinde postgreSQL de Brand tablosu oluştu
	Data base ismini kendimiz oluşturduk ve data base ismi ile  application.pro daki isim aynı
	PostgreSQL de Brand tablosuna sağ tıkladık
	View/Data kısmına tıklayıp all data dedik 
	Oraya data ekledik mercedes bmw gibi id ise otomatik artarak gitti
	Sonra datayı kaydet butonuna bastık f6
	Datalar eklenmiş oldu
	*/
	
	
	
}

// https://projectlombok.org/download
// Lombak project indirme linki