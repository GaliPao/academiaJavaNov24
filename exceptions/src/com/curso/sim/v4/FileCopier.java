package com.curso.sim.v4;

import java.io.*;

public class FileCopier {

	public static void main(String[] args) {
		try {
			copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Fin de Programa");
	}

	private static void copy(String records1, String records2) throws FileNotFoundException {

		InputStream is = new FileInputStream(records1);
		OutputStream os = new FileOutputStream(records2);

	}

}
