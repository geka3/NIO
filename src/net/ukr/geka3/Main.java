package net.ukr.geka3;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
	//second type2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Path  p = Paths.get("pr.txt");
//		System.out.println(p.getNameCount());
//		System.out.println(p.getParent());
//		System.out.println(p.isAbsolute());
		Path kroshka = Paths.get("kroshka.txt");
		Path p2 = Paths.get("p2.txt");
		try {
			Files.deleteIfExists(kroshka);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			Files.createFile(kroshka);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}

}
