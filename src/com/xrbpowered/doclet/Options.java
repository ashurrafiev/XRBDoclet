package com.xrbpowered.doclet;

public class Options {

	public static final String baseClassPath = "com/xrbpowered/doclet";
	public static final String defaultCSS = "resources/doc.css";
	public static final String defaultJS = "resources/doc.js";

	public static String outPath = ".";
	public static String docTitle = "API Reference";
	public static String cssFile = null;
	public static String jsFile = null;
	
	public static void loadOptions(String[][] options) {
		for(String[] opt : options) {
			switch(opt[0]) {
				case "-d":
					outPath = opt[1];
					break;
				case "-doctitle":
					docTitle = opt[1];
					break;
				case "-css":
					cssFile = opt[1];
					break;
				case "-js":
					jsFile = opt[1];
					break;
			}
		}
	}
	
	public static int optionLength(String opt) {
		switch(opt) {
			case "-d":
			case "-doctitle":
			case "-css":
			case "-js":
				return 2;
			default:
				return 0;
		}
	}

}
