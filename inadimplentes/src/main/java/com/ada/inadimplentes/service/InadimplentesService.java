package com.ada.inadimplentes.service;

import com.ada.inadimplentes.dto.ClienteDTO;
import com.ada.inadimplentes.dto.ClienteInformacoesDTO;
import com.ada.inadimplentes.dto.parser.ClienteInformacoesParser;
import com.ada.inadimplentes.dto.parser.ClienteParser;
import com.ada.inadimplentes.exceptions.ClienteNaoEncontradoException;
import com.ada.inadimplentes.model.Cliente;
import com.ada.inadimplentes.repository.InadimplentesRepository;
import com.ada.inadimplentes.repository.filter.ClienteFilter;
import com.ada.inadimplentes.repository.spec.ClienteSpecification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InadimplentesService {

    private final InadimplentesRepository inadimplentesRepository;

    public InadimplentesService(InadimplentesRepository inadimplentesRepository) {
        this.inadimplentesRepository = inadimplentesRepository;
    }

    public List<ClienteDTO> findAll() {
        return inadimplentesRepository.findAll()
                .stream()
                .map(ClienteParser::toClienteDTO)
                .collect(Collectors.toList());
    }

    public Page<ClienteInformacoesDTO> findAll(Integer numeroPagina, Integer quantidadeRegistros, String ordem, String campoOrdenacao) {
        Sort ordenacao = Sort.by(Sort.Direction.fromString(ordem), campoOrdenacao);
        PageRequest pageRequest = PageRequest.of(numeroPagina, quantidadeRegistros, ordenacao);

        Page<Cliente> pagePokemon = inadimplentesRepository.findAll(pageRequest);

        return pagePokemon
                .map(ClienteInformacoesParser::toInadimplentesDTO);
    }

    public ClienteDTO findById(Long id) {
        Optional<Cliente> clienteOptional  = inadimplentesRepository.findById(id);

        return ClienteParser.toClienteDTO(clienteOptional
                .orElseThrow(() ->
                        new ClienteNaoEncontradoException("Não encontrado cliente de ID " + id)));
    }

    public List<ClienteDTO> findByFilter(boolean inadimplente, String tipoCartao) {
        ClienteFilter filtro = new ClienteFilter(inadimplente, tipoCartao);
        ClienteSpecification clienteSpecification = new ClienteSpecification(filtro);

        return inadimplentesRepository.findAll(clienteSpecification.findByFilter())
                .stream().map(ClienteParser::toClienteDTO).collect(Collectors.toList());
    }

}
