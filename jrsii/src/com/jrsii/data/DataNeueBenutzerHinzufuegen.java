package com.jrsii.data;

import java.util.Date;

public class DataNeueBenutzerHinzufuegen {
	public static String dataVornameStr ;
	public static String dataNachnameStr ;
	public static String dataStellungStr ;
	public static String dataBenutzernameStr ;
	public static String dataKennwortStr ;
	public static String dataGeburtsdatumStr ;
	public static Date dataGeburtsdatumDate;
	
	public static Date getDataGeburtsdatumDate() {
		return dataGeburtsdatumDate;
	}
	public static void setDataGeburtsdatumDate(Date dataGeburtsdatumDate) {
		DataNeueBenutzerHinzufuegen.dataGeburtsdatumDate = dataGeburtsdatumDate;
	}
	
	public static String getDataVornameStr() {
		return dataVornameStr;
	}
	public static void setDataVornameStr(String dataVornameStr) {
		dataVornameStr = DataNeueBenutzerHinzufuegen.dataVornameStr;
	}
	
	public  static String getDataNachnameStr() {
		return dataNachnameStr;
	}
	public void setDataNachnameStr(String dataNachnameStr) {
		this.dataNachnameStr = dataNachnameStr;
	}
	
	public static String getDataStellungStr() {
		return dataStellungStr;
	}
	public void setDataStellungStr(String dataStellungStr) {
		this.dataStellungStr = dataStellungStr;
	}
	
	public static String getDataBenutzernameStr() {
		return dataBenutzernameStr;
	}
	public void setDataBenutzernameStr(String dataBenutzernameStr) {
		this.dataBenutzernameStr = dataBenutzernameStr;
	}
	public static String getDataKennwortStr() {
		return dataKennwortStr;
	}
	public void setDataKennwortStr(String dataKennwortStr) {
		this.dataKennwortStr = dataKennwortStr;
	}
	public static String getDataGeburtsdatumStr() {
		return dataGeburtsdatumStr;
	}
	public void setDataGeburtsdatumStr(String dataGeburtsdatumStr) {
		this.dataGeburtsdatumStr = dataGeburtsdatumStr;
	}
	
	
}
