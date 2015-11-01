package br.com.vectorx.teste1;

import br.com.vectorx.teste1.ws.ICalendarWS;
import br.com.vectorx.teste1.ws.impl.CalendarWSImpl;

public class MainTesteBanco {
	public static void main(String[] args) {
		ICalendarWS calendario = new CalendarWSImpl();
		System.out.println(calendario.getDataNaoUtil());
	}
}
