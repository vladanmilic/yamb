package com.comtrade.yamb.player.igracGrupa1;

import com.comtrade.yamb.Field;
import com.comtrade.yamb.Request;

public class Konstrakte {
	static Request request;
	public static final int PRVO_BACANJE=1;
	public static final int DRUGO_BACANJE=2;
	public static final int TRECE_BACANJE=3;

	//TOP_DOWN
	public static final Field KEC_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(0);
	public static final Field DVOJKA_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(1);
	public static final Field TROJKA_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(2);
	public static final Field CETVORKA_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(3);
	public static final Field PETICA_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(4);
	public static final Field SESTICA_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(5);
	public static final Field SUM_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(6);
	public static final Field MAX_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(7);
	public static final Field MIN_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(8);
	public static final Field PRODUCT_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(9);
	public static final Field KENTA_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(10);
	public static final Field TRILLING_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(11);
	public static final Field FULL_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(12);
	public static final Field POKER_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(13);
	public static final Field YAMB_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(14);
	public static final Field SUBTOTAL_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(15);
	public static final Field TOTAL_TOP_DOWN=request.getBoard().getColumns()[0].getFields().get(16);
	
	//FREE
	public static final Field KEC_FREE=request.getBoard().getColumns()[1].getFields().get(0);
	public static final Field DVOJKA_FREE=request.getBoard().getColumns()[1].getFields().get(1);
	public static final Field TROJKA_FREE=request.getBoard().getColumns()[1].getFields().get(2);
	public static final Field CETVORKA_FREE=request.getBoard().getColumns()[1].getFields().get(3);
	public static final Field PETICA_FREE=request.getBoard().getColumns()[1].getFields().get(4);
	public static final Field SESTICA_FREE=request.getBoard().getColumns()[1].getFields().get(5);
	public static final Field SUM_FREE=request.getBoard().getColumns()[1].getFields().get(6);
	public static final Field MAX_FREE=request.getBoard().getColumns()[1].getFields().get(7);
	public static final Field MIN_FREE=request.getBoard().getColumns()[1].getFields().get(8);
	public static final Field PRODUCT_FREE=request.getBoard().getColumns()[1].getFields().get(9);
	public static final Field KENTA_FREE=request.getBoard().getColumns()[1].getFields().get(10);
	public static final Field TRILLING_FREE=request.getBoard().getColumns()[1].getFields().get(11);
	public static final Field FULL_FREE=request.getBoard().getColumns()[1].getFields().get(12);
	public static final Field POKER_FREE=request.getBoard().getColumns()[1].getFields().get(13);
	public static final Field YAMB_FREE=request.getBoard().getColumns()[1].getFields().get(14);
	public static final Field SUBTOTAL_FREE=request.getBoard().getColumns()[1].getFields().get(15);
	public static final Field TOTAL_FREE=request.getBoard().getColumns()[1].getFields().get(16);
	
	//BOTTOM_UP
	public static final Field KEC_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(0);
	public static final Field DVOJKA_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(1);
	public static final Field TROJKA_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(2);
	public static final Field CETVORKA_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(3);
	public static final Field PETICA_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(4);
	public static final Field SESTICA_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(5);
	public static final Field SUM_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(6);
	public static final Field MAX_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(7);
	public static final Field MIN_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(8);
	public static final Field PRODUCT_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(9);
	public static final Field KENTA_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(10);
	public static final Field TRILLING_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(11);
	public static final Field FULL_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(12);
	public static final Field POKER_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(13);
	public static final Field YAMB_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(14);
	public static final Field SUBTOTAL_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(15);
	public static final Field TOTAL_BOTTOM_UP=request.getBoard().getColumns()[2].getFields().get(16);
	
	//FROM_MIDDLEPOINT;
	public static final Field KEC_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(0);
	public static final Field DVOJKA_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(1);
	public static final Field TROJKA_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(2);
	public static final Field CETVORKA_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(3);
	public static final Field PETICA_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(4);
	public static final Field SESTICA_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(5);
	public static final Field SUM_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(6);
	public static final Field MAX_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(7);
	public static final Field MIN_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(8);
	public static final Field PRODUCT_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(9);
	public static final Field KENTA_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(10);
	public static final Field TRILLING_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(11);
	public static final Field FULL_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(12);
	public static final Field POKER_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(13);
	public static final Field YAMB_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(14);
	public static final Field SUBTOTAL_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(15);
	public static final Field TOTAL_FROM_MIDDLEPOINT=request.getBoard().getColumns()[3].getFields().get(16);
	
