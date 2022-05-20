package com.comtrade.yamb.player.igracGrupa1;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Die;
import com.comtrade.yamb.FieldData;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.RequestType;
import com.comtrade.yamb.Response;
import com.comtrade.yamb.player.igracGrupa1.IgracResponse;
import com.comtrade.yamb.player.igracGrupa1.YambMetode;

public class Upisivanje {
	
	YambMetode metode;
	public Upisivanje(YambMetode metode) {
		this.metode=metode;
	}
	
	public Response rucnaKenta(Request request) {
		if(request.getType()==RequestType.THROW) {
			for(int i=0; i<Constants.DICE_COUNT; i++) {
				if(metode.kenta()) {
					if(request.getThrowNumber()==1 && request.getBoard().getColumns()[2].getFields().get(10).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(6,10));
					 	return response;
						//PISI U POLJE 6,10
					}
					else if (request.getThrowNumber()==1 && request.getBoard().getColumns()[2].getFields().get(10).isPlayable()){
						IgracResponse response = new IgracResponse(true, null, new FieldData(2,10));
					 	return response;
					}
					else if(request.getThrowNumber()==1 && request.getBoard().getColumns()[4].getFields().get(10).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(4,10));
					 	return response;
					}
					else if(request.getBoard().getColumns()[1].getFields().get(10).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(1,10));
					 	return response;
					}
				}
			}
		}
		return null;
	}
	
	public Response rucnaYamb(Request request) {
		if(request.getType()==RequestType.THROW) {
			for(int i=0; i<Constants.DICE_COUNT; i++) {
				if(metode.fiveOfaKind()) {
					if(request.getThrowNumber()==1 && request.getBoard().getColumns()[6].getFields().get(14).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(6,14));
					 	return response;
						//PISI U POLJE 6,14
					}
					else if (request.getThrowNumber()==1 && request.getBoard().getColumns()[2].getFields().get(14).isPlayable()){
						IgracResponse response = new IgracResponse(true, null, new FieldData(2,14));
					 	return response;
					}
					else if(request.getThrowNumber()==1 && request.getBoard().getColumns()[4].getFields().get(14).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(4,14));
					 	return response;
					}
					else if(request.getBoard().getColumns()[1].getFields().get(14).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(1,14));
					 	return response;
					}
				}
			}
		}
		return null;
	}
	
	public Response rucnaPoker(Request request) {
		//if(request.getType()==RequestType.THROW) {
			for(int i=0; i<Constants.DICE_COUNT; i++) {
				if(metode.fourOfaKind()) {
					if(request.getThrowNumber()==1 && request.getBoard().getColumns()[6].getFields().get(13).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(6,13));
					 	return response;
						//PISI U POLJE 6,13
					}
					else if (request.getThrowNumber()==1 && request.getBoard().getColumns()[2].getFields().get(13).isPlayable()){
						IgracResponse response = new IgracResponse(true, null, new FieldData(2,13));
					 	return response;
					}
					else if(request.getThrowNumber()==1 && request.getBoard().getColumns()[4].getFields().get(13).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(4,13));
					 	return response;
					}
					else if(request.getBoard().getColumns()[1].getFields().get(13).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(1,13));
					 	return response;
					}
				}
			}
		//}
		return null;
	}
	
	public Response rucnaFull(Request request) {
		if(request.getType()==RequestType.THROW) {
			for(int i=0; i<Constants.DICE_COUNT; i++) {
				if(metode.full()) {
					if(request.getThrowNumber()==1 && request.getBoard().getColumns()[2].getFields().get(12).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(6,12));
					 	return response;
						//PISI U POLJE 6,12
					}
					else if (request.getThrowNumber()==1 && request.getBoard().getColumns()[2].getFields().get(12).isPlayable()){
						IgracResponse response = new IgracResponse(true, null, new FieldData(2,12));
					 	return response;
					}
					else if(request.getThrowNumber()==1 && request.getBoard().getColumns()[4].getFields().get(12).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(4,12));
					 	return response;
					}
					else if(request.getBoard().getColumns()[1].getFields().get(12).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(1,12));
					 	return response;
					}
				}
			}
		}
		return null;
	}
	
	public Response rucnaTrilling(Request request) {
		if(request.getType()==RequestType.THROW) {
			for(int i=0; i<Constants.DICE_COUNT; i++) {
				if(metode.threeOfaKind()) {
					if(request.getThrowNumber()==1 && request.getBoard().getColumns()[2].getFields().get(11).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(6,11));
					 	return response;
						//PISI U POLJE 6,11
					}
					else if (request.getThrowNumber()==1 && request.getBoard().getColumns()[2].getFields().get(11).isPlayable()){
						IgracResponse response = new IgracResponse(true, null, new FieldData(2,11));
					 	return response;
					}
					else if(request.getThrowNumber()==1 && request.getBoard().getColumns()[4].getFields().get(11).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(4,11));
					 	return response;
					}
					else if(request.getBoard().getColumns()[1].getFields().get(11).isPlayable()) {
						IgracResponse response = new IgracResponse(true, null, new FieldData(1,11));
					 	return response;
					}
				}
			}
		}
		return null;
	}
}
