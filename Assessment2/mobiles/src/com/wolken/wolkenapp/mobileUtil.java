package com.wolken.wolkenapp;

//import java.util.InputMismatchException;
import java.util.Scanner;


import com.wolken.wolkenapp.DTO.mobileDTO;
import com.wolken.wolkenapp.Exception.mobileException;
//import com.wolken.wolkenapp.mobiles.mobileSub;
//import com.wolken.wolkenapp.mobiles.mobileSuper;
import com.wolken.wolkenapp.DAO.mobiles;
import com.wolken.wolkenapp.DAO.mobilesImpl;

public class mobileUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size");
		
		try {
		int size=scan.nextInt();
		//mobiles mobile=new mobiles(size);
		mobiles mb=new mobilesImpl(size);
	
		
		for(int i=0;i<size;i++) {
			mobileDTO dto=new mobileDTO();
			
			System.out.println("enter the mobile name");
			dto.setBrandname(scan.next());
			System.out.println("enter mobile model name");
			dto.setModelname(scan.next());
			System.out.println("enter the mobile id");
			dto.setMblid(scan.nextInt());
			System.out.println("enter the mobileserialnumber");
			dto.setSerialno(scan.next());
			
			
			System.out.println("enter the mobile price");
			dto.setPrice(scan.nextInt());
			System.out.println("enter the mobile number of camera");
			dto.setNoofcamera(scan.nextInt());
			System.out.println("enter the mobile memory");
			dto.setMemory(scan.nextDouble());
			
			if(mb.add(dto)) {
				System.out.println("added");
			}
			else {
				System.out.println("failed");
			}
			
		}
		mb.getAll();
		
		System.out.println("enter the serial number to be updated and new one");
		System.out.println("Serial number to be updated");
		
		String newserial=scan.next();
		System.out.println("enter the new price");
		int newprice=scan.nextInt();
		mb.updateBySerialNumber(newserial,newprice);
		System.out.println("UPDATED DATA");
		mb.getAll();
		
		System.out.println("enter the mobile brand name to fetch");
		String brandname=scan.next();
		mb.getAllByBrandName(brandname);
		
		
		
		
		
		
		System.out.println("enter the mblid tobe deleted");
		int mblid=scan.nextInt();
		mb.deleteByMobileID(mblid);
		
		System.out.println("getall function is called");
		try {
		mb.getAll();
		}catch(mobileException e) {
			System.out.println("exception!!");
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		catch(Exception e) {
			System.out.println("only integer is allowed ");
			
		}
		
		
		
		
		
		
//		mobile ID brand name model name serial number price no of camera memory
//		Implements the below 
		//mobileDTO dto1=new mobileDTO();
		
		
		
		
	
		
		//mobiles mobile1 =new mobiles();
		
		
		
		

	}

}
