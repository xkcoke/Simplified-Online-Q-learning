package memory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
 * author:Xu Ke
 * function:��storeData�����ף���ȡ��write������д�������
 * Date��2015/2/3
 * */
public class readData {
	File f;
	FileInputStream fin;
	public readData(String filename) throws FileNotFoundException{
		f = new File(filename);
		fin = new FileInputStream(f);
	}
	
}