	//FROM_ENDPOINT
	public static final Field KEC_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(0);
	public static final Field DVOJKA_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(1);
	public static final Field TROJKA_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(2);
	public static final Field CETVORKA_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(3);
	public static final Field PETICA_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(4);
	public static final Field SESTICA_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(5);
	public static final Field SUM_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(6);
	public static final Field MAX_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(7);
	public static final Field MIN_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(8);
	public static final Field PRODUCT_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(9);
	public static final Field KENTA_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(10);
	public static final Field TRILLING_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(11);
	public static final Field FULL_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(12);
	public static final Field POKER_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(13);
	public static final Field YAMB_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(14);
	public static final Field SUBTOTAL_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(15);
	public static final Field TOTAL_FROM_ENDPOINT=request.getBoard().getColumns()[4].getFields().get(16);
	
	//NAJAVA
	public static final Field KEC_NAJAVA=request.getBoard().getColumns()[5].getFields().get(0);
	public static final Field DVOJKA_NAJAVA=request.getBoard().getColumns()[5].getFields().get(1);
	public static final Field TROJKA_NAJAVA=request.getBoard().getColumns()[5].getFields().get(2);
	public static final Field CETVORKA_NAJAVA=request.getBoard().getColumns()[5].getFields().get(3);
	public static final Field PETICA_NAJAVA=request.getBoard().getColumns()[5].getFields().get(4);
	public static final Field SESTICA_NAJAVA=request.getBoard().getColumns()[5].getFields().get(5);
	public static final Field SUM_NAJAVA=request.getBoard().getColumns()[5].getFields().get(6);
	public static final Field MAX_NAJAVA=request.getBoard().getColumns()[5].getFields().get(7);
	public static final Field MIN_NAJAVA=request.getBoard().getColumns()[5].getFields().get(8);
	public static final Field PRODUCT_NAJAVA=request.getBoard().getColumns()[5].getFields().get(9);
	public static final Field KENTA_NAJAVA=request.getBoard().getColumns()[5].getFields().get(10);
	public static final Field TRILLING_NAJAVA=request.getBoard().getColumns()[5].getFields().get(11);
	public static final Field FULL_NAJAVA=request.getBoard().getColumns()[5].getFields().get(12);
	public static final Field POKER_NAJAVA=request.getBoard().getColumns()[5].getFields().get(13);
	public static final Field YAMB_NAJAVA=request.getBoard().getColumns()[5].getFields().get(14);
	public static final Field SUBTOTAL_NAJAVA=request.getBoard().getColumns()[5].getFields().get(15);
	public static final Field TOTAL_NAJAVA=request.getBoard().getColumns()[5].getFields().get(16);
	
	//RUCNA
	public static final Field KEC_RUCNA=request.getBoard().getColumns()[6].getFields().get(0);
	public static final Field DVOJKA_RUCNA=request.getBoard().getColumns()[6].getFields().get(1);
	public static final Field TROJKA_RUCNA=request.getBoard().getColumns()[6].getFields().get(2);
	public static final Field CETVORKA_RUCNA=request.getBoard().getColumns()[6].getFields().get(3);
	public static final Field PETICA_RUCNA=request.getBoard().getColumns()[6].getFields().get(4);
	public static final Field SESTICA_RUCNA=request.getBoard().getColumns()[6].getFields().get(5);
	public static final Field SUM_RUCNA=request.getBoard().getColumns()[6].getFields().get(6);
	public static final Field MAX_RUCNA=request.getBoard().getColumns()[6].getFields().get(7);
	public static final Field MIN_RUCNA=request.getBoard().getColumns()[6].getFields().get(8);
	public static final Field PRODUCT_RUCNA=request.getBoard().getColumns()[6].getFields().get(9);
	public static final Field KENTA_RUCNA=request.getBoard().getColumns()[6].getFields().get(10);
	public static final Field TRILLING_RUCNA=request.getBoard().getColumns()[6].getFields().get(11);
	public static final Field FULL_RUCNA=request.getBoard().getColumns()[6].getFields().get(12);
	public static final Field POKER_RUCNA=request.getBoard().getColumns()[6].getFields().get(13);
	public static final Field YAMB_RUCNA=request.getBoard().getColumns()[6].getFields().get(14);
	public static final Field SUBTOTAL_RUCNA=request.getBoard().getColumns()[6].getFields().get(15);
	public static final Field TOTAL_RUCNA=request.getBoard().getColumns()[6].getFields().get(16);
}
