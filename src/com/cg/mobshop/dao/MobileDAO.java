package com.cg.mobshop.dao;

import java.util.Map;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.exception.MobileException;

public interface MobileDAO {
	public Map<Integer,Mobiles> showAllMobiles() throws MobileException;
}
