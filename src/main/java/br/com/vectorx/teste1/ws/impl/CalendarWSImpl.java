package br.com.vectorx.teste1.ws.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.joda.time.DateTime;

import br.com.vectorx.teste1.regras.Calendario;
import br.com.vectorx.teste1.util.DataUtil;
import br.com.vectorx.teste1.ws.ICalendarWS;
import br.com.vectorx.teste1.ws.fault.DataException;

@WebService(name = "CalendarWS",targetNamespace = "br.com.vectorx.teste1.ws.ICalendarWS", serviceName = "CalendarWS")
@SOAPBinding(style=Style.DOCUMENT)
@Remote(ICalendarWS.class)
@Stateless
public class CalendarWSImpl implements ICalendarWS{
	
	
	public boolean isDataNaoUtil(String data) throws DataException{
		DateTime dateTime;
		try{
			dateTime = DataUtil.formataDataISOtoDateTime(data);
		}catch(Exception e){
			throw new DataException("A Conversão da Data Fallhou");
		}
		return Calendario.isDataValida(dateTime);
	}

	public String getDataNaoUtil(){
		
		DateTime datetime = Calendario.getProximaDataNaoUtil(DateTime.now());
		return datetime.toString(DataUtil.FORMATO_ISO8601); 
		
	}

	
}
