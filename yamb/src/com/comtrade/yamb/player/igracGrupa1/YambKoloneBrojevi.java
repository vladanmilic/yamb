package com.comtrade.yamb.player.igracGrupa1;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Die;
import com.comtrade.yamb.FieldData;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.RequestType;
import com.comtrade.yamb.Response;

public class YambKoloneBrojevi {
	Request request;
	YambMetode metode;
	public YambKoloneBrojevi(Request request, YambMetode metode) {
		this.request=request;
		this.metode=metode;
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
	
	public Response kecevi(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(ucestalostBrojeva(1,3)) {
					if(isPlayable(6,0)) { 
						return new IgracResponse(true, null, new FieldData(6,0));
					}
					else if (isPlayed(6,0)){
						return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(5,0));
					}
					else if(isPlayable(0,0)) {
						return new IgracResponse(true, null, new FieldData(0,0));
					}
					else if(isPlayable(4,0)) {
						return new IgracResponse(true, null, new FieldData(4,0));
					}
					else if(isPlayable(1,0)){
						return new IgracResponse(true, null, new FieldData(1,0));
					}
					else if(isPlayable(3,0)) {
						return new IgracResponse(true, null, new FieldData(3,0));
					}
					else if(isPlayable(2,0)) {
						return new IgracResponse(true, null, new FieldData(2,0));
					}
				}
				else if(ucestalostBrojeva(1, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(1), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(ucestalostBrojeva(1,4)) {
					if(isPlayable(0,0)) {
						return new IgracResponse(true, null, new FieldData(0,0));
					}
					else if(isPlayable(4,0)) {
						return new IgracResponse(true, null, new FieldData(4,0));
					}
					else if(isPlayable(1,0)){
						return new IgracResponse(true, null, new FieldData(1,0));
					}
					else if(isPlayable(3,0)) {
						return new IgracResponse(true, null, new FieldData(3,0));
					}
					else if(isPlayable(2,0)) {
						return new IgracResponse(true, null, new FieldData(2,0));
					}
				}
				else if(ucestalostBrojeva(1, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(1), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
				if(ucestalostBrojeva(1,3)) {
					if(isPlayable(0,0)) {
						return new IgracResponse(true, null, new FieldData(0,0));
					}
					else if(isPlayable(4,0)) {
						return new IgracResponse(true, null, new FieldData(4,0));
					}
					else if(isPlayable(1,0)){
						return new IgracResponse(true, null, new FieldData(1,0));
					}
					else if(isPlayable(3,0)) {
						return new IgracResponse(true, null, new FieldData(3,0));
					}
					else if(isPlayable(2,0)) {
						return new IgracResponse(true, null, new FieldData(2,0));
					}
				}
				else if(ucestalostBrojeva(1,2)) {
					if(isPlayable(0,0)) {
						return new IgracResponse(true, null, new FieldData(0,0));
					}
					else if(isPlayable(4,0)) {
						return new IgracResponse(true, null, new FieldData(4,0));
					}
					else if(isPlayable(1,0)){
						return new IgracResponse(true, null, new FieldData(1,0));
					}
					else if(isPlayable(3,0)) {
						return new IgracResponse(true, null, new FieldData(3,0));
					}
					else if(isPlayable(2,0)) {
						return new IgracResponse(true, null, new FieldData(2,0));
					}
				}
				else {
					if(isPlayable(2,14)) {
						return new IgracResponse(true, null, new FieldData(2,14));
					}
					if(isPlayable(4,14)) {
						return new IgracResponse(true, null, new FieldData(4,14));
					}
				}
			}	
		}
		return null;
	}
	
	public Response dvojke(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(ucestalostBrojeva(2,3)) {
					if(isPlayable(6,1)) {
						return new IgracResponse(true, null, new FieldData(6,1));
					}
					else if(isPlayable(0,1)) {
						return new IgracResponse(true, null, new FieldData(0,1));
					}
					else if(isPlayable(4,1)) {
						return new IgracResponse(true, null, new FieldData(4,1));
					}
					else if(isPlayable(1,1)){
						return new IgracResponse(true, null, new FieldData(1,1));
					}
					else if(isPlayable(5,1)) {
						return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(5,1));
					}
					else if(isPlayable(3,1)) {
						return new IgracResponse(true, null, new FieldData(3,1));
					}
					else if(isPlayable(2,1)) {
						return new IgracResponse(true, null, new FieldData(2,1));
					}
				}
				else if(ucestalostBrojeva(2, 2)) {
					metode.cuvajKockice(2);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(ucestalostBrojeva(2,4)) {
					if(isPlayable(0,1)) {
						return new IgracResponse(true, null, new FieldData(0,1));
					}
					else if(isPlayable(4,1)) {
						return new IgracResponse(true, null, new FieldData(4,1));
					}
					else if(isPlayable(1,1)){
						return new IgracResponse(true, null, new FieldData(1,1));
					}
					else if(isPlayable(3,1)) {
						return new IgracResponse(true, null, new FieldData(3,1));
					}
					else if(isPlayable(2,1)) {
						return new IgracResponse(true, null, new FieldData(2,1));
					}
				}
				else if(ucestalostBrojeva(2, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(2), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
				if(ucestalostBrojeva(2,3)) {
					if(isPlayable(0,1)) {
						return new IgracResponse(true, null, new FieldData(0,1));
					}
					else if(isPlayable(4,1)) {
						return new IgracResponse(true, null, new FieldData(4,1));
					}
					else if(isPlayable(1,1)){
						return new IgracResponse(true, null, new FieldData(1,1));
					}
					else if(isPlayable(3,1)) {
						return new IgracResponse(true, null, new FieldData(3,1));
					}
					else if(isPlayable(2,1)) {
						return new IgracResponse(true, null, new FieldData(2,1));
					}
				}
				else if(ucestalostBrojeva(2,2)) {
					if(isPlayable(0,1)) {
						return new IgracResponse(true, null, new FieldData(0,1));
					}
					else if(isPlayable(4,1)) {
						return new IgracResponse(true, null, new FieldData(4,1));
					}
					else if(isPlayable(1,1)){
						return new IgracResponse(true, null, new FieldData(1,1));
					}
					else if(isPlayable(3,1)) {
						return new IgracResponse(true, null, new FieldData(3,1));
					}
					else if(isPlayable(2,1)) {
						return new IgracResponse(true, null, new FieldData(2,1));
					}
				}
			}
		}
		return null;
	}

	private Response trojke(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(ucestalostBrojeva(3,3)) {
					if(isPlayable(6,2)) {
						return new IgracResponse(true, null, new FieldData(6,2));
					}
					else if(isPlayable(0,2)) {
						return new IgracResponse(true, null, new FieldData(0,2));
					}
					else if(isPlayable(1,2)) {
						return new IgracResponse(true, null, new FieldData(1,2));
					}
					else if(isPlayable(5,2)){
						return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(5,2));
					}
					else if(isPlayable(4,2)){
						return new IgracResponse(true, null, new FieldData(4,2));
					}
					else if(isPlayable(3,2)) {
						return new IgracResponse(true, null, new FieldData(3,2));
					}
					else if(isPlayable(2,2)) {
						return new IgracResponse(true, null, new FieldData(2,2));
					}
				}
				else if(ucestalostBrojeva(3, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(3), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(ucestalostBrojeva(3,4)) {
					if(isPlayable(0,2)) {
						return new IgracResponse(true, null, new FieldData(0,2));
					}
					else if(isPlayable(1,2)) {
						return new IgracResponse(true, null, new FieldData(1,2));
					}
					else if(isPlayable(4,2)){
						return new IgracResponse(true, null, new FieldData(4,2));
					}
					else if(isPlayable(3,2)) {
						return new IgracResponse(true, null, new FieldData(3,2));
					}
					else if(isPlayable(2,2)) {
						return new IgracResponse(true, null, new FieldData(2,2));
					}
				}
				else if(ucestalostBrojeva(3, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(3), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
				if(ucestalostBrojeva(3,3)) {
					if(isPlayable(0,2)) {
						return new IgracResponse(true, null, new FieldData(0,2));
					}
					else if(isPlayable(1,2)) {
						return new IgracResponse(true, null, new FieldData(1,2));
					}
					else if(isPlayable(4,2)){
						return new IgracResponse(true, null, new FieldData(4,2));
					}
					else if(isPlayable(3,2)) {
						return new IgracResponse(true, null, new FieldData(3,2));
					}
					else if(isPlayable(2,2)) {
						return new IgracResponse(true, null, new FieldData(2,2));
					}
				}
				else if(ucestalostBrojeva(3,2)){
					if(isPlayable(0,2)) {
						return new IgracResponse(true, null, new FieldData(0,2));
					}
					else if(isPlayable(1,2)) {
						return new IgracResponse(true, null, new FieldData(1,2));
					}
					else if(isPlayable(4,2)){
						return new IgracResponse(true, null, new FieldData(4,2));
					}
					else if(isPlayable(3,2)) {
						return new IgracResponse(true, null, new FieldData(3,2));
					}
					else if(isPlayable(2,2)) {
						return new IgracResponse(true, null, new FieldData(2,2));
					}
				}
			}
		}
		return null;
	}
	
	private Response cetvorke(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(ucestalostBrojeva(4,3)) {
					if(isPlayable(6,3)) {
						return new IgracResponse(true, null, new FieldData(6,3));
					}
					else if(isPlayable(0,3)) {
						return new IgracResponse(true, null, new FieldData(0,3));
					}
					else if(isPlayable(4,3)) {
						return new IgracResponse(true, null, new FieldData(4,3));
					}
					else if(isPlayable(1,3)){
						return new IgracResponse(true, null, new FieldData(1,3));
					}
					else if(isPlayable(3,3)) {
						return new IgracResponse(true, null, new FieldData(3,3));
					}
					else if(isPlayable(5,3)) {
						return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(5,3));
					}
					else if(isPlayable(2,3)){
						return new IgracResponse(true, null, new FieldData(2,3));
					}
				}
				else if(ucestalostBrojeva(4, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(4), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(ucestalostBrojeva(4,4)) {
					if(isPlayable(0,3)) {
						return new IgracResponse(true, null, new FieldData(0,3));
					}
					else if(isPlayable(4,3)) {
						return new IgracResponse(true, null, new FieldData(4,3));
					}
					else if(isPlayable(1,3)){
						return new IgracResponse(true, null, new FieldData(1,3));
					}
					else if(isPlayable(3,3)) {
						return new IgracResponse(true, null, new FieldData(3,3));
					}
					else if(isPlayable(2,3)){
						return new IgracResponse(true, null, new FieldData(2,3));
					}
				}
				else if(ucestalostBrojeva(4, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(4), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
				if(ucestalostBrojeva(4,3)) {
					if(isPlayable(0,3)) {
						return new IgracResponse(true, null, new FieldData(0,3));
					}
					else if(isPlayable(4,3)) {
						return new IgracResponse(true, null, new FieldData(4,3));
					}
					else if(isPlayable(1,3)){
						return new IgracResponse(true, null, new FieldData(1,3));
					}
					else if(isPlayable(3,3)) {
						return new IgracResponse(true, null, new FieldData(3,3));
					}
					else if(isPlayable(2,3)){
						return new IgracResponse(true, null, new FieldData(2,3));
					}
				}
				else if((ucestalostBrojeva(4, 2))){
					if(isPlayable(0,3)) {
						return new IgracResponse(true, null, new FieldData(0,3));
					}
					else if(isPlayable(4,3)) {
						return new IgracResponse(true, null, new FieldData(4,3));
					}
					else if(isPlayable(1,3)){
						return new IgracResponse(true, null, new FieldData(1,3));
					}
					else if(isPlayable(3,3)) {
						return new IgracResponse(true, null, new FieldData(3,3));
					}
					else if(isPlayable(2,3)){
						return new IgracResponse(true, null, new FieldData(2,3));
					}
				}
			}
		}
		return null;
	}

	private Response petice(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(ucestalostBrojeva(5,3)) {
					if(isPlayable(6,4)) {
						return new IgracResponse(true, null, new FieldData(6,4));
					}
					else if(isPlayable(0,4)) {
						return new IgracResponse(true, null, new FieldData(0,4));
					}
					else if(isPlayable(1,4)) {
						return new IgracResponse(true, null, new FieldData(1,4));
					}
					else if(isPlayable(5,4)){
						return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(5,4));
					}
					else if(isPlayable(4,4)){
						return new IgracResponse(true, null, new FieldData(4,4));
					}
					else if(isPlayable(3,4)){
						return new IgracResponse(true, null, new FieldData(3,4));
					}
					else if(isPlayable(2,4)){
						return new IgracResponse(true, null, new FieldData(2,4));
					}
					else if(isPlayable(6,11)) {
						return new IgracResponse(true, null, new FieldData(6,11));
					}
					else if(isPlayable(1,11)) {
						return new IgracResponse(true, null, new FieldData(1,11));
					}
					else if(isPlayable(2,11)) {
						return new IgracResponse(true, null, new FieldData(2,11));
					}
					else if(isPlayable(3,11)) {
						return new IgracResponse(true, null, new FieldData(3,11));
					}
					else if(isPlayable(4,11)) {
						return new IgracResponse(true, null, new FieldData(4,11));
					}
				}
				else if(ucestalostBrojeva(5, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(5), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(ucestalostBrojeva(5,4)) {
					if(isPlayable(0,4)) {
						return new IgracResponse(true, null, new FieldData(0,4));
					}
					else if(isPlayable(1,4)) {
						return new IgracResponse(true, null, new FieldData(1,4));
					}
					else if(isPlayable(4,4)){
						return new IgracResponse(true, null, new FieldData(4,4));
					}
					else if(isPlayable(3,4)){
						return new IgracResponse(true, null, new FieldData(3,4));
					}
					else if(isPlayable(2,4)){
						return new IgracResponse(true, null, new FieldData(2,4));
					}
					else if(isPlayable(1,11)) {
						return new IgracResponse(true, null, new FieldData(1,11));
					}
					else if(isPlayable(2,11)) {
						return new IgracResponse(true, null, new FieldData(2,11));
					}
					else if(isPlayable(3,11)) {
						return new IgracResponse(true, null, new FieldData(3,11));
					}
					else if(isPlayable(4,11)) {
						return new IgracResponse(true, null, new FieldData(4,11));
					}
				}
				else if(ucestalostBrojeva(5, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(5), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
				if(ucestalostBrojeva(5,3)) {
					if(isPlayable(0,4)) {
						return new IgracResponse(true, null, new FieldData(0,4));
					}
					else if(isPlayable(1,4)) {
						return new IgracResponse(true, null, new FieldData(1,4));
					}
					else if(isPlayable(4,4)){
						return new IgracResponse(true, null, new FieldData(4,4));
					}
					else if(isPlayable(3,4)){
						return new IgracResponse(true, null, new FieldData(3,4));
					}
					else if(isPlayable(2,4)){
						return new IgracResponse(true, null, new FieldData(2,4));
					}
					else if(isPlayable(1,11)) {
						return new IgracResponse(true, null, new FieldData(1,11));
					}
					else if(isPlayable(2,11)) {
						return new IgracResponse(true, null, new FieldData(2,11));
					}
					else if(isPlayable(3,11)) {
						return new IgracResponse(true, null, new FieldData(3,11));
					}
					else if(isPlayable(4,11)) {
						return new IgracResponse(true, null, new FieldData(4,11));
					}
				}
				else if(ucestalostBrojeva(5,2)) {
					if(isPlayable(0,4)) {
						return new IgracResponse(true, null, new FieldData(0,4));
					}
					else if(isPlayable(1,4)) {
						return new IgracResponse(true, null, new FieldData(1,4));
					}
					else if(isPlayable(4,4)){
						return new IgracResponse(true, null, new FieldData(4,4));
					}
					else if(isPlayable(3,4)){
						return new IgracResponse(true, null, new FieldData(3,4));
					}
					else if(isPlayable(2,4)){
						return new IgracResponse(true, null, new FieldData(2,4));
					}
				}
			}
		}
		return null;
	}
	
	private Response sestice(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(ucestalostBrojeva(6,3)) {
					if(isPlayable(6,5)) {
						return new IgracResponse(true, null, new FieldData(6,5));
					}
					else if(isPlayable(0,5)) {
						return new IgracResponse(true, null, new FieldData(0,5));
					}
					else if(isPlayable(1,5)) {
						return new IgracResponse(true, null, new FieldData(1,5));
					}
					else if(isPlayable(5,5)){
						return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(5,5));
					}
					else if(isPlayable(4,5)){
						return new IgracResponse(true, null, new FieldData(4,5));
					}
					else if(isPlayable(3,5)){
						return new IgracResponse(true, null, new FieldData(3,5));
					}
					else if(isPlayable(2,5)){
						return new IgracResponse(true, null, new FieldData(2,5));
					}
					else if(isPlayable(6,11)) {
						return new IgracResponse(true, null, new FieldData(6,11));
					}
					else if(isPlayable(1,11)) {
						return new IgracResponse(true, null, new FieldData(1,11));
					}
					else if(isPlayable(3,11)) {
						return new IgracResponse(true, null, new FieldData(3,11));
					}
					else if(isPlayable(2,11)) {
						return new IgracResponse(true, null, new FieldData(2,11));
					}
					else if(isPlayable(4,11)) {
						return new IgracResponse(true, null, new FieldData(4,11));
					}
				}
				else if(ucestalostBrojeva(6, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(6), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(ucestalostBrojeva(6,4)) {
					if(metode.fiveOfaKind()) {
						return logikaYamb(request);
					}
					if(isPlayable(0,5)) {
						return new IgracResponse(true, null, new FieldData(0,5));
					}
					else if(isPlayable(1,5)) {
						return new IgracResponse(true, null, new FieldData(1,5));
					}
					else if(isPlayable(4,5)){
						return new IgracResponse(true, null, new FieldData(4,5));
					}
					else if(isPlayable(3,5)){
						return new IgracResponse(true, null, new FieldData(3,5));
					}
					else if(isPlayable(2,5)){
						return new IgracResponse(true, null, new FieldData(2,5));
					}
					else if(isPlayable(1,13)) {
						return logikaPoker(request);
					}
					else if(isPlayable(1,11)) {
						return new IgracResponse(true, null, new FieldData(1,11));
					}
					else if(isPlayable(2,11)) {
						return new IgracResponse(true, null, new FieldData(2,11));
					}
					else if(isPlayable(3,11)) {
						return new IgracResponse(true, null, new FieldData(3,11));
					}
					else if(isPlayable(4,11)) {
						return new IgracResponse(true, null, new FieldData(4,11));
					}
					
				}
				else if(ucestalostBrojeva(6, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(6), null);
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
				if(ucestalostBrojeva(6,3)) {
					if(isPlayable(0,5)) {
						return new IgracResponse(true, null, new FieldData(0,5));
					}
					else if(isPlayable(1,5)) {
						return new IgracResponse(true, null, new FieldData(1,5));
					}
					else if(isPlayable(4,5)){
						return new IgracResponse(true, null, new FieldData(4,5));
					}
					else if(isPlayable(3,5)){
						return new IgracResponse(true, null, new FieldData(3,5));
					}
					else if(isPlayable(2,5)){
						return new IgracResponse(true, null, new FieldData(2,5));
					}
					else if(isPlayable(2,11)) {
						return new IgracResponse(true, null, new FieldData(2,11));
					}
					else if(isPlayable(1,11)) {
						return new IgracResponse(true, null, new FieldData(1,11));
					}
					else if(isPlayable(3,11)) {
						return new IgracResponse(true, null, new FieldData(3,11));
					}
					else if(isPlayable(4,11)) {
						return new IgracResponse(true, null, new FieldData(4,11));
					}
				}
				else if(ucestalostBrojeva(6,2)) {
					if(isPlayable(0,5)) {
						return new IgracResponse(true, null, new FieldData(0,5));
					}
					else if(isPlayable(1,5)) {
						return new IgracResponse(true, null, new FieldData(1,5));
					}
					else if(isPlayable(4,5)){
						return new IgracResponse(true, null, new FieldData(4,5));
					}
					else if(isPlayable(3,5)){
						return new IgracResponse(true, null, new FieldData(3,5));
					}
					else if(isPlayable(2,5)){
						return new IgracResponse(true, null, new FieldData(2,5));
					}
				}
			}
		}
		return null;
	}

	private Response max(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(metode.max()>=26) {
					if(isPlayable(6,7)) {
						return new IgracResponse(true, null, new FieldData(6,7));
					}
					else if(isPlayable(3,7)) {
						return new IgracResponse(true, null, new FieldData(3,7));
					}
					else if(isPlayable(1,7)) {
						return new IgracResponse(true, null, new FieldData(1,7));
					}
					else if(isPlayable(5,7)) {
						for(int i=5;i<=Constants.DICE_COUNT;i++) {
							if((ucestalostBrojeva(i,1) && ucestalostBrojeva(i, 2)) || (ucestalostBrojeva(i,2) && ucestalostBrojeva(i, 1))) {
								return new IgracResponse(false, metode.cuvajKockice(i), new FieldData(5,7));
							}
						}		
					}
					else if(isPlayable(4,7)) {
						return new IgracResponse(true, null, new FieldData(4,7));
					}
					else if(isPlayable(0,7)) {
						return new IgracResponse(true, null, new FieldData(0,7));
					}
					else if(isPlayable(2,7)) {
						return new IgracResponse(true, null, new FieldData(2,7));
					}	
				}
				else if(metode.max()>=16 && metode.max()<20) {
					if(isPlayable(5,7)) {
						for(int i=5;i<=Constants.DICE_COUNT;i++) {
							if((ucestalostBrojeva(i,1) && ucestalostBrojeva(i, 2)) || (ucestalostBrojeva(i,2) && ucestalostBrojeva(i, 1))) {
								return new IgracResponse(false, metode.cuvajKockice(i), new FieldData(5,7));
							}
						}
					}
				}
				else if(metode.max()>=16 && metode.max()<20) {
					for(int i=5;i<=Constants.DICE_COUNT;i++) {
						if((ucestalostBrojeva(i,1) && ucestalostBrojeva(i, 2)) || (ucestalostBrojeva(i,2) && ucestalostBrojeva(i, 1))) {
							return new IgracResponse(false, metode.cuvajKockice(i), null);
						}
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(metode.max()>=26) {
					for(int i=0; i<Constants.DICE_COUNT; i++) {
						if(isPlayable(3,7)) {
							return new IgracResponse(true, null, new FieldData(3,7));
						}
						else if(isPlayable(1,7)) {
							return new IgracResponse(true, null, new FieldData(1,7));
						}
						else if(isPlayable(4,7)) {
							return new IgracResponse(true, null, new FieldData(4,7));
						}
						else if(isPlayable(0,7)) {
							return new IgracResponse(true, null, new FieldData(0,7));
						}
						else if(isPlayable(2,7)) {
							return new IgracResponse(true, null, new FieldData(2,7));
						}
					}
				}
				else if(metode.max()>=17 && metode.max()<24) {
					for(int i=5;i<=Constants.DICE_COUNT;i++) {
						if((ucestalostBrojeva(i,1) && ucestalostBrojeva(i, 2)) || (ucestalostBrojeva(i,2) && ucestalostBrojeva(i, 1))) {
							return new IgracResponse(false, metode.cuvajKockice(i), null);
						}
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
				if(metode.max()>=26) {
					for(int i=0; i<Constants.DICE_COUNT; i++) {
						if(isPlayable(3,7)) {
							return new IgracResponse(true, null, new FieldData(3,7));
						}
						else if(isPlayable(1,7)) {
							return new IgracResponse(true, null, new FieldData(1,7));
						}
						else if(isPlayable(4,7)) {
							return new IgracResponse(true, null, new FieldData(4,7));
						}
						else if(isPlayable(0,7)) {
							return new IgracResponse(true, null, new FieldData(0,7));
						}
						else if(isPlayable(2,7)) {
							return new IgracResponse(true, null, new FieldData(2,7));
						}
					}
				}
				else if(metode.max()>=22) {
					if(ucestalostBrojeva(5,3)) {
						return logikaTrilling(request);
					}
					if(ucestalostBrojeva(6,3)) {
						return logikaTrilling(request);
					}
					if(isPlayable(3,7)) {
						return new IgracResponse(true, null, new FieldData(3,7));
					}
					else if(isPlayable(1,7)) {
						return new IgracResponse(true, null, new FieldData(1,7));
					}
					else if(isPlayable(4,7)) {
						return new IgracResponse(true, null, new FieldData(4,7));
					}
					else if(isPlayable(0,7)) {
						return new IgracResponse(true, null, new FieldData(0,7));
					}
					else if(isPlayable(2,7)) {
						return new IgracResponse(true, null, new FieldData(2,7));
					}
				}
				else {
					if(metode.kenta()) {
						return logikaKenta(request);
					}
					if(metode.fourOfaKind()) {
						return logikaPoker(request);
					}
					if(metode.threeOfaKind()) {
						return logikaTrilling(request);
					}
					if(metode.full()) {
						return logikaFull(request);
					}
					if(metode.dupliPar()) {
						return logikaFull(request);
					}
					if(metode.dupliPar()) {
						return logikaTrilling(request);
					}
					if(isPlayable(2,14)) {
						return new IgracResponse(true, null, new FieldData(2,14));
					}
					else if(isPlayable(4,14)) {
						return new IgracResponse(true, null, new FieldData(4,14));
					}
				}
			}
		}
		return null;
	}
	
	private Response min(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(metode.min()<=9) {
					if(isPlayable(6,8)) {
						return new IgracResponse(true, null, new FieldData(6,8));
					}
					else if(isPlayable(3,8)) {
						new IgracResponse(true, null, new FieldData(3,8));
					}
					else if(isPlayable(1,8)) {
						return new IgracResponse(true, null, new FieldData(1,8));
					}
					else if(isPlayable(4,8)) {
						return new IgracResponse(true, null, new FieldData(4,8));
					}
					else if(isPlayable(5,8)) {
						for(int i=1; i<=2;i++) {
							if((ucestalostBrojeva(i,1) && ucestalostBrojeva(i, 2)) || (ucestalostBrojeva(i,2) && ucestalostBrojeva(i, 1))) {
								return new IgracResponse(false, metode.cuvajKockice(i), new FieldData(5,8));
							}
						}
					}
					else if(isPlayable(0,8)) {
						return new IgracResponse(true, null, new FieldData(0,8));
					}
					else if(isPlayable(2,8)) {
						return new IgracResponse(true, null, new FieldData(2,8));
					}
				}
				else {
					if(ucestalostBrojeva(1,3)) {
						return kecevi(request);
					}
					if(ucestalostBrojeva(2,3)) {
						return dvojke(request);
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(metode.min()<=9) {
					if(isPlayable(3,8)) {
						return new IgracResponse(true, null, new FieldData(3,8));
					}
					else if(isPlayable(1,8)) {
						return new IgracResponse(true, null, new FieldData(1,8));
					}
					else if(isPlayable(4,8)) {
						return new IgracResponse(true, null, new FieldData(4,8));
					}
					else if(isPlayable(0,8)) {
						return new IgracResponse(true, null, new FieldData(0,8));
					}
					else if(isPlayable(2,8)) {
						return new IgracResponse(true, null, new FieldData(2,8));
					}
				}
				else {
					if(ucestalostBrojeva(1,3)) {
						return kecevi(request);
					}
					if(ucestalostBrojeva(2,3)) {
						return dvojke(request);
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE) {
				if(metode.min()<=9) {
					for(int i=0; i<Constants.DICE_COUNT; i++) {
						if(isPlayable(3,8)) {
							return new IgracResponse(true, null, new FieldData(3,8));
						}
						else if(isPlayable(1,8)) {
							return new IgracResponse(true, null, new FieldData(1,8));
						}
						else if(isPlayable(4,8)) {
							return new IgracResponse(true, null, new FieldData(4,8));
						}
						else if(isPlayable(0,8)) {
							return new IgracResponse(true, null, new FieldData(0,8));
						}
						else if(isPlayable(2,8)) {
							return new IgracResponse(true, null, new FieldData(2,8));
						}
					}
				}
				else {
					if(ucestalostBrojeva(1,3)) {
						return kecevi(request);
					}
					if(ucestalostBrojeva(2,3)) {
						return dvojke(request);
					}
				}
				if(metode.min()<=12) {
					if(ucestalostBrojeva(1,3)) {
						return kecevi(request);
					}
					if(ucestalostBrojeva(2,3)) {
						return dvojke(request);
					}
					if(isPlayable(3,8)) {
						return new IgracResponse(true, null, new FieldData(3,8));
					}
					else if(isPlayable(1,8)) {
						return new IgracResponse(true, null, new FieldData(1,8));
					}
					else if(isPlayable(4,8)) {
						return new IgracResponse(true, null, new FieldData(4,8));
					}
					else if(isPlayable(0,8)) {
						return new IgracResponse(true, null, new FieldData(0,8));
					}
					else if(isPlayable(2,8)) {
						return new IgracResponse(true, null, new FieldData(2,8));
					}
				}
				else {
					if(metode.kenta()) {
						return logikaKenta(request);
					}
					if(metode.fourOfaKind()) {
						return logikaPoker(request);
					}
					if(metode.threeOfaKind()) {
						return logikaTrilling(request);
					}
					if(metode.full()) {
						return logikaFull(request);
					}
					if(metode.dupliPar()) {
						return logikaFull(request);
					}
					if(metode.dupliPar()) {
						return logikaTrilling(request);
					}
				}
			}
		}
		return null;
	}
	
	public Response logikaKenta(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(metode.kenta()) {
					if(isPlayable(6,10)) {
						return new IgracResponse(true, null, new FieldData(6,10));
					}
					else if (isPlayable(1,10)){
						return new IgracResponse(true, null, new FieldData(1,10));
					}
					else if(isPlayable(3,10)) {
						return new IgracResponse(true, null, new FieldData(3,10));
					}
					else if(isPlayable(5,10)) {
						return new IgracResponse(true, null, new FieldData(5,10));
					}
					else if(isPlayable(2,10)) {
						return new IgracResponse(true, null, new FieldData(2,10));
					}
					else if(isPlayable(4,10)) {
						return new IgracResponse(true, null, new FieldData(4,10));
					}
					else if(isPlayable(0,10)) {
						return new IgracResponse(true, null, new FieldData(0,10));
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(metode.kenta()) {
					if (isPlayable(1,10)){
						return new IgracResponse(true, null, new FieldData(1,10));
					}
					else if(isPlayable(3,10)) {
						return new IgracResponse(true, null, new FieldData(3,10));
					}
					else if(isPlayable(2,10)) {
						return new IgracResponse(true, null, new FieldData(2,10));
					}
					else if(isPlayable(4,10)) {
						return new IgracResponse(true, null, new FieldData(4,10));
					}
					else if(isPlayable(0,10)) {
						return new IgracResponse(true, null, new FieldData(0,10));
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
				if(metode.kenta()) {
					if (isPlayable(1,10)){
						return new IgracResponse(true, null, new FieldData(1,10));
					}
					else if(isPlayable(3,10)) {
						return new IgracResponse(true, null, new FieldData(3,10));
					}
					else if(isPlayable(2,10)) {
						return new IgracResponse(true, null, new FieldData(2,10));
					}
					else if(isPlayable(4,10)) {
						return new IgracResponse(true, null, new FieldData(4,10));
					}
					else if(isPlayable(0,10)) {
						return new IgracResponse(true, null, new FieldData(0,10));
					}
				}
			}
		}
		return null;
	}
	
	public Response logikaYamb(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(metode.fiveOfaKind()) {
					if(isPlayable(2,14)) {
						return new IgracResponse(true, null, new FieldData(2,14));
					}
					else if(isPlayable(4,14)) {
						return new IgracResponse(true, null, new FieldData(4,14));
					}
					else if(isPlayable(6,14)){
						return new IgracResponse(true, null, new FieldData(6,14));
					}
					else if(isPlayable(1,14)) {
						return new IgracResponse(true, null, new FieldData(1,14));
					}
					else if(isPlayable(5,14)) {
						return new IgracResponse(true, null, new FieldData(5,14));
					}
					else if(isPlayable(3,14)) {
						return new IgracResponse(true, null, new FieldData(3,14));
					}
					else if(isPlayable(0,14)) {
						return new IgracResponse(true, null, new FieldData(0,14));
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(metode.fiveOfaKind()) {
					if(isPlayable(2,14)) {
						return new IgracResponse(true, null, new FieldData(2,14));
					}
					else if(isPlayable(4,14)) {
						return new IgracResponse(true, null, new FieldData(4,14));
					}
					else if(isPlayable(1,14)) {
						return new IgracResponse(true, null, new FieldData(1,14));
					}
					else if(isPlayable(3,14)) {
						return new IgracResponse(true, null, new FieldData(3,14));
					}
					else if(isPlayable(0,14)) {
						return new IgracResponse(true, null, new FieldData(0,14));
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE) {
				if(metode.fiveOfaKind()) {
					if(isPlayable(2,14)) {
						return new IgracResponse(true, null, new FieldData(2,14));
					}
					else if(isPlayable(4,14)) {
						return new IgracResponse(true, null, new FieldData(4,14));
					}
					else if(isPlayable(1,14)) {
						return new IgracResponse(true, null, new FieldData(1,14));
					}
					else if(isPlayable(3,14)) {
						return new IgracResponse(true, null, new FieldData(3,14));
					}
					else if(isPlayable(0,14)) {
						return new IgracResponse(true, null, new FieldData(0,14));
					}
				}
			}
		}
		return null;
	}
	
	public Response logikaPoker(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(ucestalostBrojeva(1, 3)) {
					return kecevi(request);
				}
				if(ucestalostBrojeva(2,3)) {
					return dvojke(request);
				}
				if(metode.fourOfaKind()) {
					if(isPlayable(6,13)) {
						return new IgracResponse(true, null, new FieldData(6,13));
					}
					else if(isPlayable(5,13)) {
						return new IgracResponse(true, null, new FieldData(5,13));
					}
					else if (isPlayable(2,13)){
						return new IgracResponse(true, null, new FieldData(2,13));
					}
					else if(isPlayable(3,13)) {
						return new IgracResponse(true, null, new FieldData(3,13));
					}
					else if(isPlayable(4,13)) {
						return new IgracResponse(true, null, new FieldData(4,13));
					}
					else if(isPlayable(1,13)) {
						return new IgracResponse(true, null, new FieldData(1,13));
					}
					else if(isPlayable(0,13)) {
						return new IgracResponse(true, null, new FieldData(0,13));
					}
				}	
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(metode.fourOfaKind()) {
					if(ucestalostBrojeva(1,3)) {
						return kecevi(request);
					}
					if(metode.fiveOfaKind()) {
						if(isPlayable(2,14)) {
							return new IgracResponse(true, null, new FieldData(2,14));
						}
						else if(isPlayable(1,14)) {
							return new IgracResponse(true, null, new FieldData(1,14));
						}
						else if(isPlayable(4,14)) {
							return new IgracResponse(true, null, new FieldData(4,14));
						}
						else if(isPlayable(3,14)) {
							return new IgracResponse(true, null, new FieldData(3,14));
						}
						else if(isPlayable(0,14)) {
							return new IgracResponse(true, null, new FieldData(0,14));
						}
					}
					if(isPlayable(2,13)){
						return new IgracResponse(true, null, new FieldData(2,13));
					}
					else if(isPlayable(3,13)) {
						return new IgracResponse(true, null, new FieldData(3,13));
					}
					else if(isPlayable(4,13)) {
						return new IgracResponse(true, null, new FieldData(4,13));
					}
					else if(isPlayable(1,13)) {
						return new IgracResponse(true, null, new FieldData(1,13));
					}
					else if(isPlayable(0,13)) {
						return new IgracResponse(true, null, new FieldData(0,13));
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE) {
				for(int i=0; i<Constants.DICE_COUNT; i++) {
					if(ucestalostBrojeva(1,3)) {
						return kecevi(request);
					}
					else if(metode.fourOfaKind()) {
						if(metode.fiveOfaKind()) {
							if(isPlayable(1,14)) {
								return new IgracResponse(true, null, new FieldData(1,14));
							}
							else if(isPlayable(2,14)) {
								return new IgracResponse(true, null, new FieldData(2,14));
							}
							else if(isPlayable(4,14)) {
								return new IgracResponse(true, null, new FieldData(4,14));
							}
							else if(isPlayable(3,14)) {
								return new IgracResponse(true, null, new FieldData(3,14));
							}
							else if(isPlayable(0,14)) {
								return new IgracResponse(true, null, new FieldData(0,14));
							}
						}
						if (isPlayable(2,13)){
							return new IgracResponse(true, null, new FieldData(2,13));
						}
						else if(isPlayable(3,13)) {
							return new IgracResponse(true, null, new FieldData(3,13));
						}
						else if(isPlayable(4,13)) {
							return new IgracResponse(true, null, new FieldData(4,13));
						}
						else if(isPlayable(1,13)) {
							return new IgracResponse(true, null, new FieldData(1,13));
						}
						else if(isPlayable(0,13)) {
							return new IgracResponse(true, null, new FieldData(0,13));
						}
					}
				}
			}
		}
		return null;
	}
	
	public Response logikaFull(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(metode.full()) {
					if(ucestalostBrojeva(1,2) && ucestalostBrojeva(2,3)) {
						return min(request);
					}
					if(ucestalostBrojeva(1, 2)) {
						return kecevi(request);
					}
					if(ucestalostBrojeva(2, 3)) {
						return dvojke(request);
					}
					if(isPlayable(6,12)) {
						return new IgracResponse(true, null, new FieldData(6,12));
					}
					else if(isPlayable(5,12)) {
						return new IgracResponse(true, null, new FieldData(5,12));
					}
					else if (isPlayable(2,12)){
						return new IgracResponse(true, null, new FieldData(2,12));
					}
					else if (isPlayable(3,12)){
						return new IgracResponse(true, null, new FieldData(3,12));
					}
					else if(isPlayable(4,12)) {
						return new IgracResponse(true, null, new FieldData(4,12));
					}
					else if(isPlayable(1,12)) {
						return new IgracResponse(true, null, new FieldData(1,12));
					}
					else if(isPlayable(0,12)) {
						return new IgracResponse(true, null, new FieldData(0,12));
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
				if(metode.full()) {
					if(ucestalostBrojeva(1,2) && ucestalostBrojeva(2,3)) {
						return min(request);
					}
					if(ucestalostBrojeva(1,3)) {
						return kecevi(request);
					}
					if (isPlayable(2,12)){
						return new IgracResponse(true, null, new FieldData(2,12));
					}
					else if (isPlayable(3,12)){
						return new IgracResponse(true, null, new FieldData(3,12));
					}
					else if(isPlayable(4,12)) {
						return new IgracResponse(true, null, new FieldData(4,12));
					}
					else if(isPlayable(1,12)) {
						return new IgracResponse(true, null, new FieldData(1,12));
					}
					else if(isPlayable(0,12)) {
						return new IgracResponse(true, null, new FieldData(0,12));
					}
				}
			}
			else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE) {
				if(metode.full()) {
					if(ucestalostBrojeva(1,2) && ucestalostBrojeva(2,3)) {
						return min(request);
					}
					if(ucestalostBrojeva(1,3)) {
						return kecevi(request);
					}
					if (isPlayable(2,12)){
						return new IgracResponse(true, null, new FieldData(2,12));
					}
					else if (isPlayable(3,12)){
						return new IgracResponse(true, null, new FieldData(3,12));
					}
					else if(isPlayable(4,12)) {
						return new IgracResponse(true, null, new FieldData(4,12));
					}
					else if(isPlayable(1,12)) {
						return new IgracResponse(true, null, new FieldData(1,12));
					}
					else if(isPlayable(0,12)) {
						return new IgracResponse(true, null, new FieldData(0,12));
					}
				}
			}
		}
		return null;
	}
	
	public Response logikaTrilling(Request request) {
		if(request.getType()==RequestType.THROW) {
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(ucestalostBrojeva(1, 2)) {
					return kecevi(request);
				}
				if(ucestalostBrojeva(2,3)) {
					return dvojke(request);
				}
				if(ucestalostBrojeva(3,3)) {
					return trojke(request);
				}
				if(ucestalostBrojeva(4,3)) {
					return cetvorke(request);
				}
				if(ucestalostBrojeva(5,3)) {
					return petice(request);
				}
				if(ucestalostBrojeva(6,3)) {
					return sestice(request);
				}
				if(metode.threeOfaKind()) {
					if(isPlayable(6,11)) {
						return new IgracResponse(true, null, new FieldData(6,11));
					}
					else if(isPlayable(5,11)) {
						return new IgracResponse(true, null, new FieldData(5,11));
					}
					else if(isPlayable(2,11)){
						return new IgracResponse(true, null, new FieldData(2,11));
					}
					else if(isPlayable(3,11)) {
						return new IgracResponse(true, null, new FieldData(3,11));
					}
					else if(isPlayable(4,11)) {
						return new IgracResponse(true, null, new FieldData(4,11));
					}
					else if(isPlayable(1,11)) {
						return new IgracResponse(true, null, new FieldData(1,11));
					}
					else if(isPlayable(0,11)) {
						return new IgracResponse(true, null, new FieldData(0,11));
					}
				}	
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			for(int i=1;i<=Constants.DICE_COUNT;i++) {
				if(metode.threeOfaKind()) {
					if(metode.fourOfaKind()) {
						if(ucestalostBrojeva(1,4)) {
							return kecevi(request);
						}
						return logikaPoker(request);
					}
					if(isPlayable(2,11)){
						return new IgracResponse(true, null, new FieldData(2,11));
					}
					else if(isPlayable(3,11)) {
						return new IgracResponse(true, null, new FieldData(3,11));
					}
					else if(isPlayable(4,11)) {
						return new IgracResponse(true, null, new FieldData(4,11));
					}
					else if(isPlayable(1,11)) {
						return new IgracResponse(true, null, new FieldData(1,11));
					}
					else if(isPlayable(0,11)) {
						return new IgracResponse(true, null, new FieldData(0,11));
					}
				}
				else if(ucestalostBrojeva(i,2)) {
					return new IgracResponse(false, metode.cuvajKockice(i), null);
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE) {
			if(ucestalostBrojeva(1,2)) {
				return kecevi(request);
			}
			if(metode.threeOfaKind()) {
				if(metode.fourOfaKind()) {
					if(ucestalostBrojeva(1,4)) {
						return kecevi(request);
					}
					return logikaPoker(request);
				}
				if(isPlayable(2,11)){
					return new IgracResponse(true, null, new FieldData(2,11));
				}
				else if(isPlayable(3,11)) {
					return new IgracResponse(true, null, new FieldData(3,11));
				}
				else if(isPlayable(4,11)) {
					return new IgracResponse(true, null, new FieldData(4,11));
				}
				else if(isPlayable(1,11)) {
					return new IgracResponse(true, null, new FieldData(1,11));
				}
				else if(isPlayable(0,11)) {
					return new IgracResponse(true, null, new FieldData(0,11));
				}
			}
		}
		return null;
	}

	public Response metodeBrojevi(Request request) {
		Response response=null;
		if(logikaYamb(request)!=null){
			response=logikaYamb(request);
			return response;
		}
		if(min(request)!=null){
			response=min(request);
			return response;
		}
		if(logikaKenta(request)!=null){
			response=logikaKenta(request);
			return response;
		}
		if(logikaPoker(request)!=null){
			response=logikaPoker(request);
			return response;
		}
		if(logikaTrilling(request)!=null){
			response=logikaTrilling(request);
			return response;
		}
		if(logikaFull(request)!=null){
			response=logikaFull(request);
			return response;
		}
		if(max(request)!=null){
			response=max(request);
			return response;
		}
		if(sestice(request)!=null){
			response=sestice(request);
			return response;
		}
		if(petice(request)!=null){
			response=petice(request);
			return response;
		}
		if(cetvorke(request)!=null){
			response=cetvorke(request);
			return response;
		}
		if(trojke(request)!=null){
			response=trojke(request);
			return response;
		}	
		if(dvojke(request)!=null){
			response=dvojke(request);
			return response;
		}
		if(kecevi(request)!=null){
			response=kecevi(request);
			return response;
		}
		return null;
	}
}
