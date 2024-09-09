package com.curso.v10;

import java.io.IOException;

//import java.lang.Exception;

interface SampleCloseable{
	//public abstract
	void close() throws java.io.IOException;

}

class otherSample{
	otherSample() throws java.io.IOException{}
}

public class Test extends otherSample implements SampleCloseable {
	
	Test() throws Exception{
	}

	@Override
	public void close() {
	}

}
