
public class TestaGuardadorDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		Conta conta = new Conta();
		conta.deposita(1000.00);
		conta.deposita(50.00);
		guardador.adicionaObjeto(conta);
		
		
		Object object = guardador.pegaObjeto(0);
		
		try{
			Conta contaResgatada = (Conta) object;
			System.out.println("Compilou");
		}
		catch(Exception e){
			//e.getMessage();
			System.out.println("Erro de cast");
		}
		System.out.println(guardador.pegaObjeto(0));
	}

}
