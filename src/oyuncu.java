
import java.util.ArrayList;

public class oyuncu {

	
	
	String oyuncuAdi;
	private int skor=0;
	ArrayList<futbolcu> eldeKalanFutbolcular =new  ArrayList<futbolcu>() ;
	ArrayList<basketbolcu> eldeKalanBasketbolcular =new  ArrayList<basketbolcu>() ;
	
	
	
	public oyuncu(){}
	
	public oyuncu(String isim){oyuncuAdi=isim;}
	
	
		public int getSkor() {return skor;}
		public void setSkor() {skor+=10;}
	
		public String getOyuncuAdi() {return oyuncuAdi;}
		public void setOyuncuAdi(String s) {oyuncuAdi=s;}

                
                
	
	public void setEldeKalanFutbolcular(futbolcu f1) {eldeKalanFutbolcular.add(f1);}
	public void setEldeKalanBasketbolcular(basketbolcu b1) {eldeKalanBasketbolcular.add(b1);}
	

	
}
