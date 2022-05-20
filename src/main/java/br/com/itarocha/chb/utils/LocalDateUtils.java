package br.com.itarocha.chb.utils;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LocalDateUtils {

	public static LocalDate primeiroDiaDaSemana(LocalDate data) {
		return data.with(WeekFields.of(Locale.US).dayOfWeek(), 1L);
	}
	
	public static LocalDate primeiroDiaSemanaSeguinte(LocalDate data) {
		LocalDate primeiroDia = primeiroDiaDaSemana(data);
		return primeiroDia.plusDays(7);
	}

//	// Gera uma lista de dias inicial ao final
//	public static List<LocalDate> buildRangeDias(LocalDate dIni, LocalDate dFim) {
//		List<LocalDate> retorno = new ArrayList<>();
//		for (LocalDate d = dIni; !d.isAfter(dFim);  d = d.plusDays(1)){
//			retorno.add(d);
//		}
//		return retorno;
//	}

	// Gera uma lista de dias inicial ao final
	public static List<LocalDate> buildRangeDias(LocalDate dIni, int qtdDias) {
		return  IntStream.range(0, qtdDias)
				.mapToObj(i -> dIni.plusDays(i))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		//agora = LocalDate.of(2016, 2, 8);  
		//DateTimeConstants.
		//Locale.setDefault(new Locale("pt_BR"));
		Locale.setDefault(new Locale("en_US"));
		//Locale.setDefault(Locale.FRANCE);

		Locale.setDefault(Locale.US);
		System.out.println(Locale.getDefault());
		//LocalDate primeiroDia = agora.with(WeekFields.of(Locale.getDefault()).dayOfWeek(), 1L);
		//LocalDate primeiroDia = agora.with(WeekFields.of(Locale.US).dayOfWeek(), 1L);

		LocalDate primeiroDia = primeiroDiaDaSemana(agora);
		LocalDate ultimoDia = primeiroDia.plusDays(6);
		System.out.println(primeiroDia + " " + primeiroDia.getDayOfWeek().name());
		System.out.println(ultimoDia + " " + ultimoDia.getDayOfWeek().name());
		
		System.out.println("SEMANA SEGUINTE");
		LocalDate primeiroDiaSemanaSeguinte = primeiroDiaSemanaSeguinte(agora);
		LocalDate ultimoDiaSemanaSeguinte = primeiroDiaSemanaSeguinte.plusDays(6);
		System.out.println(primeiroDiaSemanaSeguinte);
		System.out.println(ultimoDiaSemanaSeguinte);
		
		
		//agora.with();
		
		//System.out.println("Primeiro dia da semana: "+agora.with(WeekFields.of(Locale.US).dayOfWeek(), 1L)); // 2017-08-13
		//System.out.println(agora.with(WeekFields.of(Locale.).dayOfWeek(), 1L)); // 2017-08-13
		
		//WeekFields.
		
		System.out.println(agora + " dia da semana: " + agora.getDayOfWeek().name() + " " + agora.getDayOfWeek().ordinal());
		System.out.println("-------------------------------------");
		int QTD_DIAS = 7;
		LocalDate dIni = LocalDateUtils.primeiroDiaDaSemana(LocalDate.now());
		LocalDate dFim = dIni.plusDays(QTD_DIAS - 1);
		System.out.println(String.format("%s - %s", dIni, dFim));
		System.out.println("-----------------------");
		//buildRangeDias(dIni, dFim).forEach(System.out::println);
		//System.out.println("-------------------------------------------");
		buildRangeDias(dIni, 7).forEach(System.out::println);
	}
	
}
