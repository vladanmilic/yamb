package com.comtrade.yamb.player.igracGrupa1;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Die;
import com.comtrade.yamb.FieldData;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.RequestType;
import com.comtrade.yamb.Response;

public class YambMetode{
	Request request;
	
	public YambMetode(Request request) {
		this.request=request;
	}
	
	public int[] generisiBrojacKockica() {
		int[] brojacKockica = null;
		if(request.getType()==RequestType.THROW) {
			Die[] kockica=request.getDice();
			int i;
			brojacKockica=new int[Constants.DICE_COUNT+1];
			
			for(i=0;i<Constants.DICE_COUNT;i++) {
				brojacKockica[kockica[i].getValue()]++;
			}
		}
		return brojacKockica;
	}
	
	public boolean[] cuvajKockice(int kockica) {
		int[] sacuvaneKockice=generisiBrojacKockica();
		boolean[] zapravoCuvanjeKockica=new boolean[Constants.DICE_COUNT];
		for(int i=1;i<=Constants.DICE_COUNT;i++) {
			if(sacuvaneKockice[i]==kockica) {
				zapravoCuvanjeKockica[i]=true;
			}
			else {
				zapravoCuvanjeKockica[i]=false;
			}
		}
		return zapravoCuvanjeKockica;
	}
	
	public int brojNajveceKockice() {
		int[] Kockice=null;
		Kockice=generisiBrojacKockica();
		int maxNumber = Kockice[1];
		for (int i = 2; i < Kockice.length; i++){
			if (Kockice[i] > maxNumber){
				maxNumber = Kockice[i];
	        }
	    }
	    return maxNumber;
	}
	
	public int brojNajmanjeKockice() {
		int[] Kockice=null;
		Kockice=generisiBrojacKockica();
		int minNumber = Kockice[1];
		for (int i = 2; i < Kockice.length; i++){
			if (Kockice[i] < minNumber){
				minNumber = Kockice[i];
	        }
	    }
	    return minNumber;
	}
	
	public boolean kenta() {//MORA BITI SAVRSENO!!!!
		boolean kenta=false;		
		int maxNumber = brojNajveceKockice();
		int minNumber = brojNajmanjeKockice();
		int[] Kockice=null;
		Kockice=generisiBrojacKockica();
		
		for(int i=1;i<=Constants.DICE_COUNT;i++) {
			if(Kockice[i]>2) {
				kenta=false;
			}
			else if (maxNumber - minNumber == 4 || maxNumber - minNumber == 5) {
	        	kenta=true;
	        }
		}
        return kenta;
	}
	
	public boolean full() {//MORA BITI SAVRSENO!!
		 int[] brojacKockica;
		 brojacKockica=generisiBrojacKockica();
		 boolean full=false;
		 
		 for(int i=1;i<=brojacKockica.length-1;i++) {
			 for(int j=i+1; j<brojacKockica.length;j++) {
				 if(brojacKockica[i]==5 || brojacKockica[i]==6) {
					 full=true;
				 }
				 else if(brojacKockica[i]==3 && brojacKockica[j]==2 || brojacKockica[i]==2 && brojacKockica[j]==3) {
					 full=true;
				 }
			 }
		 }
		 return full;
	 }
	 
	 public boolean threeOfaKind() {
		 int[] brojacKockica;
		 brojacKockica=generisiBrojacKockica();
		 
		 boolean threeOfaKind=false;
		 int i;
		 
		 for(i=1;i<=Constants.DICE_COUNT;i++) {
			 if(brojacKockica[i]>=3) {
				 threeOfaKind=true;
			 }
		 }
		 return threeOfaKind;
	 }
	 
	 public boolean fourOfaKind() {
		 int[] brojacKockica;
		 brojacKockica=generisiBrojacKockica();
		 
		 boolean fourOfaKind=false;
		 int i;
		 
		 for(i=1;i<=Constants.DICE_COUNT;i++) {
			 if(brojacKockica[i]>=4) {
				 fourOfaKind=true;
			 }
		 }
		 return fourOfaKind;
	 }

	public boolean fiveOfaKind() {
		 int[] brojacKockica;
		 brojacKockica=generisiBrojacKockica();
		 
		 boolean fiveOfaKind=false;
		 int i;
		 
		 for(i=1;i<=Constants.DICE_COUNT;i++) {
			 if(brojacKockica[i]>=5) {
				 fiveOfaKind=true;
			 }
		 }
		 return fiveOfaKind;
	 }
}
