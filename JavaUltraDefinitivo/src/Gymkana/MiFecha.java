package Gymkana;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class MiFecha {

	public static void main(String[] args) {
		LocalDate miCumpli = LocalDate.of(2002, 11, 10);
		Locale idioma = Locale.forLanguageTag("es");
		
		System.out.println(miCumpli); //esto lo da todo jutno
		
		System.out.println("Día: " + miCumpli.getDayOfMonth());
		System.out.println("Mes: " + miCumpli.getMonthValue());
		System.out.println("Año: " + miCumpli.getYear());
		System.out.println(miCumpli.getMonth().getDisplayName(TextStyle.FULL, idioma).toUpperCase());
		System.out.println(miCumpli.getDayOfWeek().getDisplayName(TextStyle.FULL, idioma).toUpperCase()); //esto me da que dia de la semana era

		System.out.println("-------------------------------");

		LocalDate today = LocalDate.now();
		Period miEdad = Period.between(miCumpli, today);
		
		System.out.println("Fecha de nacimiento: " + miCumpli);
		System.out.println("Fecha de hoy: " + today);
		System.out.println("Edad exacta: " + miEdad.getYears() + " años " + miEdad.getMonths() + " meses " + miEdad.getDays() + " dias");
		System.out.println("Total días vividos: " + ChronoUnit.DAYS.between(miCumpli, today));
		System.out.println("Semanas completas: " + ChronoUnit.WEEKS.between(miCumpli, today));

	}

}
