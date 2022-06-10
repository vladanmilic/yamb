package com.comtrade.yamb.player.igracGrupa1;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Die;
import com.comtrade.yamb.FieldData;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.RequestType;
import com.comtrade.yamb.Response;

public class YambUtils {
	Request request;
	YambMetode metode;//konstruktor vrv
	YambKoloneBrojevi yambBrojevi;
	public YambUtils(Request request, YambMetode metode) {
		this.request=request;
		this.metode=metode;
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
	
	public boolean ucestalostBrojeva(int broj, int minUslov) {
		int[] brojKockica;
		brojKockica=generisiBrojacKockica();
		
		boolean brojevi=false;
		
		for(int i=1; i<=Constants.DICE_COUNT; i++) {
			if(brojKockica[broj]>=minUslov) {
				brojevi=true;
			}
		}
		return brojevi;
	}
	
	public boolean isPlayable(int kolona, int red) {
		return request.getBoard().getColumns()[kolona].getFields().get(red).isPlayable();
	}
	
	public boolean isPlayed(int kolona, int red) {
		return request.getBoard().getColumns()[kolona].getFields().get(red).isPlayed();
	}
	
	public int vrednostPolja(int kolona, int red) {
		return request.getBoard().getColumns()[kolona].getFields().get(red).getValue();
	}
	
	public Response odigrajPolje(int kolona, int red, int broj, boolean potez) { //ne radi iz nekog razloga, Nemanjina ideja da se skrati kod, da se umesto milion ifova samo pozovu metode
		Response response=null;
		if(isPlayable(kolona, red)) {
			response = new IgracResponse(potez, metode.cuvajKockice(broj), new FieldData(kolona, red));
		}
		return response;
	}
}
