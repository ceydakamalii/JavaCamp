
public class Main {

	public static void main(String[] args) {
		//OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		//System.out.println(ogretmenKrediManager.hesapla(1000));
		
		BaseKrediManager[] krediManagers=new BaseKrediManager[] {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
		for(BaseKrediManager krediManager:krediManagers) {
			System.out.println(krediManager.hesapla(1000)); 
		}

	}

}
