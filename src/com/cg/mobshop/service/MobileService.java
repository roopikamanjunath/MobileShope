package com.cg.mobshop.service;

import java.util.List;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.exception.MobileException;

public interface MobileService {
	public List<Mobiles> getMobileList() throws MobileException;
	public Mobiles deleteMobile(int mobcode);
	public List<Mobiles> SortList(int criteria) throws MobileException;
}
