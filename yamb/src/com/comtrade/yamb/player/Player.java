package com.comtrade.yamb.player;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Die;
import com.comtrade.yamb.FieldData;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.RequestType;
import com.comtrade.yamb.Response;
import com.comtrade.yamb.player.igracGrupa1.IgracResponse;
import com.comtrade.yamb.player.igracGrupa1.Konstrakte;
import com.comtrade.yamb.player.igracGrupa1.Upisivanje;
import com.comtrade.yamb.player.igracGrupa1.YambKoloneBrojevi;
import com.comtrade.yamb.player.igracGrupa1.YambMetode;

public class Player {
	public Response play(Request request) {

		boolean moveOver = false;
		boolean[] cuvanjeKockica = null;
		FieldData fieldData = null;
		
		YambMetode metod=new YambMetode(request);
		YambKoloneBrojevi upisiKolone= new YambKoloneBrojevi(request, metod);
		Upisivanje upisi= new Upisivanje(metod, upisiKolone);
		IgracResponse response = new IgracResponse(moveOver, cuvanjeKockica, null);
		if(request.getType()==RequestType.THROW) {
			response=(IgracResponse) upisi.brojevi(request);
		}
		return response;
   }
}
