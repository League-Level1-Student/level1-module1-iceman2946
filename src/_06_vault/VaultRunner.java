package _06_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault= new Vault();
		System.out.println(vault.tryCode(294));
		SecretAgent agent= new SecretAgent();
		agent.findCode(vault);
	}
}
