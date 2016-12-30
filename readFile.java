/**
 * 
 * Filename:readFile.java
 * Author: koperz
 * Created at 2016年12月28日
 * 
 */
package online.sanbao.tools;

import java.io.*;

public class readFile {
	public static void readTxt(String filePath) {
	 try {
		    File file = new File(filePath);
		    if(file.isFile() && file.exists()) {
		      InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
		      BufferedReader br = new BufferedReader(isr);
		      String lineTxt = null;
		      while ((lineTxt = br.readLine()) != null) {
		        System.out.println(lineTxt);
		      }
		      br.close();
		    } else {
		      System.out.println("文件不存在!");
		    }
		  } catch (Exception e) {
		    System.out.println("文件读取错误!");
		  }
		 
	}
	public static String readLine(String filePath,int rowNum){
		String lineTxt = null; 
		File file = new File(filePath);
		try{		    
			    if(file.isFile() && file.exists()) {
			      InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
			      BufferedReader br = new BufferedReader(isr);			      
			      for(int i = 0;i<rowNum;i++){
			    	  lineTxt = br.readLine();
			    	  if (lineTxt == null)break; 
			      }
			      br.close();			    	  
			    } else {
			      System.out.println("文件不存在!");
			    }
			  } catch (Exception e) {
			    System.out.println("文件读取错误!");
			  }
		return lineTxt;
			 
		}	
	public static String readAll(String filePath) {
		String lineTxt = null; 
		String Txt ="";
		File file = new File(filePath);
		try {
			    
			    if(file.isFile() && file.exists()) {
			      InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
			      BufferedReader br = new BufferedReader(isr);		     
			      while ((lineTxt = br.readLine()) != null) {
			        Txt += lineTxt;
			      }
			      br.close();
			    } else {
			      System.out.println("文件不存在!");
			    }
			  } catch (Exception e) {
			    System.out.println("文件读取错误!");
			  }
		return Txt;
			 
	}
	public static String readWord(String filePath) {
		String lineTxt = null; 
		String Txt ="";
		File file = new File(filePath);
		try {
			    
			    if(file.isFile() && file.exists()) {
			      InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
			      BufferedReader br = new BufferedReader(isr);		     
			      while ((lineTxt = br.readLine()) != null) {
			        Txt += lineTxt;
			      }
			      br.close();
			    } else {
			      System.out.println("文件不存在!");
			    }
			  } catch (Exception e) {
			    System.out.println("文件读取错误!");
			  }
		return Txt;
			 
	}
}
