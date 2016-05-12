package com.anuradha.stringTests;

public class assessment {

	//replaceAll function to replace a series of characters or a single character in a given string.
	public String replaceAll(String sourceStr, String oldStr, String newStr){
		String result ="";
		//Convert sourceStr and oldStr and determines the index of the oldStr in the sourceStr.
		int index = sourceStr.toLowerCase().indexOf(oldStr.toLowerCase());
		//if oldStr exists in sourceStr.If it does not then the value of index is -1.
		if (index != -1){
			//if there is a match then build the result in such a way that, result is concatenation of substring upto the matched index
			// newStr and remaining characters in the sourceStr
			for (int i=0; i < sourceStr.length(); i++) {
				if (i != index){
					result = result + sourceStr.charAt(i);
				} else {
					result = result + newStr;
					i = i+oldStr.length()-1;
				}
			}
			//Since there could be more than 1 oldStr in sourceStr, recursively call replaceAll.
			return this.replaceAll(result, oldStr, newStr);
		} else {
			return sourceStr;
		}
	}
	

}