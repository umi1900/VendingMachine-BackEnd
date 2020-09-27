package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendingMachineApplication implements CommandLineRunner {

	@Autowired
	private SodaRepository srp;
	@Autowired
	private ReportRepository rrp;
	public static void main(String[] args) {
		SpringApplication.run(VendingMachineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		srp.save(new Soda("Pspsi",25));
		srp.save(new Soda("Water",25));
		srp.save(new Soda("Dew",25));
		srp.save(new Soda("Juice",25));
		srp.save(new Soda("Rani",25));
		srp.save(new Soda("Red Bull",25));


	}

}
