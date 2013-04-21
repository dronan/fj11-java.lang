public class TestaConta {
	public static void main(String[] args) {
		Conta c = new Conta(100.00);
		System.out.println(c.toString());
		System.out.println( "descricao: " +c);
		
		Conta c1 = new Conta(100);
		Conta c2 = new Conta(100);
		
		System.out.println(c1.equals(c2));
		
		if (c1 != c2){
			System.out.println("Os objetos sao diferentes");
		}
		
	}
}
