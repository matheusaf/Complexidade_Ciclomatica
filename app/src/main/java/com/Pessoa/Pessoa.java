package main.java.com.Pessoa;

public class Pessoa {
	public Pessoa() {
	}

	public String classificarFaixaEtaria(int idade) {

		String faixaEtaria = null;

		if (idade <= 11) {
			faixaEtaria = "crianca";
		} else {

			if (idade > 11 && idade <= 18) {
				faixaEtaria = "adolescente";
			} else {

				if (idade >= 19 && idade <= 59) {
					faixaEtaria = "adulto";
				} else {

					if (idade > 60) {
						faixaEtaria = "idoso";
					}
				}
			}
		}

		return faixaEtaria;

	}
}
