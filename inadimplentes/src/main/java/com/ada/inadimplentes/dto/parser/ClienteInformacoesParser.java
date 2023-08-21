package com.ada.inadimplentes.dto.parser;

import com.ada.inadimplentes.dto.ClienteInformacoesDTO;
import com.ada.inadimplentes.model.Cliente;

public class ClienteInformacoesParser {

    public static ClienteInformacoesDTO toInadimplentesDTO(Cliente cliente) {
        ClienteInformacoesDTO clienteInformacoesDTO = new ClienteInformacoesDTO();
        clienteInformacoesDTO.setId(cliente.getId());
        clienteInformacoesDTO.setInadimplente(cliente.isInadimplente());
        clienteInformacoesDTO.setIdade(cliente.getIdade());
        clienteInformacoesDTO.setSexo(cliente.getSexo());
        clienteInformacoesDTO.setTipoCartao(cliente.getTipoCartao());
        return clienteInformacoesDTO;
    }
}
