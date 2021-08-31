package br.com.Animal;

import java.util.Objects;

public class Animal {
	private String especie;
	private String nomeDaRaca;
	private Integer numeroPatas;
	private Boolean mamifero;
	private Boolean terrestre;
	private Boolean aquatico;
	private Boolean oviparo;
	private Boolean carnivoro;
	private Boolean herbivoro;
	
	public Animal(String especie, String nomeDaRaca, Integer numeroPatas, Boolean mamifero, Boolean terrestre,
			Boolean aquatico, Boolean oviparo, Boolean carnivoro, Boolean herbivoro) {
		this.especie = especie;
		this.nomeDaRaca = nomeDaRaca;
		this.numeroPatas = numeroPatas;
		this.mamifero = mamifero;
		this.terrestre = terrestre;
		this.aquatico = aquatico;
		this.oviparo = oviparo;
		this.carnivoro = carnivoro;
		this.herbivoro = herbivoro;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNomeDaRaca() {
		return nomeDaRaca;
	}

	public void setNomeDaRaca(String nomeDaRaca) {
		this.nomeDaRaca = nomeDaRaca;
	}

	public Integer getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(Integer numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public Boolean getMamifero() {
		return mamifero;
	}

	public void setMamifero(Boolean mamifero) {
		this.mamifero = mamifero;
	}

	public Boolean getTerrestre() {
		return terrestre;
	}

	public void setTerrestre(Boolean terrestre) {
		this.terrestre = terrestre;
	}

	public Boolean getAquatico() {
		return aquatico;
	}

	public void setAquatico(Boolean aquatico) {
		this.aquatico = aquatico;
	}

	public Boolean getOviparo() {
		return oviparo;
	}

	public void setOviparo(Boolean oviparo) {
		this.oviparo = oviparo;
	}

	public Boolean getCarnivoro() {
		return carnivoro;
	}

	public void setCarnivoro(Boolean carnivoro) {
		this.carnivoro = carnivoro;
	}

	public Boolean getHerbivoro() {
		return herbivoro;
	}

	public void setHerbivoro(Boolean herbivoro) {
		this.herbivoro = herbivoro;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(aquatico, carnivoro, especie, herbivoro, mamifero, nomeDaRaca, numeroPatas, oviparo,
				terrestre);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(aquatico, other.aquatico) && Objects.equals(carnivoro, other.carnivoro)
				&& Objects.equals(especie, other.especie) && Objects.equals(herbivoro, other.herbivoro)
				&& Objects.equals(mamifero, other.mamifero) && Objects.equals(nomeDaRaca, other.nomeDaRaca)
				&& Objects.equals(numeroPatas, other.numeroPatas) && Objects.equals(oviparo, other.oviparo)
				&& Objects.equals(terrestre, other.terrestre);
	}
	

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", nomeDaRaca=" + nomeDaRaca + ", numeroPatas=" + numeroPatas
				+ ", mamifero=" + mamifero + ", terrestre=" + terrestre + ", aquatico=" + aquatico + ", oviparo="
				+ oviparo + ", carnivoro=" + carnivoro + ", herbivoro=" + herbivoro + "]";
	}
		
}
