

import java.util.ArrayList;

public class bilgisayar extends oyuncu {

	
	

	public bilgisayar() {super("Bilgisayar");}

	public bilgisayar(String isim) {super(isim);}
	
	
	
	
	
	
	public int fkartsec(ArrayList<futbolcu> list) {	
		//pc rsagele futbolcu kartı secer
		System.out.println("bilgisayar eldeki kartlardan birini seciyor\n");
	
		int yanit =0;boolean kontrol1=true;
		
		
		
	while(kontrol1) {
		
		 yanit =(int) (Math.random()*123)%4;
		
		 if(yanit<0 || yanit>3) {System.out.println("pc gecersiz bir tercih yaptı"); }
		
		 else if(eldeKalanFutbolcular.get(yanit).kartOynandi_mi)  {System.out.println("pc oynanmis bir kart secti"); }
			
		      else {kontrol1=false;}}
	
	
		
		System.out.print("bilgisayar sectimini yaptı => ");
		
		System.out.println("   " +list.get(yanit).futbolcuAdi +" " + list.get(yanit).birinci_özellik_puani +""
				+ " "+ list.get(yanit).ikinci_özellik_puani +" "+ list.get(yanit).ucuncu_özellik_puani+"\n");
		return yanit;}
	
	
	
	
	
	public int bkartsec(ArrayList<basketbolcu> list) {	
		//pc rsagele basketbolcu kartı secer
		System.out.println("bilgisayar eldeki kartlardan birini seciyor\n");
	
		int yanit =0;boolean kontrol1=true;
		
		
		
	while(kontrol1) {
		
		 yanit =(int) (Math.random()*123)%4;
		
		 if(yanit<0 || yanit> 3) {System.out.println("pc gecersiz bir tercih yaptı"); }
		
		 else if(eldeKalanBasketbolcular.get(yanit).kartOynandi_mi)  {System.out.println("pc oynanmis bir kart secti"); }
			
		      else {kontrol1=false;}}
	
	
		
		System.out.print("bilgisayar sectimini yaptı => ");
		
		System.out.println("   " +list.get(yanit).basketbolcuAdi +" " + list.get(yanit).birinci_özellik_puani +""
				+ " "+ list.get(yanit).ikinci_özellik_puani +" "+ list.get(yanit).ucuncu_özellik_puani+"\n");
		return yanit;}
	
	
}
