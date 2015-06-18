package CScoreCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CScoreCode {
    //private static String _warn_ ="W";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		//Map<String, Double> results = Calculate_All_Dryer_info.Calculate_All_Dryer_info("4766_I", "12", "D", "GE", "IW","NOT COMPLETING CYCLE");
		Map<String, Double> results = Calculate_All_Dryer_info.Calculate_All_Dryer_infomation("4766_E", "20", "1", "SEARS","IW", "NOT HEATING NOT TURNING");
		double max = Collections.max(results.values());
		Set<String> keys = new HashSet<String>();
	      
        for(Map.Entry entry: results.entrySet()){
            if(entry.getValue().equals(max)){
                keys.add((String) entry.getKey()); //no break, looping entire hashtable
            }
        }
        
        long endTime   = System.currentTimeMillis();
       	long totalTime = endTime - startTime;
    	System.out.println("\n"+totalTime);

    	System.out.print("value is  " + max); 
    	System.out.print("\n\n  key(s)  " + keys); 
    	
 
		//String maxkey = results.
		double Vvalue = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_E", "3", "W", "BOSCH", "NOT DRAINING THE CLOTHES");
		System.out.print("\n \n value is  " + Vvalue); 
		/*double Vvalue1 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "1", "1", "KENMORE", "DRYER DRUM NOT TURNING MAKING HUMMING NOISE");
		System.out.print("\n value is  " + Vvalue1); 
		double Vvalue2 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_I", "12", "D", "GE", "NOT COMPLETING CYCLE");
		System.out.print("\n value is  " + Vvalue2); 
		double Vvalue3 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "1", "1", "KENMORE", "RATTLING NOISE");
		System.out.print("\n value is  " + Vvalue3); 
		double Vvalue4 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_I", "12", "1", "KENMORE", "DRYER KEEPS SHUTTING");
		System.out.print("\n value is  " + Vvalue4); 
		double value5 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("7385_S", "3", "D", "LG", "CRACK IN DOOR");
		System.out.print("\n\n value is  " + value5); 
		double value6 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "8", "_", "KENMORE", "DCS TOO WET, OR NOT SHUTTING OFF");
		System.out.print("\n value is  " + value6); 
		double value7 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "1", "1", "KENMORE", "NOT WORKING");
		System.out.print("\n value is  " + value7); 
		double value8 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "5", "1", "KENMORE", "NOISY");
		System.out.print("\n value is  " + value8); 
		double value9 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_K", "12", "1", "KENMORE", "NOT HEATING");
		System.out.print("\n value is  " + value9); 
		//
		double value10 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_I", "3", "7", "KENMORE", "LINT FILTER IS BROKEN");
		System.out.print("\n\n value is  " + value10); 
		double value11 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "8", "1", "KENMORE", "LOUD NOISE/ RATTLING");
		System.out.print("\n value is  " + value11); 
		double value12 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_I", "5", "_", "KENMORE", "ONLY WORKS ON ONE SETTING");
		System.out.print("\n value is  " + value12); 
		double value13 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "3", "M", "MAYTAG", "POP NOISE / LONGER DRY TIMES");
		System.out.print("\n value is  " + value13); 
		double value14 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_J", "3", "7", "KENMORE", "SERVICE AS NEEDED");
		System.out.print("\n value is  " + value14); 
		double value15 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_I", "12", "1", "KENMORE", "NOT DRYING");
		System.out.print("\n\n value is  " + value15); 
		double value16 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "3", "D", "SAMSUNG", "NOT HEATING");
		System.out.print("\n value is  " + value16); 
		double value17 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_E", "20", "1", "SEARS", "NOT HEATING NOT TURNING");
		System.out.print("\n value is  " + value17); 
		double value18 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_J", "1", "W", "WHIRLPOOL", "NOT ADJUSTING TEMPATURE");
		System.out.print("\n value is  " + value18); 
		double value19 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "1", "1", "KENMORE", "SERVICE");
		System.out.print("\n value is  " + value19); 
		//
		double value20 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_E", "1", "1", "KENMORE", "MAKING GRINDING/BANGING NOISES");
		System.out.print("\n\n value is  " + value20); 
		double value21 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "8", "1", "KENMORE", "NOT STARTING");
		System.out.print("\n value is  " + value21); 
		double value22 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "3", "W", "BOSCH", "NOT HEATING                           DED   $0.00  APV $500.00");
		System.out.print("\n value is  " + value22); 
		double value23 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_E", "12", "1", "KENMORE", "NOT HEATING PROPERLY");
		System.out.print("\n value is  " + value23); 
		double value24 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_I", "8", "1", "KENMORE", "DRYER RUNS (DRUM ROTATES) BUT THERE IS NO HEAT");
		System.out.print("\n value is  " + value24); 
		double value25 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_G", "12", "4", "KENMORE", "MAKING A CLANGING NOISE TEARING CLOTHS");
		System.out.print("\n\n value is  " + value25); 
		double value26 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "3", "_", "GE", "HUMMING,WILL NOT START");
		System.out.print("\n value is  " + value26); 
		double value27 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "3", "D", "LG", "DRUM CONTINUES TO SPIN IF DOOR IS CLODED   $0.00  APV $500.00");
		System.out.print("\n value is  " + value27); 
		double value28 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_I", "12", "1", "WHIRLPOOL", "GASKET INSIDE DRUM IS HANGING LOOSE");
		System.out.print("\n value is  " + value28); 
		double value29 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "1", "1", "KENMORE", "NOT TURNING");
		System.out.print("\n value is  " + value29); 
	
	    //
		double value30 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_I", "2", "1", "KENMORE", "NOT DRYING PROPERLY");
		System.out.print("\n\n value is  " + value30); 
		double value31 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_E", "12", "1", "KENMORE", "DRYER IS NOT HEATING                      DED   $0.00  APV $500.00");
		System.out.print("\n value is  " + value31); 
		double value32 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_K", "2", "7", "KENMORE", "NOT WORKING");
		System.out.print("\n value is  " + value32); 
		double value33 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "3", "D", "SAMSUNG", "LIGHT SOCKET FELL DOWN INSIDE DRYER.NOT DRYING TOO GOOD...");
		System.out.print("\n value is  " + value33); 
		double value34 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_E", "3", "_", "ELECTROLUX", "DCS ERROR CALL FOR SERVICE");
		System.out.print("\n value is  " + value34); 
		double value35 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_L", "3", "1", "KENMORE", "HEAT");
		System.out.print("\n\n value is  " + value35); 
		double value36 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "3", "D", "SAMSUNG", "MAKING A LOUD NOISE WHEN SPINNING         DED   $0.00  APV $500.0");
		System.out.print("\n value is  " + value36); 
		double value37 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_C", "8", "1", "KENMORE", "NDCS, ERROR CODE PF");
		System.out.print("\n value is  " + value37); 
		double value38 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "12", "1", "KENMORE", "IS MAKING ODD NOISES HIGH PITCH           DED   $0.00  APV $500.00");
		System.out.print("\n value is  " + value38); 
		double value39 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "1", "1", "KENMORE", "NDCS - NOT SPINNING");
		System.out.print("\n value is  " + value39); 
		//
        double value40 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_E", "5", "1", "KENMORE", "WILL NOT SHUT OFF TIMER GETS STUCK AT 14 MIN");
		System.out.print("\n\n value is  " + value40); 
		double value41 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "8", "1", "KENMORE", "NOT");
		System.out.print("\n value is  " + value41); 
		double value42 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "19", "D", "GE", "MAKING NOISE CLOTHES NOT DRYING");
		System.out.print("\n value is  " + value42); 
		double value43 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "12", "1", "KENMORE", "DRYER QUIT WRKING, NO HEAT           DED   $0.00  APV $500.00");
		System.out.print("\n value is  " + value43); 
		double value44 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "20", "1", "KENMORE", "DCS LIGHTS AND POWER JUST NOT TURNING ON");
		System.out.print("\n value is  " + value44); 
		double value45 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "12", "1", "KENMORE", "E1 CODE");
		System.out.print("\n\n value is  " + value45); 
		double value46 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_E", "3", "D", "GE", " NOT HEATING");
		System.out.print("\n value is  " + value46); 
		double value47 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("4766_G", "2", "1", "KENMORE", " NO HEAT AT ALL");
		System.out.print("\n value is  " + value47); 
		double value48 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "12", "1", "KENMORE", "NOT HEATING CUST DID NOT KNOW IF SHE HAD A GAS ");//OR ELECTRIC DRYR");
		System.out.print("\n value is  " + value48); 
		double value49 = Calculate_35720_Dryer_Info.Calculate_35720_Dryer("9663_A", "8", "M", "MAYTAG", "SWITCH IS NOT WORKING DED $0.00 APV $500.00");
		System.out.print("\n value is  " + value49);
		//Calculate_37130_Dryer(String G_IRU,String G_ITM_AGE2,String G_MDL_NO,String G_MFG_BND_NM,String Word_Bank)
		*/
		
	}


	
}
