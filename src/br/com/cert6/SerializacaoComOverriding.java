package br.com.cert6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializacaoComOverriding implements Serializable {

	private int x = 1, y = 2;
	
	public void teste(){
		
		File f = new File("file.ser");
		if (! f.exists()){
			try {
				f.createNewFile();
			}
			catch (IOException e) { e.printStackTrace(); }
		}
		
		SerializacaoComOverriding s = new SerializacaoComOverriding();
		try {
			FileOutputStream fs = new FileOutputStream(f);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(s);
			
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			oi.readObject();
			
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void writeObject(ObjectOutputStream os) throws Exception{
		try {
			//os.defaultWriteObject();
			os.writeInt(x);
			os.writeInt(y);
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream is) throws Exception{
		try {
			//os.defaultWriteObject();
			int a = is.readInt();
			int b = is.readInt();
			System.out.println("a = " + a + " e b = " + b);
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SerializacaoComOverriding().teste();
	}
}
