package by.epam.tr.main;

import java.util.Scanner;

public class PartThreeTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. Напишите программу, где пользователь вводит любое целое положительное число. А программа
		//суммирует все числа от 1 до введенного пользователем числа.
		
		int i= 1;
		int number = 7;
		int sum = 0;
		
		
		while (i <= number) {
		sum = sum + i;
			i++;
		}
		System.out.println("sum = " + sum);	
}}