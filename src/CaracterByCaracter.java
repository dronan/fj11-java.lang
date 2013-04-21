public class CaracterByCaracter {

	public void retornaCaracterbyCaracter(String s) {
		int totalLetras = s.length();

		for (int x = 0; x < totalLetras; x++) {
			System.out.println(s.charAt(x));
		}
	}

	public void reverseString(String s) {
		StringBuilder s1 = new StringBuilder(s).reverse();
		System.out.println("Original: " + s);
		System.out.println("Invertida: " + s1);

	}

	public void usoDoSplit(String s) {
		String array[] = s.split(" ");
		for (int x = array.length - 1; x >= 0; x--) {
			System.out.print(array[x].toUpperCase()+ " ");
			//System.out.println(x);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaracterByCaracter c = new CaracterByCaracter();
		// c.retornaCaracterbyCaracter("o rato roeu a roupa do rei de roma");
		// c.reverseString("inverte a bagaça");
		c.usoDoSplit("Testando o split");
	}

}
