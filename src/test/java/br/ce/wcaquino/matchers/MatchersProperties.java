package br.ce.wcaquino.matchers;

import java.util.Calendar;

public class MatchersProperties {
	
	public static DiaSemanaMatcher caiEm (Integer diaSemana) {
		
		return new DiaSemanaMatcher(diaSemana);
	}
	

	public static DiaSemanaMatcher caiEmUmaSegunda() {
		
		return new DiaSemanaMatcher(Calendar.MONDAY);
	}
}
