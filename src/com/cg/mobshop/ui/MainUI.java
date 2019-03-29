package com.cg.mobshop.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.exception.MobileException;
import com.cg.mobshop.service.MobileService;
import com.cg.mobshop.service.MobileServiceImpl;

public class MainUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileService service=new MobileServiceImpl();
		int choice=0;
		try(Scanner sc = new Scanner(System.in)){
			do{
				System.out.println("Welcome to Mobile Shopee.\n");
				System.out.println("Present record: ");
				try {
					System.out.println(service.getMobileList());
				} catch (MobileException e4) {
					// TODO Auto-generated catch block
					e4.printStackTrace();
				}
				System.out.println();
				System.out.println("Enter your choice: ");
				System.out.println("1. Sorting.");
				System.out.println("2. Delete");
				System.out.println("3. Exit.");
				choice=sc.nextInt();
				switch(choice){
				case 1:	System.out.println("Please choose sorting criteria: ");
						System.out.println("1. Mobile Name.");
						System.out.println("2. Mobile Price.");
						System.out.println("3. Mobile Id.");
						int ch=sc.nextInt();
						switch(ch){
						case 1: List<Mobiles> mobValues=new ArrayList<Mobiles>();
							try {
								mobValues = service.SortList(ch);
							} catch (MobileException e3) {
								// TODO Auto-generated catch block
								e3.printStackTrace();
							}
								System.out.println(mobValues);
								break;
								
						case 2: List<Mobiles> mobValues1=new ArrayList<Mobiles>();
							try {
								mobValues1 = service.SortList(ch);
							} catch (MobileException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
								System.out.println(mobValues1);
								break;
								
						case 3: List<Mobiles> mobValues2=new ArrayList<Mobiles>();
							try {
								mobValues2 = service.SortList(ch);
							} catch (MobileException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
								System.out.println(mobValues2);
								break;
								
						default: System.out.println("Invalid choice.");
						}
						break;
						
				case 2: System.out.println("Enter a valid Mobile ID to delete record.");
						int mobcode=sc.nextInt();
						Mobiles mb=service.deleteMobile(mobcode);
						System.out.println(mb.getMobileId()+" mobile record deleted.\n");
					try {
						System.out.println(service.getMobileList());
					} catch (MobileException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						break;
						
				case 3: System.exit(0);
				
				default: System.out.println("Invalid choice.");
				}
				System.out.println("do you want to continue 1-yes 0-no");
				choice = sc.nextInt();
			}while(choice!=0);
		}
	}

}
