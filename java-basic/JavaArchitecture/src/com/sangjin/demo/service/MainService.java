package com.sangjin.demo.service;

import com.sangjin.demo.repository.ObjectRepository2;
import com.sangjin.demo.repository.Repository;
import com.sangjin.demo.repository.ObjectRepository;

// com.jihoon.demo 프로젝트의 실제 비즈니스 로직을 담당하는 클래스
public class MainService {

	private Repository repository;
//	private ObjectRepository objectRepository = new ObjectRepository(1);
//	private ObjectRepository2 objectRepository2 = new ObjectRepository2();

	public MainService (Repository repository) {
		this.repository = repository;
	}
	
	public void printDatas() {
		int[] datas = repository.getDatas();
		for (int data : datas) System.out.println(data);
	}
	
//	public void printDatas2() {
//	int[] datas = repository.getDatas();
//	for (int data : datas) System.out.println(data);
//	}

}