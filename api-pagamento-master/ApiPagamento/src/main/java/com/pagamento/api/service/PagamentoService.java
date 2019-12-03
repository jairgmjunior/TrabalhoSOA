package com.pagamento.api.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagamento.api.model.DadosPagamento;
import com.pagamento.api.model.Pagamento;
import com.pagamento.api.repository.IPagamentoRepository;

@Service
public class PagamentoService {

	@Autowired
	private IPagamentoRepository pagamentoRepository;

	public List<Pagamento> getAll() {
		return pagamentoRepository.findAll();
	}

	public List<Pagamento> getAllBydIdCliente(Long id) {
		return pagamentoRepository.findAll().stream().filter(x -> x.getClienteId().equals(id))
				.collect((Collectors.toList()));
	}

	public Pagamento realizarPagamento(DadosPagamento dadosPag) {

		Pagamento pag = new Pagamento();

		pag.setClienteId(dadosPag.getIdCliente());
		pag.setNumeroCartao(dadosPag.getNumeroCartao());
		pag.setCodigo(dadosPag.getCodigoCartao());
		pag.setNomeImpressoCartao(dadosPag.getNomeImpressoCartao());
		pag.setValorTotal(dadosPag.getValorTotal());
		pag.setDataValidade(dadosPag.getDataValidadeCartao());

		return pagamentoRepository.save(pag);
	}
}
