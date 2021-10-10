package co.jeongeun.prj.exe;

import java.io.*;

public class CopyFile {
	private FileReader fr;
	private FileWriter fw;
	private BufferedReader br;
	private BufferedWriter bw;
	
	private void copyPasteFile() {
		try {
			fr = new FileReader("src/main/resources/file.txt");
			fw = new FileWriter("src/main/resources/file2.txt");

			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String line;
			while((line=br.readLine())!=null) {
				bw.write(line);
			}
			bw.close();
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}

		public void run() {
			copyPasteFile();
		}
}
