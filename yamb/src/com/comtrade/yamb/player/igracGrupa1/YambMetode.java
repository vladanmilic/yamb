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
	
		for(i=1;i<Constants.DICE_COUNT;i++) {
			brojacKockica[kockica[i].getValue()]++;
			}
		}
		return brojacKockica;
	}
	
	public boolean kenta() {
		int[] brojacKockica;
		 brojacKockica=generisiBrojacKockica();//generisiBrojKockica() treba da se doradi
		 
		 boolean Kenta=false;
		 int i;
		 
		 for(i=1;i<=Constants.DICE_COUNT;i++) {
			 if(brojacKockica[i]>1 && brojacKockica[i]<3 || brojacKockica[i]==0) {
				Kenta=true;
			 }
		 }
		 return Kenta;
	}
	
	public boolean full() {
		 int[] brojacKockica;
		 brojacKockica=generisiBrojacKockica();//generisiBrojKockica() treba da se doradi
		 
		 boolean Full=false;
		 int i;
		 
		 for(i=1;i<=Constants.DICE_COUNT;i++) {
			 if(brojacKockica[i]>2 && brojacKockica[i]<4) {
				 if(brojacKockica[i]>1 && brojacKockica[i]<3) {
					 Full=true;
				 }
			 }
		 }
		 return Full;
	 }
	 
	 public boolean threeOfaKind() {
		 int[] brojacKockica;
		 brojacKockica=generisiBrojacKockica();//generisiBrojKockica() treba da se doradi
		 
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
		 brojacKockica=generisiBrojacKockica();//generisiBrojKockica() treba da se doradi
		 
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
		 brojacKockica=generisiBrojacKockica();//generisiBrojKockica() treba da se doradi
		 
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
