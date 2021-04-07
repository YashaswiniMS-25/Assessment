package com.wolken.wolkenapp.DAO;

//import com.wolken.wolkenapp.dto;
import com.wolken.wolkenapp.DTO.mobileDTO;
import com.wolken.wolkenapp.Exception.mobileException;

public interface mobiles {
	

	//public mobiles(int size) {
		//mobiledto = new mobileDTO[size];
	//}

	public boolean add(mobileDTO dto);
//	
	public void getAll() throws mobileException;

	//public void updateBySerialNumber(String old,int price);
	

	public void deleteByMobileID(int mobileID) ;

	public void getAllByBrandName(String brandName) ;
	public void updateBySerialNumber(String newserial, int newprice);
	
}
