class Conta {

	int numero;
	private double saldo;
	private double limite;
	private static int totalDeContas;
	
	public String toString(){
		return "Uma conta com o valor de "+this.saldo;
	}
	
	public boolean equals(Object object){
		if (!(object instanceof Conta))
			return false;
		Conta outraConta = (Conta) object;
		if (this.saldo == outraConta.saldo){
			return true;
		}
		return false;
	}
	
	Conta(){
	}
	
	Conta(double saldo){
		this.saldo = saldo;
		Conta.totalDeContas++;
	}
	
	public static int getTotalDeContas(){
		return Conta.totalDeContas;
	}
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	boolean saca(double quantidade) {
		if (this.saldo < quantidade) {
			return false;
		} else {
			this.saldo -= quantidade;
			return true;
		}
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	private double pegaSaldo() {
		return this.saldo;
	}

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
