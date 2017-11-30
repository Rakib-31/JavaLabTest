package com.lab.first;

import java.util.*;
import java.lang.*;
import java.lang.reflect.*;
import java.util.Random;

import java.util.Scanner;

public class LabTestFirst {
	
	private int num;
	private Random random;
	private int ar[] = new int[12];
	
	public LabTestFirst()
	{
		random = new Random();
	    num = getRandomCard();
	}
	
	public int getRandomCard()
	{
		return random.nextInt(11);
	}
	
	public int randomNum()
	{
		int a = getRandomCard();
		ar[a]++;
		
		while(a < 2 || ar[a] > 4)
		{
			a = getRandomCard();
		}
		
		return a;
	}

}
