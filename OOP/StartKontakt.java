package edunova;

public class StartKontakt {

	
	public StartKontakt() {
		VrstaKontakta vk = new VrstaKontakta(1, "Mobil");
		VrstaKontakta vk2 = new VrstaKontakta(2, "Skype");
		VrstaKontakta vk3= new VrstaKontakta(3, "Email");
		
		Kontakt[] kontakt= new Kontakt[5];
		kontakt[0] =new Kontakt("Pero", "0981700329", vk, 1000);
		kontakt[1] = new Kontakt("Medo", "0981560321", vk2, 300);
		kontakt[2] = new Kontakt("Loro", "0991560328", vk2, 700);
		kontakt[3] = new Kontakt("Mato", "0912700349", vk3, 500);
		kontakt[4] = new Kontakt("Zlatko", "0991548921", vk, 900);
		
		sumKontakt(kontakt);
		
		
	}
	
	
	
	public static void main(String[] args) {
		new StartKontakt();
		
		
		
		
		
		
	}
	
	public static void sumKontakt(Kontakt[] osoba) {
		
		
		Integer sum=0;
			
		for(int i=0;i<osoba.length;i++) {
			
			sum+=osoba[i].getDuzan();
			
		}
		
		
		System.out.println("Zajednicki dug im je: "+sum);
		
	}
	
	
}
