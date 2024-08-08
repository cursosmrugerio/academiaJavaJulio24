package apx.academia;

class Animal{
	void comer(){};
}

abstract class Ave extends Animal {
	abstract void volar();
}

class Aguila extends Ave {
	@Override
	void volar() {}
}


public class Principal {
	
	public static void main(String[] args) {

	}

}
