package com.hanwha.view;

import java.util.List;

import com.hanwha.model.DeptDTO;

//view : display  (JSP ¿ªÇÒ)
public class DeptView {
	public static void print(List <DeptDTO> deptList) {
		System.out.println("========= view all =========");
		for (DeptDTO dept : deptList) {
			System.out.println(dept);
		}
	}
	
	public static void print(DeptDTO dept) {
		System.out.println(dept);
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
}
