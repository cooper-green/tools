/**
 *
 * Filename:readStringWord.java
 * Author:koperz
 * Created at 2016年12月29日
 *
 */
package online.sanbao.tools;

public class readStringWord {
	private static int indexCount = 1;
	public static String readNextWord(String str,char delimiter){
		String word="";
		word = readStringWord.readWord(str, delimiter, indexCount);
		indexCount++;
		return word;
	}
	public static String readWord(String str,char delimiter,int index){
		String word=null;
		int count = 0;
		str+=' ';
		for(int i=0,j = 0;i<str.length();i++){
			if(str.charAt(i)==delimiter){
				count++;
				if(count==index){
					word = str.substring(j,i);
					break;
				}
				else {
					j = i+1;
				}
			}
		}
		if(word == null)P.rintError("index exceeds the total number of words in str, plz try to select a smaller index.");
		return word;
	}
	
}
