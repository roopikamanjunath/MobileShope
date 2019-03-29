package com.cg.mobshop.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cg.mobshop.dao.MobileDAO;
import com.cg.mobshop.dao.MobileDAOImpl;
import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.exception.MobileException;
import com.cg.mobshop.util.Util;

	class SortByMobName implements Comparator<Mobiles> 
	{ 
		@Override
		public int compare(Mobiles a, Mobiles b) 
		{ 			
			return a.getName().compareTo(b.getName()); 
		} 
	}
	
	class SortByMobPrice implements Comparator<Mobiles> 
	{ 
		@Override
		public int compare(Mobiles a, Mobiles b) 
		{ 
			int a1,b1;
			a1=Integer.parseInt(a.getPrice());
			b1=Integer.parseInt(b.getPrice());
			return a1 - b1; 
		} 
	}
	
	class SortByMobId implements Comparator<Mobiles> 
	{ 
		@Override
		public int compare(Mobiles a, Mobiles b) 
		{ 
			int a1,b1;
			a1=Integer.parseInt(a.getMobileId());
			b1=Integer.parseInt(b.getMobileId());
			return a1 - b1;		
		} 
	}

public class MobileServiceImpl implements MobileService {

	
	
	MobileDAO mobDao=new MobileDAOImpl();
	@Override
	public List<Mobiles> getMobileList() throws MobileException {
		List<Mobiles> mobValues= new ArrayList<Mobiles>(mobDao.showAllMobiles().values());
		return mobValues;
	}

	@Override
	public Mobiles deleteMobile(int mobcode) {
		Mobiles mb=Util.getMobileEntries().get(mobcode);
		Util.getMobileEntries().remove(mobcode);
		return mb;
	}

	@Override
	public List<Mobiles> SortList(int criteria) throws MobileException {
		List<Mobiles> mobValues= new ArrayList<Mobiles>(mobDao.showAllMobiles().values());
		
		if(criteria==1)
			Collections.sort(mobValues,new SortByMobName());
		else if(criteria==2)
			Collections.sort(mobValues,new SortByMobPrice());
		else if(criteria==3)
			Collections.sort(mobValues,new SortByMobId());
		
		return mobValues;
	}
	
}
