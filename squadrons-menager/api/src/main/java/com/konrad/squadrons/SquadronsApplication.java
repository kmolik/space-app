package com.konrad.squadrons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;


@SpringBootApplication
public class SquadronsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquadronsApplication.class, args);}
}
