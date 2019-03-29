package com.cg.mobshop.dao;

import java.util.Map;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.exception.MobileException;
import com.cg.mobshop.util.Util;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public Map<Integer, Mobiles> showAllMobiles() throws MobileException{
		Map<Integer,Mobiles> map=Util.getMobileEntries();
		if(map.size()==0)
			throw new MobileException("Mobile data is empty.");
		else
			return map;
	}

}
