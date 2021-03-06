package com.jrsii.entities;
// default package
// Generated Aug 11, 2014 10:36:41 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Adressen generated by hbm2java
 */
@Entity
public class Adressen implements java.io.Serializable {

	@Id
	@GeneratedValue
	private int id;
	private Integer nummer;
	private Date angelegtAm;
	private Date letzte�nderung;
	private Boolean gesperrt;
	private Date geburtsDatum;
	private String pers�nlicheAnrede;
	private String kommentar;
	private Boolean aktiverSch�ler;
	private Boolean actionFlag;
	private String dokumentenOrdner;
	private Integer geschlecht;
	private String kontakte;
	private String betreff;
	private Short graduierung;
	private Boolean nichtAktuell;
	private String k�rzel;
	private Integer sortierung;
	private Double abschlag;
	private Boolean betrag;
	private String email;
	private String mobil;
//	private Set bankverbindungens = new HashSet(0);
//	private Set staatsverweises = new HashSet(0);
//	private Set verbindungens = new HashSet(0);
//	private Set interessenverweises = new HashSet(0);
//	private Set instrumentenverweises = new HashSet(0);
//	private Set anschriftens = new HashSet(0);
//	private Set adressgruppenverweises = new HashSet(0);

	public Adressen() {
	}

	public Adressen(int id) {
		this.id = id;
	}

//	public Adressen(int id, Integer nummer, Date angelegtAm,
//			Date letzte�nderung, Boolean gesperrt, Date geburtsDatum,
//			String pers�nlicheAnrede, String kommentar, Boolean aktiverSch�ler,
//			Boolean actionFlag, String dokumentenOrdner, Integer geschlecht,
//			String kontakte, String betreff, Short graduierung,
//			Boolean nichtAktuell, String k�rzel, Integer sortierung,
//			Double abschlag, Boolean betrag, String email, String mobil,
//			Set bankverbindungens, Set staatsverweises, Set verbindungens,
//			Set interessenverweises, Set instrumentenverweises,
//			Set anschriftens, Set adressgruppenverweises) {
//		this.id = id;
//		this.nummer = nummer;
//		this.angelegtAm = angelegtAm;
//		this.letzte�nderung = letzte�nderung;
//		this.gesperrt = gesperrt;
//		this.geburtsDatum = geburtsDatum;
//		this.pers�nlicheAnrede = pers�nlicheAnrede;
//		this.kommentar = kommentar;
//		this.aktiverSch�ler = aktiverSch�ler;
//		this.actionFlag = actionFlag;
//		this.dokumentenOrdner = dokumentenOrdner;
//		this.geschlecht = geschlecht;
//		this.kontakte = kontakte;
//		this.betreff = betreff;
//		this.graduierung = graduierung;
//		this.nichtAktuell = nichtAktuell;
//		this.k�rzel = k�rzel;
//		this.sortierung = sortierung;
//		this.abschlag = abschlag;
//		this.betrag = betrag;
//		this.email = email;
//		this.mobil = mobil;
//		this.bankverbindungens = bankverbindungens;
//		this.staatsverweises = staatsverweises;
//		this.verbindungens = verbindungens;
//		this.interessenverweises = interessenverweises;
//		this.instrumentenverweises = instrumentenverweises;
//		this.anschriftens = anschriftens;
//		this.adressgruppenverweises = adressgruppenverweises;
//	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getNummer() {
		return this.nummer;
	}

	public void setNummer(Integer nummer) {
		this.nummer = nummer;
	}

	public Date getAngelegtAm() {
		return this.angelegtAm;
	}

	public void setAngelegtAm(Date angelegtAm) {
		this.angelegtAm = angelegtAm;
	}

	public Date getLetzte�nderung() {
		return this.letzte�nderung;
	}

	public void setLetzte�nderung(Date letzte�nderung) {
		this.letzte�nderung = letzte�nderung;
	}

	public Boolean getGesperrt() {
		return this.gesperrt;
	}

	public void setGesperrt(Boolean gesperrt) {
		this.gesperrt = gesperrt;
	}

	public Date getGeburtsDatum() {
		return this.geburtsDatum;
	}

	public void setGeburtsDatum(Date geburtsDatum) {
		this.geburtsDatum = geburtsDatum;
	}

	public String getPers�nlicheAnrede() {
		return this.pers�nlicheAnrede;
	}

	public void setPers�nlicheAnrede(String pers�nlicheAnrede) {
		this.pers�nlicheAnrede = pers�nlicheAnrede;
	}

	public String getKommentar() {
		return this.kommentar;
	}

	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	public Boolean getAktiverSch�ler() {
		return this.aktiverSch�ler;
	}

	public void setAktiverSch�ler(Boolean aktiverSch�ler) {
		this.aktiverSch�ler = aktiverSch�ler;
	}

	public Boolean getActionFlag() {
		return this.actionFlag;
	}

	public void setActionFlag(Boolean actionFlag) {
		this.actionFlag = actionFlag;
	}

	public String getDokumentenOrdner() {
		return this.dokumentenOrdner;
	}

	public void setDokumentenOrdner(String dokumentenOrdner) {
		this.dokumentenOrdner = dokumentenOrdner;
	}

	public Integer getGeschlecht() {
		return this.geschlecht;
	}

	public void setGeschlecht(Integer geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getKontakte() {
		return this.kontakte;
	}

	public void setKontakte(String kontakte) {
		this.kontakte = kontakte;
	}

	public String getBetreff() {
		return this.betreff;
	}

	public void setBetreff(String betreff) {
		this.betreff = betreff;
	}

	public Short getGraduierung() {
		return this.graduierung;
	}

	public void setGraduierung(Short graduierung) {
		this.graduierung = graduierung;
	}

	public Boolean getNichtAktuell() {
		return this.nichtAktuell;
	}

	public void setNichtAktuell(Boolean nichtAktuell) {
		this.nichtAktuell = nichtAktuell;
	}

	public String getK�rzel() {
		return this.k�rzel;
	}

	public void setK�rzel(String k�rzel) {
		this.k�rzel = k�rzel;
	}

	public Integer getSortierung() {
		return this.sortierung;
	}

	public void setSortierung(Integer sortierung) {
		this.sortierung = sortierung;
	}

	public Double getAbschlag() {
		return this.abschlag;
	}

	public void setAbschlag(Double abschlag) {
		this.abschlag = abschlag;
	}

	public Boolean getBetrag() {
		return this.betrag;
	}

	public void setBetrag(Boolean betrag) {
		this.betrag = betrag;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobil() {
		return this.mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}
//
//	public Set getBankverbindungens() {
//		return this.bankverbindungens;
//	}
//
//	public void setBankverbindungens(Set bankverbindungens) {
//		this.bankverbindungens = bankverbindungens;
//	}
//
//	public Set getStaatsverweises() {
//		return this.staatsverweises;
//	}
//
//	public void setStaatsverweises(Set staatsverweises) {
//		this.staatsverweises = staatsverweises;
//	}
//
//	public Set getVerbindungens() {
//		return this.verbindungens;
//	}
//
//	public void setVerbindungens(Set verbindungens) {
//		this.verbindungens = verbindungens;
//	}
//
//	public Set getInteressenverweises() {
//		return this.interessenverweises;
//	}
//
//	public void setInteressenverweises(Set interessenverweises) {
//		this.interessenverweises = interessenverweises;
//	}
//
//	public Set getInstrumentenverweises() {
//		return this.instrumentenverweises;
//	}
//
//	public void setInstrumentenverweises(Set instrumentenverweises) {
//		this.instrumentenverweises = instrumentenverweises;
//	}
//
//	public Set getAnschriftens() {
//		return this.anschriftens;
//	}
//
//	public void setAnschriftens(Set anschriftens) {
//		this.anschriftens = anschriftens;
//	}
//
//	public Set getAdressgruppenverweises() {
//		return this.adressgruppenverweises;
//	}
//
//	public void setAdressgruppenverweises(Set adressgruppenverweises) {
//		this.adressgruppenverweises = adressgruppenverweises;
//	}

}
