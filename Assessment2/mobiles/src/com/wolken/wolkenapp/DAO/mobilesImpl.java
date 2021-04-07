package com.wolken.wolkenapp.DAO;

import com.wolken.wolkenapp.DTO.mobileDTO;
import com.wolken.wolkenapp.Exception.mobileException;

public class mobilesImpl implements mobiles{
	public mobileDTO[] mobiledto;
	int i = 0;

	public mobilesImpl(int size) {
		mobiledto = new mobileDTO[size];
	}


	@Override
	public boolean add(mobileDTO dto) {
		// TODO Auto-generated method stub
		
			
			if(dto!=null) {
				this.mobiledto[i++]=dto;
					return true;				}
				else {
					return false;
				}
				
			}
	

	@Override
	public void getAll() throws mobileException {

		for (i = 0; i < this.mobiledto.length; i++) {
			if (this.mobiledto[i] != null) {
				System.out.println("mobile id" + mobiledto[i].getMblid() + "\n" + "mobile brand name"
						+ mobiledto[i].getBrandname() + "\n" + "mobile model name" + mobiledto[i].getModelname() + "\n"
						+ "number of camera in mobile" + mobiledto[i].getNoofcamera() + "\n" + "mobile price"
						+ mobiledto[i].getPrice() + "\n" + "mobile serial number" + mobiledto[i].getSerialno() + "\n"
						+ "mobile memory" + mobiledto[i].getMemory());
				System.out.println("\n");
			} else {
				mobileException exc = new mobileException();
				throw exc;
			}
		}

	}


	@Override
	public void updateBySerialNumber(String old,int price) {
		int check = 0;

		for (int i = 0; i < mobiledto.length; i++) {

			if (this.mobiledto != null) {
				if (this.mobiledto[i].getSerialno().equalsIgnoreCase(old)) {
					this.mobiledto[i].setPrice(price);
					check = 1;
					break;
				}
			}
		}
		if (check == 0)
			System.out.println("not found");

	}

	@Override
	public void deleteByMobileID(int mobileID) {
		for (int i = 0; i < mobiledto.length; i++) {
			if (mobiledto[i].getMblid() == mobileID) {
				mobiledto[i] = null;
				System.out.println("yes deleted");
				break;
			}
		}
	}

	@Override
	public void getAllByBrandName(String brandName) {
		for (int i = 0; i < mobiledto.length; i++) {
			if (mobiledto[i].getBrandname().equalsIgnoreCase(brandName)) {
				System.out.println("\n");
				System.out.println("MOBILE ID" + mobiledto[i].getMblid());
				System.out.println("MOBILE MODELNAME" + mobiledto[i].getModelname());
				System.out.println("NUMBER OF CAMERA" + mobiledto[i].getNoofcamera());
				System.out.println("PRICE OF MOBILE" + mobiledto[i].getPrice());
				System.out.println("MEMORY OF MOBILE" + mobiledto[i].getMemory());
				System.out.println("MOBILE BRAND NAME" + mobiledto[i].getBrandname());
				System.out.println("MOBILE SERIAL NUMBER" + mobiledto[i].getSerialno());

			}
		}
	}

}
