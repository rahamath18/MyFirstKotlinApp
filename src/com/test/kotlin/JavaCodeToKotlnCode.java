package com.test.kotlin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaCodeToKotlnCode {
	

	
	public static String space = "&nbsp;&nbsp;&nbsp;";
    public static String blue = "<font color=\"#0037b3\">fun</font>";
    public static String green = "<font color=\"#4ed297\">";
    public static String clsFont = "</font>";
    
	public static void main(String[] args) { 
		
		System.out.println("Java main method!");
	 
		int maxLen = 39;
		try {
			File aFile = new File("/Users/rahamathullahrahamathullah/Documents/workspace/MyFirstKotlinApp/src/com/test/kotlin/javacode.txt");
			String fileName = aFile.getName();
			FileReader fr = new FileReader(aFile);
			BufferedReader br = new BufferedReader(fr);
			int firstReminderCount = 0;
			int count = 0;
			String line = "";
			while(br.ready()) {
				line = br.readLine().trim();
				if(line.equals(""))
					continue;
				else {
					String s = addHTMLSpace(line, maxLen);// + " <br> <br>";
					String ss = s.substring(0, s.indexOf(" "));
					String sss = "<font color=\"#0037b3\">" + ss + "</font></font>";
					String val = "<font color=\"#0037b3\">" + "val" + "</font></font>";

					System.out.println(s.replace(ss, sss).replaceAll("val", val));
					
				}
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String addHTMLSpace(String line, int maxLen) {
		
		for (int i = line.length(); i <= maxLen; i++) {
			line = line + "&nbsp;";
		}
		return line;
	}

	public static void main1(String[] args) {

		byte p_b = 65;
		char p_c = 'a';
		short p_sh = 65;
		int p_i = 5;
		long p_l = 10L;
		float p_f = 3f;
		double p_d = 10.34;
		boolean p_bo = true;
		String p_s = "java2kotlin";
		
		Byte w_b = new Byte("65");
		Character w_c = new Character('a');
		Short w_sh = new Short("65");
		Integer w_i = new Integer(5);
		Long w_l = new Long(10L);
		Float w_f = new Float(3f);
		Double w_d = new Double(10.34);
		Boolean w_bo = new Boolean(true);
		String w_s = new String("java2kotlin");
		
		  
	}
	
	public String getName(Integer id) {
		return "Kotlin";
	}

}
