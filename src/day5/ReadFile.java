package day5;
import java.io.FileReader;
import java.io.BufferedReader;
public class ReadFile {

	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("C:\\Users\\navya.edara\\Desktop\\readFileExample.txt");
		BufferedReader br=new BufferedReader(fr);
		int i;
		while((i=br.read())!= -1) {
			System.out.print((char)i);
		}
		br.close();
		fr.close();
	}

}
