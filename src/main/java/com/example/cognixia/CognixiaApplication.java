package com.example.cognixia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CognixiaApplication {
  int test = 1;
  public String notUsed = "cognixia";
  
	public static void main(String[] args) {
		System.out.println("Hello World from Web Hook");
		SpringApplication.run(CognixiaApplication.class, args);
	}

}
