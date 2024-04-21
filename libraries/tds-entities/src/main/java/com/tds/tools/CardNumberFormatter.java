package com.tds.tools;

public class CardNumberFormatter {

	public static String hideCardNumber(String cardNumber) {
	    return cardNumber == null ? "" : hideString(cardNumber, 6, cardNumber.length() - 4, '*');
	  }
	
	public static String hideString(String strText, int start, int end, char maskChar) {

	    if (StringTools.isEmpty(strText))
	      return "";

	    int startIn = start;
	    int endIn = end;
	    if (startIn < 0)
	      startIn = 0;

	    if (endIn > strText.length())
	      endIn = strText.length();

	    if (startIn > endIn)
	      return strText;
	    
	    int maskLength = endIn - startIn;
	    if (maskLength == 0)
	      return strText;

	    StringBuilder sbMaskString = new StringBuilder(maskLength);
	    for (int i = 0; i < maskLength; i++)
	      sbMaskString.append(maskChar);
	    
	    return strText.substring(0, startIn) + sbMaskString.toString()
	        + strText.substring(startIn + maskLength);
	  }
}
