package br.com.vectorx.teste1.dao;

import java.util.Calendar;

import br.com.vectorx.teste1.entidade.Tbdata;

public interface ITbdataDao {
	Tbdata buscaPorData(Calendar calendar);
	Tbdata buscaProximoFeriado(Calendar calendar);
}
