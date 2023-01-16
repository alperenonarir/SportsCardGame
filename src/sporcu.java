




public class sporcu {

	private  String sporcuIsim;
	private  String sporcuTakim;

	int birinci_özellik_puani;  // set, get için tek metot yazıldı
	int ikinci_özellik_puani;
	int ucuncu_özellik_puani;
	
    boolean kartOynandi_mi=false; // getter-setteri var
	
	
    // parametreli parametresiz yapılandırıcı + super()
	
    public sporcu() {}
	
	public sporcu(String alinanIsim, String alinanTakim) {sporcuIsim  = alinanIsim;sporcuTakim = alinanTakim;}
	

	// kart bilgisi
	
public void setkartOynandi_mi(boolean a) {kartOynandi_mi=a;}

public boolean getkartOynandi_mi() {return kartOynandi_mi;}




// overrire edilmiş set get puan metodları


void setPuan(int birinci_özellik , int ikinci_özellik, int ucuncu_özellik) {
	
	birinci_özellik_puani =birinci_özellik;
	ikinci_özellik_puani = ikinci_özellik;
	ucuncu_özellik_puani = ucuncu_özellik;
}


 // overide edilmis sporcuPuanıGoster medotu
public int getPuan(int karsilasmaalani) { 
	
	     if(karsilasmaalani==1)   {return birinci_özellik_puani;}
	else if(karsilasmaalani==2)   {return ikinci_özellik_puani;}
	
	else if(karsilasmaalani==3)   {return ucuncu_özellik_puani;} 
	
	return 0;}



public void setsporcuIsım(String set_isim) {sporcuIsim=set_isim;}

public void setsporcuTakim(String set_takim) {sporcuTakim=set_takim;}
	
public String getsporcuTakim() {return sporcuTakim;}
	
public String getsporcuIsim() {return sporcuIsim;}
}
