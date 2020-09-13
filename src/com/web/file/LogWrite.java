package com.web.file;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class A implements Externalizable {
	private String name;
	private int a;

	public A() {
	}

	public A(String name, int a) {
		this.name = name;
		this.a = a;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		;
//		out.writeInt(a);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
//		a=in.readInt();
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", a=" + a + "]";
	}

}

public class LogWrite {
	public static void main(String[] args) {

		A a = new A("Avinash", 10);
		ObjectOutputStream os = null;
		FileOutputStream file = null;
		try {
			file = new FileOutputStream("exter.txt");
			os = new ObjectOutputStream(file);
			os.writeObject(a);
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileInputStream is = null;
		try {
			is = new FileInputStream("exter.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		A a1 = null;
		try {
			a1 = (A) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("reading " + a1.toString());

	}
}
