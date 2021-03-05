package com.clancorp.model;

public enum CodigoPaisEnum {
	ARGENTINA("Argentina","+54"),
	VENEZUELA("Venezuela","+58"),
	CHILE("Chile","+56"),
	PERU("Perú","+51"),
	URUGUAY("Uruguay","+598"),
	PARAGUAY("Paraguay","+595"),
	BRASIL("Brasil","+55"),
	BOLIVIA("Bolivia","+591"),
	COLOMBIA("Colombia","+57"),
	COSTA_RICA("Costa Rica","+506"),
	CUBA("Cuba","+53"),
	ECUADOR("Ecuado","+539"),
	EL_SALVADOR("El Salvador","+503"),
	GUATEMALA("Guatemala","+502"),
	HONDURAS("Honduras","+504"),
	MEXICO("Mexico","+52"),
	NICARAGUA("Nicaragua","+505"),
	PANAMA("Panamá","+507"),
	PUERTO_RICO("Puerto Rico","+1"),
	REPUBLICA_DOMINICANA("República Dominicana","+1"),
	UCRANIA("Ucrania","+380"),
	REINO_UNIDO("Reino Unido","+44"),
	ESTADOS_UNIDOS("Estados Unnidos","+1"),
	ESPAÑA("España","+34");
	
	private String nombrePais;
	
	private String codigoPais;
	
	CodigoPaisEnum(String nombrePais, String codigoPais) {
		this.nombrePais = nombrePais;
		this.codigoPais = codigoPais;
	}
	
	@SuppressWarnings("unused")
	private String getNombrePais() {
		return nombrePais;
	}

	@SuppressWarnings("unused")
	private String getCodigoPais() {
		return codigoPais;
	}
}
