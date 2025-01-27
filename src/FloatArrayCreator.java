
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("serial")
public class FloatArrayCreator extends File{
	private int sizeOfArray;
	private Float[] arrayFromTxt;
	
	
	public FloatArrayCreator(String nameForTxt ) throws IOException{
		super(nameForTxt);
		// in here, ı create reader for the file to read informations.
		FileReader okuyucu = new FileReader(this);
		BufferedReader strongerOkuyu = new BufferedReader(okuyucu);
		
		sizeOfArray=Integer.parseInt(strongerOkuyu.readLine());
		arrayFromTxt= new Float[sizeOfArray];
		//this usage is better with looking the text if the new line is empty or not
		String tempSt;
		int tempInt=0;
		while((tempSt=strongerOkuyu.readLine())!=null) {
			array()[tempInt++]=Float.parseFloat(tempSt);
		}
		
		//At first ı wanted to use for loop like this but in this part if the txt given wrongly ı mean lets say in the firs line it gives wrong size we get an error so it is better to use while with controling if the line is empty
		/*for(int i=0;i<array().length;i++) {
			array()[i]=Integer.parseInt(strongerOkuyu.readLine());
		}	*/
		strongerOkuyu.close();
		Randomizer.Randomize(array());// ı will randomize it once here
	}


	public Float[] array() {
		return arrayFromTxt;
	}
	
	
	

}
