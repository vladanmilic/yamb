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
	YambKoloneBrojevi metodeBrojevi;
	public Upisivanje(YambMetode metode, YambKoloneBrojevi metodeBrojevi) {
		this.metode=metode;
		this.metodeBrojevi=metodeBrojevi;
	}
	
	public Response brojevi(Request request) {
		Response response=metodeBrojevi.metodeBrojevi(request);
		return response;
	}
}
