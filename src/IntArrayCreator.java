

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("serial")
public class IntArrayCreator extends File{
	private int sizeOfArray;
	private Integer[] arrayFromTxt;
	
	
	public IntArrayCreator(String nameForTxt ) throws IOException{
		super(nameForTxt);
		// in here, ı create reader for the file to read informations.
		FileReader okuyucu = new FileReader(this);
		BufferedReader strongerOkuyu = new BufferedReader(okuyucu);
		
		sizeOfArray=Integer.parseInt(strongerOkuyu.readLine());
		arrayFromTxt= new Integer[sizeOfArray];
		//this usage is better with looking the text if the new line is empty or not
		String tempSt;
		int tempInt=0;
		while((tempSt=strongerOkuyu.readLine())!=null) {
			array()[tempInt++]=Integer.parseInt(tempSt);
		}
		
		//At first ı wanted to use for loop like this but in this part if the txt given wrongly ı mean lets say in the firs line it gives wrong size we get an error so it is better to use while with controling if the line is empty
		/*for(int i=0;i<array().length;i++) {
			array()[i]=Integer.parseInt(strongerOkuyu.readLine());
		}	*/
		strongerOkuyu.close();
		Randomizer.Randomize(array());// ı will randomize it here once
	}


	public Integer[] array() {
		return arrayFromTxt;
	}
	

}
