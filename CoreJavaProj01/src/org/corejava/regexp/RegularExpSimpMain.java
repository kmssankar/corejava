package org.corejava.regexp;

public class RegularExpSimpMain {

	public static void main(String[] args) {
		String Str1 = "NRM1-DE3423-12000";
		String Str2 = "FST-DE1233-120000";	
		String phytst = "123FED12-1234TMNA";
		String phytst1 = "123RED12-1234TMNA";
		System.out.println("Matches " + phytst.matches("[0-9]{3}(DER|FED){1}\\d{2}-(\\d){4}[A-Z]{4}"));
		System.out.println("Matches " + phytst1.matches("[0-9]{3}(DER|FED){1}\\d{2}-(\\d){4}[A-Z]{4}"));
		System.out.println(" Matches : -> "+Str1 + " "+ Str1.matches("(FST|NRM){1}-[A-Z]{2}\\d+-\\d+"));
		System.out.println(" Matches : -> \"FST-DE1233-120000\" " + "FST-DE1233-120000".matches("(FST|NRM){1}-[A-Z]{2}\\d+-\\d+"));
		System.out.println(" Matches : -> \"tst-DE1233-120000\" " + "tst-DE1233-120000".matches("(FST|NRM){1}-[A-Z]{2}\\d+-\\d+"));
		System.out.println(" Matches : -> \"tst-DE1233-TS0000\" " + "tst-DE1233-120000".matches("(FST|NRM){1}-[A-Z]{2}\\d+-\\d+"));	
	}
}

/*
 Matches true
 Matches false
 Matches : -> NRM1-DE3423-12000 false
 Matches : -> "FST-DE1233-120000" true
 Matches : -> "tst-DE1233-120000" false
 Matches : -> "tst-DE1233-TS0000" false
 */