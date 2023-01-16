

import java.util.ArrayList;
//import java.util.Scanner;
//import javax.swing.JFrame;

public class kullanici extends oyuncu {

//Scanner scn = new Scanner(System.in);	
	
    String kullaniciAdi;
	public kullanici() {super();}

	public kullanici(String isim) { super(isim);kullaniciAdi=isim;}
	
	
//int yanit; //global



	public int fkartsec(ArrayList<futbolcu> list,int yanit) {	
		//oyuuncu  futbolcu kartı secer
		
		System.out.println("elinizdeki kartlar:");
	
		int i =1;
		for(futbolcu l : eldeKalanFutbolcular) {
			
			System.out.println(i+". kart   " + l.futbolcuAdi +" "+l.birinci_özellik_puani +" "+l.ikinci_özellik_puani +" "+l.ucuncu_özellik_puani +" ");
			i++; 
                }
		
		
		
			boolean kontrol1=true;
			//int t=0;
			 //yanit=0;
                    while(kontrol1) {
			
			// yanit=scn.nextInt();               
                       //  yanit=3;
                         
			 if(yanit<0 || yanit>list.size()) {System.out.println("gecersiz bir sayi girdiniz tekrar seciniz"); }
			
			 else if(eldeKalanFutbolcular.get(yanit).kartOynandi_mi)  {System.out.println("bu karti zaten oynamistiniz! tekrar seciniz"); break;}
				
			else {kontrol1=false;}
                         
                }
			
			
			return yanit;
                
		}
		
			
				
			
	public int bkartsec(ArrayList<basketbolcu> list,int yanit) {	
		//oyuuncu  basketbolcu kartı secer
		
		System.out.println("elinizdeki kartlar:");
	
		int i =1;
		for(basketbolcu l : eldeKalanBasketbolcular) {
			
			System.out.println(i+". kart   " + l.basketbolcuAdi +" "+l.birinci_özellik_puani +" "+l.ikinci_özellik_puani +" "+l.ucuncu_özellik_puani +" ");
			i++;
		}
		
		
			boolean kontrol1=true;
			//yanit=0;
			
		while(kontrol1) {
			
			 //yanit=scn.nextInt();

                       //  yanit=sayac;
			 if(yanit<0 || yanit>list.size()) {System.out.println("gecersiz bir sayi girdiniz tekrar seciniz"); }
			
			 else if(eldeKalanBasketbolcular.get(yanit).kartOynandi_mi)  {System.out.println("bu karti zaten oynamistiniz! tekrar seciniz");break; }
				
			else {kontrol1=false;
     
                        
                         }
			        
                }
			  
			return yanit;
		}
		
		
	
	
	
}
	