package com.comtrade.yamb.player.igracGrupa1;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Die;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.RequestType;

public class YambKoloneBrojevi {
	Request request;
	
	public YambKoloneBrojevi(Request request) {
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
	
	public boolean ucestalostBrojeva(int broj, int minUslov) {
		int[] brojKockica;
		brojKockica=generisiBrojacKockica();
		
		boolean brojevi=false;
		
		for(int i=1; i<Constants.DICE_COUNT; i++) {
			if(brojKockica[broj]>=minUslov) {
				brojevi=true;
			}
		}
		return brojevi;
	}
}
