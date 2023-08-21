package com.ada.inadimplentes.dto.parser;

import com.ada.inadimplentes.dto.ClienteDTO;
import com.ada.inadimplentes.dto.ClienteInformacoesDTO;
import com.ada.inadimplentes.model.Cliente;

public class ClienteParser {

    public static ClienteDTO toClienteDTO(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(cliente.getId());
        clienteDTO.setDependentes(cliente.getDependentes());
        clienteDTO.setEscolaridade(cliente.getEscolaridade());
        clienteDTO.setIdade(cliente.getIdade());
        clienteDTO.setInadimplente(cliente.isInadimplente());
        clienteDTO.setSexo(cliente.getSexo());
        clienteDTO.setEstadoCivil(cliente.getEstadoCivil());
        clienteDTO.setLimiteDeCreditos(cliente.getLimiteDeCreditos());
        clienteDTO.setMesesDeRelacionamento(cliente.getMesesDeRelacionamento());
        clienteDTO.setTipoCartao(cliente.getTipoCartao());
        clienteDTO.setSalarioAnual(cliente.getSalarioAnual());

        return clienteDTO;
    }
}
