package com.hanwha.view;

import java.util.List;

import com.hanwha.model.DeptDTO;
import com.hanwha.model.EmpVO;

//view : display  (JSP ¿ªÇÒ)
public class EmpView {
	public static void print(List <EmpVO> emplist) {
		System.out.println("========= emp view all =========");
		for (EmpVO emp : emplist) {
			System.out.println(emp);
		}
	}
	
	public static void print(EmpVO emp) {
		System.out.println(emp);
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
}
