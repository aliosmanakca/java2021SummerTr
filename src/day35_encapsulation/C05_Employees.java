package day35_encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* TODO
Burada iki adet class vardır. Biri Main diğeri ise Employees,
Employees(Çalışanlar) class'ında;
Bu variable'ları oluşturunuz;
private String name,
private int salary,
private String dob (date of birth) (Doğum tarihi)
getter ve setter oluşturunuz.
Main class'ın içinde; kullanicidan name dob ve slary bilgilerini alip
Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.
Örnek:
Name is Fernando
dob is 11/23/2000
Salary is 80000
todo  ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
*/

public class C05_Employees {
	
	private String name;
	private int salary;
	private String dob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDob() {
		return dob; 
	} 
	public void setDob(String dob) { 
		this.dob = dob;  
	}
	
	public int yasHesapla(String s) { 
		 
		String strDate=s; //kullanicidan aldigimiz stringi burda kullanabilmek icin
		                  // onu bir stringe atiyoruz
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		LocalDate dTarih = LocalDate.parse(strDate,format); // kullanicinin string olarak girdigi tarihi normal tarihe ceviriyoruz
		
		LocalDate bugun = LocalDate.now(); 
		
		int age = bugun.getYear()-dTarih.getYear();
		
		return age;
	}
	
	
	

}
