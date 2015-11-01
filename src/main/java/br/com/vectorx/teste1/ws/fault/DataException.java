package br.com.vectorx.teste1.ws.fault;

import javax.xml.ws.WebFault;

import br.com.vectorx.teste1.util.DataUtil;

@WebFault(name = "DataFault")
public class DataException extends Exception {

	private static final long serialVersionUID = 1L;

	public DataException(String msg) {
		super(msg);
	}

	public String getFaultInfo() {
		return "Data Inválida. Envie no formato "+ DataUtil.FORMATO_ISO8601RECEBIDO;
	}
}
