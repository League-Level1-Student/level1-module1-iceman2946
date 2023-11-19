package _06_vault;

public class SecretAgent {
	
	public static void findCode(Vault vault) {
		for(int x=-1; x<1000001; x++) {
			vault.tryCode(x);
			if(vault.tryCode(x)==true) {
				System.out.println(x);
			}
		}
			
	}
}
