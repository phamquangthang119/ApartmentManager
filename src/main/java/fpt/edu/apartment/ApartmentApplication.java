package fpt.edu.apartment;

import fpt.edu.apartment.entity.*;
import fpt.edu.apartment.enums.EnumActive;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApartmentApplication{
	public static void main(String[] args) {
//		Contract p = new Contract();
//		p.setBaseWage(Float.parseFloat("50"));
//		p.setCurrencyUnit("VND");
//		p.setJobType("DBO");
//		p.setWorkingHours(Float.parseFloat("20"));
////		p.setDepartment(p.getDepartment());
//		p.setStatus(EnumActive.ACTIVE);
//		System.out.println(p.getBaseWage());
//		System.out.println(p.getCurrencyUnit());
//		System.out.println(p.getJobType());
//		System.out.println(p.getWorkingHours());
//		System.out.println(EnumActive.ACTIVE);
		SpringApplication.run(ApartmentApplication.class, args);
	}

}

