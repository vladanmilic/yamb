package com.comtrade.yamb.player.igracGrupa1;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.FieldData;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.RequestType;
import com.comtrade.yamb.Response;

public class YambKoloneBrojevi {
	Request request;
	YambMetode metode;
	YambUtils utils;
	public YambKoloneBrojevi(Request request, YambMetode metode, YambUtils utils) {
		this.request=request;
		this.metode=metode;
		this.utils=utils;
	}
		
	public Response svePoDva() { //metod koji vraca program na da upisuje brojeve od 1 do 6 u slucaju da ih je po dva ili vise
		if(utils.ucestalostBrojeva(1,2)) {
			return kecevi(request);
		}
		if(utils.ucestalostBrojeva(2,2)) {
			return dvojke(request);
		}
		if(utils.ucestalostBrojeva(3,2)) {
			return trojke(request);
		}
		if(utils.ucestalostBrojeva(4,2)) {
			return cetvorke(request);
		}
		if(utils.ucestalostBrojeva(5,2)) {
			return petice(request);
		}
		if(utils.ucestalostBrojeva(6,2)) {
			return sestice(request);
		}
		return null;
	}
	
	public Response kecevi(Request request) { //metod koji vrsi logiku upisivanja jedinica
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(utils.ucestalostBrojeva(1,2)) {
				if(utils.isPlayable(0,0)) {
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(0,0));
				}
				if (utils.isPlayable(5,0)){
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(5,0));
				}
				if(utils.isPlayable(4,0)) {
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(4,0));
				}
				if(utils.isPlayable(1,0)){
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(1,0));
				}
				if(utils.isPlayable(6,0)) { 
					return new IgracResponse(true, null, new FieldData(6,0));
				}
				if(utils.isPlayable(3,0)) {
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(3,0));
				}
				if(utils.isPlayable(2,0)) {
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(2,0));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(utils.ucestalostBrojeva(1,3)) {
				if(utils.isPlayable(0,0)) {
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(0,0));
				}
				if(utils.isPlayable(4,0)) {
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(4,0));
				}
				if(utils.isPlayable(1,0)){
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(1,0));
				}
				if(utils.isPlayable(3,0)) {
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(3,0));
				}
				if(utils.isPlayable(2,0)) {
					return new IgracResponse(false, metode.cuvajKockice(1), new FieldData(2,0));
				}
			}
			else if(utils.ucestalostBrojeva(1, 2)) {
				return new IgracResponse(false, metode.cuvajKockice(1), null);
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
			if(utils.ucestalostBrojeva(1,3)) {
				if(utils.isPlayable(0,0)) {
					return new IgracResponse(true, null, new FieldData(0,0));
				}
				if(utils.isPlayable(4,0)) {
					return new IgracResponse(true, null, new FieldData(4,0));
				}
				if(utils.isPlayable(1,0)){
					return new IgracResponse(true, null, new FieldData(1,0));
				}
				if(utils.isPlayable(3,0)) {
					return new IgracResponse(true, null, new FieldData(3,0));
				}
				if(utils.isPlayable(2,0)) {
					return new IgracResponse(true, null, new FieldData(2,0));
				}
			}
			else if(utils.ucestalostBrojeva(1,2)) {
				if(utils.isPlayable(0,0)) {
					return new IgracResponse(true, null, new FieldData(0,0));
				}
				if(utils.isPlayable(4,0)) {
					return new IgracResponse(true, null, new FieldData(4,0));
				}
				if(utils.isPlayable(1,0)){
					return new IgracResponse(true, null, new FieldData(1,0));
				}
				if(utils.isPlayable(3,0)) {
					return new IgracResponse(true, null, new FieldData(3,0));
				}
				if(utils.isPlayable(2,0)) {
					return new IgracResponse(true, null, new FieldData(2,0));
				}
			}
		}	
		return null;
	}
	
	public Response dvojke(Request request) { //metod koji vrsi logiku upisivanja dvojki
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(utils.ucestalostBrojeva(2,2)) {
				if(utils.isPlayable(0,1)) {
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(0,1));
				}
				if(utils.isPlayable(1,1)){
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(1,1));
				}
				if(utils.isPlayable(4,1)) {
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(4,1));
				}
				if(utils.isPlayable(6,1)) {
					return new IgracResponse(true, null, new FieldData(6,1));
				}
				if(utils.isPlayable(5,1)) {
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(5,1));
				}
				if(utils.isPlayable(3,1)) {
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(3,1));
				}
				if(utils.isPlayable(2,1)) {
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(2,1));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(utils.ucestalostBrojeva(2,3)) {
				if(utils.isPlayable(0,1)) {
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(0,1));
				}
				if(utils.isPlayable(1,1)){
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(1,1));
				}
				if(utils.isPlayable(4,1)) {
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(4,1));
				}
				if(utils.isPlayable(3,1)) {
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(3,1));
				}
				if(utils.isPlayable(2,1)) {
					return new IgracResponse(false, metode.cuvajKockice(2), new FieldData(2,1));
				}
			}
			else if(utils.ucestalostBrojeva(2, 2)) {
				return new IgracResponse(false, metode.cuvajKockice(2), null);
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
			if(utils.ucestalostBrojeva(2,3)) {
				if(utils.isPlayable(0,1)) {
					return new IgracResponse(true, null, new FieldData(0,1));
				}
				if(utils.isPlayable(1,1)){
					return new IgracResponse(true, null, new FieldData(1,1));
				}
				if(utils.isPlayable(4,1)) {
					return new IgracResponse(true, null, new FieldData(4,1));
				}
				if(utils.isPlayable(3,1)) {
					return new IgracResponse(true, null, new FieldData(3,1));
				}
				if(utils.isPlayable(2,1)) {
					return new IgracResponse(true, null, new FieldData(2,1));
				}
			}
			else if(utils.ucestalostBrojeva(2,2)) {
				if(utils.isPlayable(0,1)) {
					return new IgracResponse(true, null, new FieldData(0,1));
				}
				if(utils.isPlayable(1,1)) {
					return new IgracResponse(true, null, new FieldData(1,1));
				}
				if(utils.isPlayable(4,1)) {
					return new IgracResponse(true, null, new FieldData(4,1));
				}
				if(utils.isPlayable(3,1)) {
					return new IgracResponse(true, null, new FieldData(3,1));
				}
				if(utils.isPlayable(2,1)) {
					return new IgracResponse(true, null, new FieldData(2,1));
				}
			}
		}
		return null;
	}

	private Response trojke(Request request) { //metod koji vrsi logiku upisivanja trojki
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(utils.ucestalostBrojeva(3,2)) {
				if(utils.isPlayable(6,2)) {
					return new IgracResponse(true, null, new FieldData(6,2));
				}
				if(utils.isPlayable(0,2)) {
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(0,2));
				}
				if(utils.isPlayable(1,2)) {
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(1,2));
				}
				if(utils.isPlayable(5,2)) {
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(5,2));
				}
				if(utils.isPlayable(4,2)){
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(4,2));
				}
				if(utils.isPlayable(3,2) ) {
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(3,2));
				}
				if(utils.isPlayable(2,2)) {
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(2,2));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(utils.ucestalostBrojeva(3,4)) {
				if(utils.isPlayable(0,2)) {
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(0,2));
				}
				if(utils.isPlayable(1,2)) {
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(1,2));
				}
				if(utils.isPlayable(4,2)){
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(4,2));
				}
				if(utils.isPlayable(3,2)) {
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(3,2));
				}
				if(utils.isPlayable(2,2)) {
					return new IgracResponse(false, metode.cuvajKockice(3), new FieldData(2,2));
				}
			}
			else if(utils.ucestalostBrojeva(3, 2)) {
				return new IgracResponse(false, metode.cuvajKockice(3), null);
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
			if(utils.ucestalostBrojeva(3,3)) {
				if(utils.isPlayable(0,2)) {
					return new IgracResponse(true, null, new FieldData(0,2));
				}
				if(utils.isPlayable(1,2)) {
					return new IgracResponse(true, null, new FieldData(1,2));
				}
				if(utils.isPlayable(4,2)) {
					return new IgracResponse(true, null, new FieldData(4,2));
				}
				if(utils.isPlayable(3,2)) {
					return new IgracResponse(true, null, new FieldData(3,2));
				}
				if(utils.isPlayable(2,2)) {
					return new IgracResponse(true, null, new FieldData(2,2));
				}
			}
			else if(utils.ucestalostBrojeva(3,2)){
				if(utils.isPlayable(0,2)) {
					return new IgracResponse(true, null, new FieldData(0,2));
				}
				if(utils.isPlayable(1,2)) {
					return new IgracResponse(true, null, new FieldData(1,2));
				}
				if(utils.isPlayable(4,2)){
					return new IgracResponse(true, null, new FieldData(4,2));
				}
				if(utils.isPlayable(3,2)) {
					return new IgracResponse(true, null, new FieldData(3,2));
				}
				if(utils.isPlayable(2,2)) {
					return new IgracResponse(true, null, new FieldData(2,2));
				}
			}
		}
		return null;
	}
	
	private Response cetvorke(Request request) { //metod koji vrsi logiku upisivanja cetvorki
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(utils.ucestalostBrojeva(4,2)) {
				if(utils.isPlayable(6,3)) {
					return new IgracResponse(true, null, new FieldData(6,3));
				}
				if(utils.isPlayable(0,3)) {
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(0,3));
				}
				if(utils.isPlayable(4,3)) {
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(4,3));
				}
				if(utils.isPlayable(1,3)){
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(1,3));
				}
				if(utils.isPlayable(3,3)) {
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(3,3));
				}
				if(utils.isPlayable(5,3)) {
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(5,3));
				}
				if(utils.isPlayable(2,3)) {
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(2,3));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(utils.ucestalostBrojeva(4,4)) {
				if(utils.isPlayable(0,3)) {
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(0,3));
				}
				if(utils.isPlayable(4,3)) {
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(4,3));
				}
				if(utils.isPlayable(1,3)){
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(1,3));
				}
				if(utils.isPlayable(3,3)) {
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(3,3));
				}
				if(utils.isPlayable(2,3)){
					return new IgracResponse(false, metode.cuvajKockice(4), new FieldData(2,3));
				}
				if(utils.isPlayable(1,13) || utils.isPlayable(2,13) || utils.isPlayable(3,13) || utils.isPlayable(4,13) || utils.isPlayable(0,13)) {
					return logikaPoker(request);
				}
				if(utils.isPlayable(1,11) || utils.isPlayable(2,11) || utils.isPlayable(3,11) || utils.isPlayable(4,11) || utils.isPlayable(0,11)) {
					return logikaTrilling(request);
				}
			}
			else if(utils.ucestalostBrojeva(4, 2)) {
				return new IgracResponse(false, metode.cuvajKockice(4), null);
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
			if(utils.ucestalostBrojeva(4,3)) {
				if(utils.isPlayable(0,3)) {
					return new IgracResponse(true, null, new FieldData(0,3));
				}
				if(utils.isPlayable(4,3)) {
					return new IgracResponse(true, null, new FieldData(4,3));
				}
				if(utils.isPlayable(1,3)){
					return new IgracResponse(true, null, new FieldData(1,3));
				}
				if(utils.isPlayable(3,3)) {
					return new IgracResponse(true, null, new FieldData(3,3));
				}
				else if(utils.isPlayable(2,3)){
					return new IgracResponse(true, null, new FieldData(2,3));
				}
				if(utils.isPlayable(1,11) || utils.isPlayable(2,11) || utils.isPlayable(3,11) || utils.isPlayable(4,11) || utils.isPlayable(0,11)) {
					return logikaTrilling(request);
				}
			}
			else if((utils.ucestalostBrojeva(4, 2))){
				if(utils.isPlayable(0,3)) {
					return new IgracResponse(true, null, new FieldData(0,3));
				}
				if(utils.isPlayable(4,3)) {
					return new IgracResponse(true, null, new FieldData(4,3));
				}
				if(utils.isPlayable(1,3)){
					return new IgracResponse(true, null, new FieldData(1,3));
				}
				if(utils.isPlayable(3,3)) {
					return new IgracResponse(true, null, new FieldData(3,3));
				}
				if(utils.isPlayable(2,3)){
					return new IgracResponse(true, null, new FieldData(2,3));
				}
			}
		}
		return null;
	}

	private Response petice(Request request) { //metod koji vrsi logiku upisivanja petica
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(utils.ucestalostBrojeva(5,3)) {
				if(utils.isPlayable(6,4)) {
					return new IgracResponse(true, null, new FieldData(6,4));
				}
				if(utils.isPlayable(0,4)) {
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(0,4));
				}
				if(utils.isPlayable(1,4)) {
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(1,4));
				}
				if(utils.isPlayable(5,4)){
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(5,4));
				}
				if(utils.isPlayable(3,4)){
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(3,4));
				}
				if(utils.isPlayable(4,4)){
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(4,4));
				}
				if(utils.isPlayable(2,4)){
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(2,4));
				}
				if(utils.isPlayable(1,11) || utils.isPlayable(2,11) || utils.isPlayable(3,11) || utils.isPlayable(4,11) || utils.isPlayable(0,11) || utils.isPlayable(5,11) || utils.isPlayable(6,11)) {
					return logikaTrilling(request);
				}
			}
			else if(utils.ucestalostBrojeva(5, 2)) {
				return new IgracResponse(false, metode.cuvajKockice(5), null);
			}
			else if(utils.isPlayable(5,11)) {
				if(utils.ucestalostBrojeva(5, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(5,11));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(utils.ucestalostBrojeva(5,4)) {
				if(utils.isPlayable(0,4)) {
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(0,4));
				}
				if(utils.isPlayable(1,4)) {
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(1,4));
				}
				if(utils.isPlayable(4,4)){
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(4,4));
				}
				if(utils.isPlayable(3,4)){
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(3,4));
				}
				if(utils.isPlayable(2,4)){
					return new IgracResponse(false, metode.cuvajKockice(5), new FieldData(2,4));
				}
				if(utils.isPlayable(0,13) || utils.isPlayable(1,13) || utils.isPlayable(2,13) || utils.isPlayable(3,13) || utils.isPlayable(4,13)) {
					return logikaPoker(request);
				}
				if(utils.isPlayable(0,11) || utils.isPlayable(1,11) || utils.isPlayable(2,11) || utils.isPlayable(3,11) || utils.isPlayable(4,11)) {
					return logikaTrilling(request);
				}
			}
			else if(utils.ucestalostBrojeva(5, 2)) {
				return new IgracResponse(false, metode.cuvajKockice(5), null);
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
			if(utils.ucestalostBrojeva(5,3)) {
				if(utils.isPlayable(0,4)) {
					return new IgracResponse(true, null, new FieldData(0,4));
				}
				if(utils.isPlayable(1,4)) {
					return new IgracResponse(true, null, new FieldData(1,4));
				}
				if(utils.isPlayable(4,4)){
					return new IgracResponse(true, null, new FieldData(4,4));
				}
				if(utils.isPlayable(3,4)){
					return new IgracResponse(true, null, new FieldData(3,4));
				}
				if(utils.isPlayable(2,4)){
					return new IgracResponse(true, null, new FieldData(2,4));
				}
				if(utils.isPlayable(2,11)) {
					return new IgracResponse(true, null, new FieldData(2,11));
				}
				if(utils.isPlayable(3,11)) {
					return new IgracResponse(true, null, new FieldData(3,11));
				}
				if(utils.isPlayable(1,11)) {
					return new IgracResponse(true, null, new FieldData(1,11));
				}
				if(utils.isPlayable(4,11)) {
					return new IgracResponse(true, null, new FieldData(4,11));
				}
				if(utils.isPlayable(0,11)) {
					return new IgracResponse(true, null, new FieldData(0,11));
				}
			}
			else if(utils.ucestalostBrojeva(5,2)) {
				if(utils.isPlayable(0,4)) {
					return new IgracResponse(true, null, new FieldData(0,4));
				}
				if(utils.isPlayable(1,4)) {
					return new IgracResponse(true, null, new FieldData(1,4));
				}
				if(utils.isPlayable(4,4)){
					return new IgracResponse(true, null, new FieldData(4,4));
				}
				if(utils.isPlayable(3,4)){
					return new IgracResponse(true, null, new FieldData(3,4));
				}
				if(utils.isPlayable(2,4)){
					return new IgracResponse(true, null, new FieldData(2,4));
				}
			}
		}
		return null;
	}
	
	private Response sestice(Request request) { //metod koji vrsi logiku upisivanja sestica
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(utils.ucestalostBrojeva(6,3)) {
				if(utils.isPlayable(6,5)) {
					return new IgracResponse(true, null, new FieldData(6,5));
				}
				if(utils.isPlayable(0,5)) {
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(0,5));
				}
				if(utils.isPlayable(1,5)) {
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(1,5));
				}
				if(utils.isPlayable(5,5)){
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(5,5));
				}
				if(utils.isPlayable(4,5)){
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(4,5));
				}
				if(utils.isPlayable(3,5)){
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(3,5));
				}
				if(utils.isPlayable(2,5)){
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(2,5));
				}
				if(utils.isPlayable(0,11) || utils.isPlayable(1,11) || utils.isPlayable(2,11) || utils.isPlayable(3,11) || utils.isPlayable(4,11) || utils.isPlayable(6,11) || utils.isPlayable(5,11)) {
					return logikaTrilling(request);
				}
			}
			else if(utils.ucestalostBrojeva(6, 2)) {
				return new IgracResponse(false, metode.cuvajKockice(6), null);
			}
			else if(utils.isPlayable(5,11)) {
				if(utils.ucestalostBrojeva(6, 2)) {
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(5,11));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(utils.ucestalostBrojeva(6,4)) {
				if(utils.isPlayable(0,5)) {
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(0,5));
				}
				if(utils.isPlayable(1,5)) {
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(1,5));
				}
				if(utils.isPlayable(4,5)){
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(4,5));
				}
				if(utils.isPlayable(3,5)){
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(3,5));
				}
				if(utils.isPlayable(2,5)){
					return new IgracResponse(false, metode.cuvajKockice(6), new FieldData(2,5));
				}
				if(utils.isPlayable(0,13) || utils.isPlayable(1,13) || utils.isPlayable(2,13) || utils.isPlayable(3,13) || utils.isPlayable(4,13)) {
					return logikaPoker(request);
				}
				if(utils.isPlayable(0,11) || utils.isPlayable(1,11) || utils.isPlayable(2,11) || utils.isPlayable(3,11) || utils.isPlayable(4,11)) {
					return logikaTrilling(request);
				}		
			}
			else if(utils.ucestalostBrojeva(6, 2)) {
				return new IgracResponse(false, metode.cuvajKockice(6), null);
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
			if(utils.ucestalostBrojeva(6,3)) {
				if(utils.isPlayable(0,5)) {
					return new IgracResponse(true, null, new FieldData(0,5));
				}
				if(utils.isPlayable(1,5)) {
					return new IgracResponse(true, null, new FieldData(1,5));
				}
				if(utils.isPlayable(4,5)){
					return new IgracResponse(true, null, new FieldData(4,5));
				}
				if(utils.isPlayable(3,5)){
					return new IgracResponse(true, null, new FieldData(3,5));
				}
				if(utils.isPlayable(2,5)){
					return new IgracResponse(true, null, new FieldData(2,5));
				}
				if(utils.isPlayable(2,11)) {
					return new IgracResponse(true, null, new FieldData(2,11));
				}
				if(utils.isPlayable(3,11)) {
					return new IgracResponse(true, null, new FieldData(3,11));
				}
				if(utils.isPlayable(1,11)) {
					return new IgracResponse(true, null, new FieldData(1,11));
				}
				if(utils.isPlayable(4,11)) {
					return new IgracResponse(true, null, new FieldData(4,11));
				}
				if(utils.isPlayable(0,11)) {
					return new IgracResponse(true, null, new FieldData(0,11));
				}
			}
			else if(utils.ucestalostBrojeva(6,2)) {
				if(utils.isPlayable(0,5)) {
					return new IgracResponse(true, null, new FieldData(0,5));
				}
				if(utils.isPlayable(1,5)) {
					return new IgracResponse(true, null, new FieldData(1,5));
				}
				if(utils.isPlayable(4,5)){
					return new IgracResponse(true, null, new FieldData(4,5));
				}
				if(utils.isPlayable(3,5)){
					return new IgracResponse(true, null, new FieldData(3,5));
				}
				if(utils.isPlayable(2,5)){
					return new IgracResponse(true, null, new FieldData(2,5));
				}
			}
		}
		return null;
	}

	private Response max(Request request) { //metod koji vrsi logiku upisivanja maximum-a
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(metode.max()>=26) {
				if(utils.isPlayable(6,7)) {
					return new IgracResponse(true, null, new FieldData(6,7));
				}
				if(utils.isPlayable(3,7)) {
					return new IgracResponse(true, null, new FieldData(3,7));
				}
				if(utils.isPlayable(1,7)) {
					return new IgracResponse(true, null, new FieldData(1,7));
				}
				if(utils.isPlayable(5,7)) {
					return new IgracResponse(true, null, new FieldData(5,7));					
				}
				if(utils.isPlayable(4,7)) {
					return new IgracResponse(true, null, new FieldData(4,7));
				}
				if(utils.isPlayable(0,7)) {
					return new IgracResponse(true, null, new FieldData(0,7));
				}
				if(utils.isPlayable(2,7)) {
					return new IgracResponse(true, null, new FieldData(2,7));
				}
			}
			else if(metode.max()>=16 && metode.max()<21) {
				if(utils.isPlayable(5,7)) {
					for(int i=5;i<=Constants.DICE_COUNT;i++) {
						if((utils.ucestalostBrojeva(i,1) && utils.ucestalostBrojeva(i, 2)) || (utils.ucestalostBrojeva(i,2) && utils.ucestalostBrojeva(i, 1))) {
							return new IgracResponse(false, metode.cuvajKockice(i), new FieldData(5,7));
						}
					}
				}
			}
			else if(utils.isPlayable(3,7) || utils.isPlayable(1,7) || utils.isPlayable(4,7) || utils.isPlayable(0,7) || utils.isPlayable(2,7)) {
				if(metode.max()>=16 && metode.max()<25) {
					for(int i=5;i<=Constants.DICE_COUNT;i++) {
						if((utils.ucestalostBrojeva(i,1) && utils.ucestalostBrojeva(i, 2)) || (utils.ucestalostBrojeva(i,2) && utils.ucestalostBrojeva(i, 1))) {
							return new IgracResponse(false, metode.cuvajKockice(i), null);
						}
					}
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(metode.max()>=26) {
				if(utils.isPlayable(3,7)) {
					return new IgracResponse(true, null, new FieldData(3,7));
				}
				if(utils.isPlayable(1,7)) {
					return new IgracResponse(true, null, new FieldData(1,7));
				}
				if(utils.isPlayable(4,7)) {
					return new IgracResponse(true, null, new FieldData(4,7));
				}
				if(utils.isPlayable(0,7)) {
					return new IgracResponse(true, null, new FieldData(0,7));
				}
				if(utils.isPlayable(2,7)) {
					return new IgracResponse(true, null, new FieldData(2,7));
				}
			}
			else if(metode.max()>=17 && metode.max()<25) {
				for(int i=5;i<=Constants.DICE_COUNT;i++) {
					if((utils.ucestalostBrojeva(i,1) && utils.ucestalostBrojeva(i, 2)) || (utils.ucestalostBrojeva(i,2) && utils.ucestalostBrojeva(i, 1))) {
						return new IgracResponse(false, metode.cuvajKockice(i), null);
					}
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
			if(metode.max()>=23) {
				if(utils.isPlayable(3,7)) {
					return new IgracResponse(true, null, new FieldData(3,7));
				}
				if(utils.isPlayable(1,7)) {
					return new IgracResponse(true, null, new FieldData(1,7));
				}
				if(utils.isPlayable(4,7)) {
					return new IgracResponse(true, null, new FieldData(4,7));
				}
				if(utils.isPlayable(0,7)) {
					return new IgracResponse(true, null, new FieldData(0,7));
				}
				if(utils.isPlayable(2,7)) {
					return new IgracResponse(true, null, new FieldData(2,7));
				}
			}
			if(metode.max()>=22) {
				if(utils.ucestalostBrojeva(5,3)) {
					return logikaTrilling(request);
				}
				if(utils.ucestalostBrojeva(6,3)) {
					return logikaTrilling(request);
				}
				if(utils.isPlayable(3,7)) {
					return new IgracResponse(true, null, new FieldData(3,7));
				}
				if(utils.isPlayable(1,7)) {
					return new IgracResponse(true, null, new FieldData(1,7));
				}
				if(utils.isPlayable(4,7)) {
					return new IgracResponse(true, null, new FieldData(4,7));
				}
				if(utils.isPlayable(0,7)) {
					return new IgracResponse(true, null, new FieldData(0,7));
				}
				if(utils.isPlayable(2,7)) {
					return new IgracResponse(true, null, new FieldData(2,7));
				}
			}
			else {
				if(metode.fiveOfaKind()) {
					return logikaYamb(request);
				}
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
					return logikaTrilling(request);
				}
				if(utils.isPlayable(2,14)) {
					return new IgracResponse(true, null, new FieldData(2,14));
				}
			}
		}
		return null;
	}
	
	private Response min(Request request) { //metod koji vrsi logiku upisivanja minimum-a
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(metode.min()<=10) {
				if(utils.isPlayable(6,8)) {
					return new IgracResponse(true, null, new FieldData(6,8));
				}
				if(utils.isPlayable(3,8)) {
					return new IgracResponse(true, null, new FieldData(3,8));
				}
				if(utils.isPlayable(5,8)) {
					return new IgracResponse(true, null, new FieldData(5,8));
				}
				if(utils.isPlayable(1,8)) {
					return new IgracResponse(true, null, new FieldData(1,8));
				}
				if(utils.isPlayable(4,8)) {
					return new IgracResponse(true, null, new FieldData(4,8));
				}
				if(utils.isPlayable(0,8)) {
					return new IgracResponse(true, null, new FieldData(0,8));
				}
				if(utils.isPlayable(2,8)) {
					return new IgracResponse(true, null, new FieldData(2,8));
				}
			}
			else {
				if(utils.ucestalostBrojeva(1,3)) {
					return kecevi(request);
				}
				if(utils.ucestalostBrojeva(2,3)) {
					return dvojke(request);
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(metode.min()<=10) {
				if(utils.isPlayable(3,8)) {
					return new IgracResponse(true, null, new FieldData(3,8));
				}
				if(utils.isPlayable(1,8)) {
					return new IgracResponse(true, null, new FieldData(1,8));
				}
				if(utils.isPlayable(4,8)) {
					return new IgracResponse(true, null, new FieldData(4,8));
				}
				if(utils.isPlayable(0,8)) {
					return new IgracResponse(true, null, new FieldData(0,8));
				}
				if(utils.isPlayable(2,8)) {
					return new IgracResponse(true, null, new FieldData(2,8));
				}
			}
			else {
				if(utils.ucestalostBrojeva(1,3)) {
					return kecevi(request);
				}
				if(utils.ucestalostBrojeva(2,3)) {
					return dvojke(request);
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE) {
			if(metode.min()<=11) {
				for(int i=0; i<Constants.DICE_COUNT; i++) {
					if(utils.isPlayable(3,8)) {
						return new IgracResponse(true, null, new FieldData(3,8));
					}
					if(utils.isPlayable(1,8)) {
						return new IgracResponse(true, null, new FieldData(1,8));
					}
					if(utils.isPlayable(4,8)) {
						return new IgracResponse(true, null, new FieldData(4,8));
					}
					if(utils.isPlayable(0,8)) {
						return new IgracResponse(true, null, new FieldData(0,8));
					}
					if(utils.isPlayable(2,8)) {
						return new IgracResponse(true, null, new FieldData(2,8));
					}
				}
			}
			else {
				if(utils.ucestalostBrojeva(1,3)) {
					return kecevi(request);
				}
				if(utils.ucestalostBrojeva(2,2)) {
					return dvojke(request);
				}
				if(utils.ucestalostBrojeva(4,3)) {
					return logikaTrilling(request);
				}
				if(utils.ucestalostBrojeva(5,3)) {
					return logikaTrilling(request);
				}
			}
			if(metode.min()<=12) {
				if(utils.isPlayable(3,8)) {
					return new IgracResponse(true, null, new FieldData(3,8));
				}
				if(utils.isPlayable(1,8)) {
					return new IgracResponse(true, null, new FieldData(1,8));
				}
				if(utils.isPlayable(4,8)) {
					return new IgracResponse(true, null, new FieldData(4,8));
				}
				if(utils.isPlayable(0,8)) {
					return new IgracResponse(true, null, new FieldData(0,8));
				}
				if(utils.isPlayable(2,8)) {
					return new IgracResponse(true, null, new FieldData(2,8));
				}
				if(utils.ucestalostBrojeva(1,3)) {
					return kecevi(request);
				}
				if(utils.ucestalostBrojeva(2,3)) {
					return dvojke(request);
				}
				if(utils.ucestalostBrojeva(4,3)) {
					return logikaTrilling(request);
				}
			}
			if(metode.min()>=13){
				if(metode.max()>=27) {
					return max(request);
				}
				if(metode.kenta()) {
					return logikaKenta(request);
				}
				if(metode.fiveOfaKind()) {
					return logikaYamb(request);
				}
				if(metode.fourOfaKind()) {
					return logikaPoker(request);
				}
				if(metode.threeOfaKind()) {
					return logikaTrilling(request);
				}
				if(metode.dupliPar()) {
					return logikaTrilling(request);
				}
				if(metode.full()) {
					return logikaFull(request);
				}
				if(utils.isPlayable(2,14)) {
					return new IgracResponse(true, null, new FieldData(2,14));
				}
			}
		}	
		return null;
	}
	
	public Response logikaKenta(Request request) { //metod koji vrsi logiku upisivanja kente
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(metode.kenta()) {
				if(utils.isPlayable(6,10)) {
					return new IgracResponse(true, null, new FieldData(6,10));
				}
				if (utils.isPlayable(1,10)){
					return new IgracResponse(true, null, new FieldData(1,10));
				}
				if(utils.isPlayable(3,10)) {
					return new IgracResponse(true, null, new FieldData(3,10));
				}
				if(utils.isPlayable(0,10)) {
					return new IgracResponse(true, null, new FieldData(0,10));
				}
				if(utils.isPlayable(5,10)) {
					return new IgracResponse(true, null, new FieldData(5,10));
				}
				if(utils.isPlayable(2,10)) {
					return new IgracResponse(true, null, new FieldData(2,10));
				}
				if(utils.isPlayable(4,10)) {
					return new IgracResponse(true, null, new FieldData(4,10));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(metode.kenta()) {
				if (utils.isPlayable(1,10)){
					return new IgracResponse(true, null, new FieldData(1,10));
				}
				if(utils.isPlayable(3,10)) {
					return new IgracResponse(true, null, new FieldData(3,10));
				}
				if(utils.isPlayable(0,10)) {
					return new IgracResponse(true, null, new FieldData(0,10));
				}
				if(utils.isPlayable(2,10)) {
					return new IgracResponse(true, null, new FieldData(2,10));
				}
				if(utils.isPlayable(4,10)) {
					return new IgracResponse(true, null, new FieldData(4,10));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE){
			if(metode.kenta()) {
				if (utils.isPlayable(1,10)){
					return new IgracResponse(true, null, new FieldData(1,10));
				}
				if(utils.isPlayable(3,10)) {
					return new IgracResponse(true, null, new FieldData(3,10));
				}
				if(utils.isPlayable(0,10)) {
					return new IgracResponse(true, null, new FieldData(0,10));
				}
				if(utils.isPlayable(2,10)) {
					return new IgracResponse(true, null, new FieldData(2,10));
				}
				if(utils.isPlayable(4,10)) {
					return new IgracResponse(true, null, new FieldData(4,10));
				}
			}
		}
		return null;
	}
	
	public Response logikaYamb(Request request) { //metod koji vrsi logiku upisivanja yamb-a
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(metode.fiveOfaKind()) {
				if(utils.isPlayable(2,14)) {
					return new IgracResponse(true, null, new FieldData(2,14));
				}
				if(utils.isPlayable(4,14)) {
					return new IgracResponse(true, null, new FieldData(4,14));
				}
				if(utils.isPlayable(6,14)){
					return new IgracResponse(true, null, new FieldData(6,14));
				}
				if(utils.isPlayable(1,14)) {
					return new IgracResponse(true, null, new FieldData(1,14));
				}
				if(utils.isPlayable(5,14)) {
					return new IgracResponse(true, null, new FieldData(5,14));
				}
				if(utils.isPlayable(3,14)) {
					return new IgracResponse(true, null, new FieldData(3,14));
				}
				if(utils.isPlayable(0,14)) {
					return new IgracResponse(true, null, new FieldData(0,14));
				}
			}
			if(metode.kenta()) {
				return logikaKenta(request);
			}
			if(metode.fourOfaKind()) {
				return logikaPoker(request);
			}
			if(metode.full()) {
				return logikaFull(request);
			}
			if(utils.ucestalostBrojeva(1,3)) {
				return kecevi(request);
			}
			if(utils.ucestalostBrojeva(2,3)) {
				return dvojke(request);
			}
			if(utils.ucestalostBrojeva(3,3)) {
				return trojke(request);
			}
			if(utils.ucestalostBrojeva(4,3)) {
				return cetvorke(request);
			}
			if(utils.ucestalostBrojeva(5,3)) {
				return petice(request);
			}
			if(utils.ucestalostBrojeva(6,3)) {
				return sestice(request);
			}
			if(metode.threeOfaKind()) {
				return logikaTrilling(request);
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(metode.fiveOfaKind()) {
				if(utils.isPlayable(2,14)) {
					return new IgracResponse(true, null, new FieldData(2,14));
				}
				if(utils.isPlayable(4,14)) {
					return new IgracResponse(true, null, new FieldData(4,14));
				}
				if(utils.isPlayable(1,14)) {
					return new IgracResponse(true, null, new FieldData(1,14));
				}
				if(utils.isPlayable(3,14)) {
					return new IgracResponse(true, null, new FieldData(3,14));
				}
				if(utils.isPlayable(0,14)) {
					return new IgracResponse(true, null, new FieldData(0,14));
				}
			}
			if(utils.ucestalostBrojeva(1,3)) {
				return kecevi(request);
			}
			if(utils.ucestalostBrojeva(2,3)) {
				return dvojke(request);
			}
			if(utils.ucestalostBrojeva(3,3)) {
				return trojke(request);
			}
			if(utils.ucestalostBrojeva(4,3)) {
				return cetvorke(request);
			}
			if(utils.ucestalostBrojeva(5,3)) {
				return petice(request);
			}
			if(utils.ucestalostBrojeva(6,3)) {
				return sestice(request);
			}
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
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE) {
			if(metode.fiveOfaKind()) {
				if(utils.isPlayable(2,14)) {
					return new IgracResponse(true, null, new FieldData(2,14));
				}
				if(utils.isPlayable(4,14)) {
					return new IgracResponse(true, null, new FieldData(4,14));
				}
				if(utils.isPlayable(1,14)) {
					return new IgracResponse(true, null, new FieldData(1,14));
				}
				if(utils.isPlayable(3,14)) {
					return new IgracResponse(true, null, new FieldData(3,14));
				}
				if(utils.isPlayable(0,14)) {
					return new IgracResponse(true, null, new FieldData(0,14));
				}
			}
			if(metode.kenta()) {
				return logikaKenta(request);
			}
			if(metode.fourOfaKind()) {
				return logikaPoker(request);
			}
			if(metode.full()) {
				return logikaFull(request);
			}
			if(metode.threeOfaKind()) {
				return logikaTrilling(request);
			}
		}
		return null;
	}
	
	public Response logikaPoker(Request request) { //metod koji vrsi logiku upisivanja poker-a
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(metode.fourOfaKind()) {
				if(utils.ucestalostBrojeva(1, 3)) {
					return kecevi(request);
				}
				if(utils.isPlayable(6,13)) {
					return new IgracResponse(true, null, new FieldData(6,13));
				}
				if(utils.isPlayable(5,13)) {
					return new IgracResponse(true, null, new FieldData(5,13));
				}
				if(utils.isPlayable(2,13)){
					return new IgracResponse(true, null, new FieldData(2,13));
				}
				if(utils.isPlayable(4,13)) {
					return new IgracResponse(true, null, new FieldData(4,13));
				}
				if(utils.isPlayable(3,13)) {
					return new IgracResponse(true, null, new FieldData(3,13));
				}
				if(utils.isPlayable(1,13)) {
					return new IgracResponse(true, null, new FieldData(1,13));
				}
				if(utils.isPlayable(0,13)) {
					return new IgracResponse(true, null, new FieldData(0,13));
				}
			}
			if(utils.ucestalostBrojeva(2,3)) {
				return dvojke(request);
			}
			if(utils.ucestalostBrojeva(3,3)) {
				return trojke(request);
			}
			if(utils.ucestalostBrojeva(4,3)) {
				return cetvorke(request);
			}
			if(utils.ucestalostBrojeva(5,3)) {
				return petice(request);
			}
			if(utils.ucestalostBrojeva(6,3)) {
				return sestice(request);
			}
			if(metode.threeOfaKind()) {
				return logikaTrilling(request);
			}
			if(metode.threeOfaKind()) {
				return logikaFull(request);
			}
			if(metode.dupliPar()) {
				return logikaFull(request);
			}
			if(metode.dupliPar()) {
				return logikaTrilling(request);
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(metode.fourOfaKind()) {
				if(utils.ucestalostBrojeva(1,3)) {
					return kecevi(request);
				}
				if(utils.isPlayable(2,13)){
					return new IgracResponse(true, null, new FieldData(2,13));
				}
				if(utils.isPlayable(3,13)) {
					return new IgracResponse(true, null, new FieldData(3,13));
				}
				if(utils.isPlayable(4,13)) {
					return new IgracResponse(true, null, new FieldData(4,13));
				}
				if(utils.isPlayable(1,13)) {
					return new IgracResponse(true, null, new FieldData(1,13));
				}
				if(utils.isPlayable(0,13)) {
					return new IgracResponse(true, null, new FieldData(0,13));
				}
			}
			if(metode.fiveOfaKind()) {
				return logikaYamb(request);
			}
			if(utils.ucestalostBrojeva(2,3)) {
				return dvojke(request);
			}
			if(utils.ucestalostBrojeva(3,3)) {
				return trojke(request);
			}
			if(utils.ucestalostBrojeva(4,3)) {
				return cetvorke(request);
			}
			if(utils.ucestalostBrojeva(5,3)) {
				return petice(request);
			}
			if(utils.ucestalostBrojeva(6,3)) {
				return sestice(request);
			}
			if(metode.threeOfaKind()){
				return logikaTrilling(request);
			}
			if(metode.full()) {
				return logikaFull(request);
			}
			if(metode.dupliPar()) {
				return logikaFull(request);
			}
			if(metode.kenta()) {
				return logikaKenta(request);
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE) {
			if(metode.fourOfaKind()) {
				if(utils.ucestalostBrojeva(1,3)) {
					return kecevi(request);
				}
				if(utils.ucestalostBrojeva(2,3)) {
					return dvojke(request);
				}
				if(utils.ucestalostBrojeva(3,3)) {
					return trojke(request);
				}
				if(utils.isPlayable(2,13)){
					return new IgracResponse(true, null, new FieldData(2,13));
				}
				if(utils.isPlayable(3,13)) {
					return new IgracResponse(true, null, new FieldData(3,13));
				}
				if(utils.isPlayable(4,13)) {
					return new IgracResponse(true, null, new FieldData(4,13));
				}
				if(utils.isPlayable(1,13)) {
					return new IgracResponse(true, null, new FieldData(1,13));
				}
				if(utils.isPlayable(0,13)) {
					return new IgracResponse(true, null, new FieldData(0,13));
				}
			}
			if(utils.ucestalostBrojeva(2,3)) {
				return dvojke(request);
			}
			if(utils.ucestalostBrojeva(3,3)) {
				return trojke(request);
			}
			if(utils.ucestalostBrojeva(4,3)) {
				return cetvorke(request);
			}
			if(utils.ucestalostBrojeva(5,3)) {
				return petice(request);
			}
			if(utils.ucestalostBrojeva(6,3)) {
				return sestice(request);
			}
			if(metode.threeOfaKind()){
				return logikaTrilling(request);
			}
			if(metode.full()) {
				return logikaFull(request);
			}
			if(metode.dupliPar()) {
				return logikaFull(request);
			}
			if(metode.kenta()) {
				return logikaKenta(request);
			}
		}
		return null;
	}
	
	public Response logikaFull(Request request) { //metod koji vrsi logiku upisivanja full-a
		if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
			if(metode.full()) {
				if((utils.ucestalostBrojeva(1,2) && utils.ucestalostBrojeva(2,3)) || (utils.ucestalostBrojeva(1,3) && utils.ucestalostBrojeva(2,2))) {
					return min(request);
				}
				if(utils.ucestalostBrojeva(1,3)) {
					return kecevi(request);
				}
				if(utils.ucestalostBrojeva(2,3)) {
					return dvojke(request);
				}
				if(utils.ucestalostBrojeva(3,3)) {
					return trojke(request);
				}
				if(utils.isPlayable(6,12)) {
					return new IgracResponse(true, null, new FieldData(6,12));
				}
				if(utils.isPlayable(5,12)) {
					return new IgracResponse(true, null, new FieldData(5,12));
				}
				if(utils.isPlayable(2,12)){
					return new IgracResponse(true, null, new FieldData(2,12));
				}
				if(utils.isPlayable(3,12)){
					return new IgracResponse(true, null, new FieldData(3,12));
				}
				if(utils.isPlayable(4,12)) {
					return new IgracResponse(true, null, new FieldData(4,12));
				}
				if(utils.isPlayable(1,12)) {
					return new IgracResponse(true, null, new FieldData(1,12));
				}
				if(utils.isPlayable(0,12)) {
					return new IgracResponse(true, null, new FieldData(0,12));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(metode.full()) {
				if(utils.ucestalostBrojeva(1,2) && utils.ucestalostBrojeva(2,3) || (utils.ucestalostBrojeva(1,3) && utils.ucestalostBrojeva(2,2))) {
					return min(request);
				}
				if(utils.ucestalostBrojeva(1,3) ) {
					return kecevi(request);
				}
				if(utils.ucestalostBrojeva(2,3)) {
					return dvojke(request);
				}
				if(utils.isPlayable(2,12)){
					return new IgracResponse(true, null, new FieldData(2,12));
				}
				if(utils.isPlayable(3,12)){
					return new IgracResponse(true, null, new FieldData(3,12));
				}
				if(utils.isPlayable(4,12)) {
					return new IgracResponse(true, null, new FieldData(4,12));
				}
				if(utils.isPlayable(1,12)) {
					return new IgracResponse(true, null, new FieldData(1,12));
				}
				if(utils.isPlayable(0,12)) {
					return new IgracResponse(true, null, new FieldData(0,12));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE) {
			if(metode.full()) {
				if(utils.ucestalostBrojeva(1,2) && utils.ucestalostBrojeva(2,3) || (utils.ucestalostBrojeva(1,3) && utils.ucestalostBrojeva(2,2))) {
					return min(request);
				}
				if(utils.ucestalostBrojeva(1,3)) {
					return kecevi(request);
				}
				if(utils.ucestalostBrojeva(2,3)) {
					return dvojke(request);
				}
				if(utils.isPlayable(2,12)){
					return new IgracResponse(true, null, new FieldData(2,12));
				}
				if(utils.isPlayable(3,12)){
					return new IgracResponse(true, null, new FieldData(3,12));
				}
				if(utils.isPlayable(4,12)) {
					return new IgracResponse(true, null, new FieldData(4,12));
				}
				if(utils.isPlayable(1,12)) {
					return new IgracResponse(true, null, new FieldData(1,12));
				}
				if(utils.isPlayable(0,12)) {
					return new IgracResponse(true, null, new FieldData(0,12));
				}
			}
		}
		return null;
	}
	
	public Response logikaTrilling(Request request) { //metod koji vrsi logiku upisivanja trilling-a
		if(request.getType()==RequestType.THROW) { //kada obrisem ovde if(request.getType()==RequestType.THROW) smanji se skor za 11.
			if(request.getThrowNumber()==Konstrakte.PRVO_BACANJE) {
				if(utils.ucestalostBrojeva(1, 2)) {
					return kecevi(request);
				}
				if(metode.threeOfaKind()) {
					if(utils.ucestalostBrojeva(2,3)) {
						return dvojke(request);
					}
					if(utils.ucestalostBrojeva(3,3)) {
						return trojke(request);
					}
					if(metode.fourOfaKind()) {
						if(utils.ucestalostBrojeva(1,3)) {
							return kecevi(request);
						}
						if(utils.ucestalostBrojeva(2,3)) {
							return dvojke(request);
						}
						if(utils.isPlayable(0, 13) || utils.isPlayable(1, 13) || utils.isPlayable(2, 13) || utils.isPlayable(3, 13) || utils.isPlayable(4, 13)) {
							return logikaPoker(request);
						}
					}
					if(utils.isPlayable(6,11)) {
						return new IgracResponse(true, null, new FieldData(6,11));
					}
					if(utils.isPlayable(5,11)) {
						return new IgracResponse(true, null, new FieldData(5,11));
					}
					if(utils.isPlayable(2,11)){
						return new IgracResponse(true, null, new FieldData(2,11));
					}
					if(utils.isPlayable(3,11)) {
						return new IgracResponse(true, null, new FieldData(3,11));
					}
					if(utils.isPlayable(1,11)) {
						return new IgracResponse(true, null, new FieldData(1,11));
					}
					if(utils.isPlayable(4,11)) {
						return new IgracResponse(true, null, new FieldData(4,11));
					}
					if(utils.isPlayable(0,11)) {
						return new IgracResponse(true, null, new FieldData(0,11));
					}
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.DRUGO_BACANJE) {
			if(metode.threeOfaKind()) {
				if(metode.fourOfaKind()) {
					if(utils.ucestalostBrojeva(1,3)) {
						return kecevi(request);
					}
					if(utils.ucestalostBrojeva(2,3)) {
						return dvojke(request);
					}
					if(utils.isPlayable(0, 13) || utils.isPlayable(1, 13) || utils.isPlayable(2, 13) || utils.isPlayable(3, 13) || utils.isPlayable(4, 13)) {
						return logikaPoker(request);
					}
				}
				if(utils.isPlayable(2,11)){
					return new IgracResponse(true, null, new FieldData(2,11));
				}
				if(utils.isPlayable(3,11)) {
					return new IgracResponse(true, null, new FieldData(3,11));
				}
				if(utils.isPlayable(1,11)) {
					return new IgracResponse(true, null, new FieldData(1,11));
				}
				if(utils.isPlayable(4,11)) {
					return new IgracResponse(true, null, new FieldData(4,11));
				}
				if(utils.isPlayable(0,11)) {
					return new IgracResponse(true, null, new FieldData(0,11));
				}
			}
		}
		else if(request.getThrowNumber()==Konstrakte.TRECE_BACANJE) {
			if(metode.threeOfaKind()) {
				if(metode.fourOfaKind()) {
					if(utils.ucestalostBrojeva(1,3)) {
						return kecevi(request);
					}
					if(utils.ucestalostBrojeva(2,3)) {
						return dvojke(request);
					}
					if(utils.isPlayable(0, 13) || utils.isPlayable(1, 13) || utils.isPlayable(2, 13) || utils.isPlayable(3, 13) || utils.isPlayable(4, 13)) {
						return logikaPoker(request);
					}
				}
				if(utils.isPlayable(2,11)){
					return new IgracResponse(true, null, new FieldData(2,11));
				}
				if(utils.isPlayable(3,11)) {
					return new IgracResponse(true, null, new FieldData(3,11));
				}
				if(utils.isPlayable(1,11)) {
					return new IgracResponse(true, null, new FieldData(1,11));
				}
				if(utils.isPlayable(4,11)) {
					return new IgracResponse(true, null, new FieldData(4,11));
				}
				if(utils.isPlayable(0,11)) {
					return new IgracResponse(true, null, new FieldData(0,11));
				}
			}
			else {
				return svePoDva();
			}
		}
		return null;
	}
	
	public Response pozoviLogiku(Request request) { //metod koji se poziva u glavnom programu da bih se dobio score
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
		if(logikaTrilling(request)!=null){
			response=logikaTrilling(request);
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
