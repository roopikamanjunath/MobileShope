package com.cg.mobshop.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.mobshop.dto.Mobiles;

public class Util {

	private static Map<Integer,Mobiles> mobileEntries=new HashMap<Integer,Mobiles>();
	
	static{
		mobileEntries.put(101, new Mobiles("101","Sony xperia","12000","12"));
		mobileEntries.put(102, new Mobiles("102","Samsung Note","10000","4"));
		mobileEntries.put(103, new Mobiles("103","Iphone 3","23000","2"));
		mobileEntries.put(104, new Mobiles("104","Nokia Note 2322","10000","8"));
	}
	
	public static Map<Integer,Mobiles> getMobileEntries(){
		return mobileEntries;
	}
}
