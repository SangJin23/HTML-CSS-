package com.sangjin.demo;

import java.util.Scanner;

import com.sangjin.demo.controller.MainController;


// com.jihoon.demo 프로젝트의 실제 실행 클래스
public class MainApplication {
	
	private static com.sangjin.demo.controler.MainController mainController;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		ObjectRepository objectRepository = new ObjectRepository(input);
		ObjectRepository objectRepository2 = new ObjectRepository2();
		MainService mainService =null;
		
		if(input <= 0 ) mainService = new MainService(objectRepository2);
		else mainService = new MainService(objectRepository);
			
		
		mainController = new MainController(mainService);
		mainController.printDatas();
	}

}