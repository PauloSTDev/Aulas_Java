package br.edu.imed;

public class Viagem {

	private String local;
	private String imagem;
	private String preco;
	
	public Viagem() { }
	
	public Viagem(String l, String i, String p) {
		this.local = l;
		this.imagem = i;
		this.preco = p;
	}
	
	@Override
	public String toString() {
		return "Viagem [local=" + local + ", imagem=" + imagem + ", preco=" + preco + "]";
	}
			
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((imagem == null) ? 0 : imagem.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Viagem other = (Viagem) obj;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (imagem == null) {
			if (other.imagem != null)
				return false;
		} else if (!imagem.equals(other.imagem))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
		
	}

	public String getlocal() {
		return local;
	}
	public void setlocal(String local) {
		this.local = local;
	}
	public String getimagem() {
		return imagem;
	}
	public void setimagem(String imagem) {
		this.imagem = imagem;
	}
	public String getpreco() {
		return preco;
	}
	public void setpreco(String preco) {
		this.preco = preco;
	}

	public static void add(Viagem v1) {
		// TODO Auto-generated method stub
		
	}
}