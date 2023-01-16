

public class futbolcu extends sporcu {

	 String futbolcuAdi;
	String futbolcuTakim;
	
	
	
public futbolcu(String futbolcuAdi , String futbolcuTakim) {
	super(futbolcuAdi,futbolcuTakim);this.futbolcuAdi=futbolcuAdi;this.futbolcuTakim=futbolcuTakim;}


public futbolcu() {super(); }
   
   
// overrire edilmiş sporcuPuanıGoster metodları


        @Override
void setPuan(int birinci_özellik , int ikinci_özellik, int ucuncu_özellik) {
	
	birinci_özellik_puani =birinci_özellik;
	ikinci_özellik_puani = ikinci_özellik;
	ucuncu_özellik_puani = ucuncu_özellik;
}



        @Override 
        public int getPuan(int karsilasmaalani) { 
	
	     if(karsilasmaalani==1)   {return birinci_özellik_puani;}
	else if(karsilasmaalani==2)   {return ikinci_özellik_puani;}
	
	else if(karsilasmaalani==3)   {return ucuncu_özellik_puani;} 
	
	return 0;}

}
