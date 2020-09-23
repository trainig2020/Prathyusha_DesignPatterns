package com.prathyusha.test;

import com.prathyusha.model.Internet;
import com.prathyusha.model.ProxyInternet;
import com.prathyusha.model.RealInternet;

public class TestProxyPattern {
	
	 public static void main (String[] args) 
	    { 
	        Internet internet = new RealInternet(); 
	        try
	        { 
	            internet.connectTo("geeksforgeeks.org"); 
	            internet.connectTo("abc.com"); 
	        } 
	        catch (Exception e) 
	        { 
	            System.out.println(e.getMessage()); 
	        } 
	    } 

}
