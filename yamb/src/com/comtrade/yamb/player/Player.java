package com.comtrade.yamb.player;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Die;
import com.comtrade.yamb.FieldData;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.RequestType;
import com.comtrade.yamb.Response;
import com.comtrade.yamb.player.igracGrupa1.IgracResponse;
import com.comtrade.yamb.player.igracGrupa1.Upisivanje;
import com.comtrade.yamb.player.igracGrupa1.YambMetode;

public class Player {
	public Response play(Request request) {
		YambMetode metod=new YambMetode(request);
		Upisivanje upisi= new Upisivanje(metod);
		IgracResponse response = new IgracResponse(false, null, null);
		IgracResponse response1 = new IgracResponse(false, null, null);
		IgracResponse response2 = new IgracResponse(false, null, null);
		IgracResponse response3 = new IgracResponse(false, null, null);
		IgracResponse response4 = new IgracResponse(false, null, null);
		if(request.getType()==RequestType.THROW) {
			response=(IgracResponse) upisi.rucnaFull(request);
			response1=(IgracResponse) upisi.rucnaKenta(request);
			response2=(IgracResponse) upisi.rucnaPoker(request);
			response3=(IgracResponse) upisi.rucnaYamb(request);
			response4=(IgracResponse) upisi.rucnaTrilling(request);
		}
		return response2;
   }
}
