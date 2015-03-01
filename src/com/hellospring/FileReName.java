package com.hellospring;

import java.io.File;
import java.io.IOException;

public class FileReName {
	
	public static void main(String[] argv) throws IOException {
	    String path = "/Users/anuragbhardwaj/Downloads/forum.football.co.uk/";
	    File folder = new File(path);
	    changeFilesOfFolder(folder);
	}
	
	public static void changeFilesOfFolder(File folder){
	    File[] listOfFiles = folder.listFiles();

	    if (listOfFiles != null) {
	        int count = 1;
	        for (int i = 0; i < listOfFiles.length; i++) {
	            if (listOfFiles[i].isFile()) {
	                File f = new File(folder.getPath() + "/" + listOfFiles[i].getName()); 
	                f.renameTo(new File(folder.getPath() + "/" + "abhard6 " + count + ".html"));
	                count++;                    
	            } else if (listOfFiles[i].isDirectory()) {
	                changeFilesOfFolder(listOfFiles[i]);
	            }
	        }
	    } else {
	        System.out.println("Path without files");
	    }
}
}