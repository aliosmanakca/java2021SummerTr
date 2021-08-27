package day35_encapsulation;


import java.util.Scanner;

public class C06_Employees_Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("adinizi girin: ");
		String name = scan.nextLine();
		
		System.out.println("dogum tarihini dd.MM.yyyy girin: ");
		String dob = scan.nextLine();
		
		System.out.println("maas girin: ");
		int salary = scan.nextInt(); 
		
		C05_Employees calisan = new C05_Employees();
		
		calisan.setDob(dob);
		calisan.setName(name);
		calisan.setSalary(salary);
		
		int calisanYas = calisan.yasHesapla(dob); 
		
		 if (calisanYas>18) {
			 System.out.println("welcome "+name+" your salary is "+salary);
		 }else if (calisanYas<18) {
			 System.out.println("come back later "+name);
		 }
		 else if (calisanYas==18) {
			 System.out.println("okay "+name);
		 }

		 scan.close();
		 }
	
       

}
