package apxJava;

import java.io.IOException;

interface SampleCloseable{
	public void close() throws java.io.IOException;
}

public class Test implements SampleCloseable{
	
	public static void main(String[] args) throws IOException {
		new Test().close();
	}
	
	@Override
	public void close() throws java.io.FileNotFoundException {	
		System.out.println("CLOSE File");
	}

}
