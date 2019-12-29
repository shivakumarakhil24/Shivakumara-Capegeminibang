package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PatternConcept {
	static  Pattern pat;
	static  Matcher mat;
	
	
public static void main(String[] args) {
	
		/*
		 * pat=Pattern.compile("\\D+"); mat=pat.matcher(" hgghfuuyfygjhgugytgv");
		 * System.out.println("For pattern \\d:"+mat.matches());
		 *
		 * 
		 */

		/*
		 * //Digits--------->d pat=Pattern.compile("\\d{10}");
		 * mat=pat.matcher("2121212121");
		 * System.out.println("For pattern \\d:"+mat.matches());
		 * 
		 * 
		 * pat=Pattern.compile("\\d{1,9}"); mat=pat.matcher("727");
		 * System.out.println("For pattern \\d:"+mat.matches());
		 * 
		 * 
		 * 
		 * pat=Pattern.compile("\\d+"); mat=pat.matcher(" hgghfuuyfygjhgugytgv");
		 * System.out.println("For pattern \\d:"+mat.matches());
		 * 
		 */
		 
		/*
		 * //Except digit----->D pat=Pattern.compile("\\D{10}");
		 * mat=pat.matcher("juytrewqas");
		 * System.out.println("For pattern \\d:"+mat.matches());
		 * 
		 * 
		 * pat=Pattern.compile("\\D{1,9}"); mat=pat.matcher("gcgcgcgcg");
		 * System.out.println("For pattern \\d:"+mat.matches());
		 */
			  //single Space ---->s
			  pat=Pattern.compile("\\s"); 
			  mat=pat.matcher(" ");
			  System.out.println("For pattern \\d:"+mat.matches());
			  
			  pat=Pattern.compile("\\S"); 
			  mat=pat.matcher("s");
			  System.out.println("For pattern \\d:"+mat.matches());
			 
	
		/*
		 * pat=Pattern.compile("\\w+"); mat=pat.matcher("shiva");
		 * System.out.println("For pattern \\d:"+mat.matches());
		 * 
		 * 
		 * 
		 */
	
	
	
	
}
}
