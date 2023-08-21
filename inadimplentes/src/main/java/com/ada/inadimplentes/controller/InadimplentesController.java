package com.ada.inadimplentes.controller;

import com.ada.inadimplentes.dto.ClienteDTO;
import com.ada.inadimplentes.dto.ClienteInformacoesDTO;
import com.ada.inadimplentes.service.InadimplentesService;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inadimplentes")
public class InadimplentesController {

    private final InadimplentesService inadimplentesService;

    public InadimplentesController(InadimplentesService inadimplentesService) {
        this.inadimplentesService = inadimplentesService;
    }

    @GetMapping
    public ResponseEntity<Page<ClienteInformacoesDTO>> findAllClientes(
            @RequestParam(value = "numeroPagina", required = false, defaultValue = "0")
            @Min(value = 0, message = "Valor mínimo para o número de página é 0") @Max(200) Integer numeroPagina,
            @RequestParam(value = "quantidadeRegistros", required = false, defaultValue = "150")
            @Min(value = 5, message = "No mínimo 5 registros por página") @Max(200)
            Integer quantidadeRegistros,
            @RequestParam(value = "ordem", required = false, defaultValue = "desc")
            @Size(min = 3, max = 4, message = "Os campos aceitos são somente 'desc' ou 'asc'")
            String ordem,
            @RequestParam(value = "campoOrdenacao", required = false, defaultValue = "name")
            @Size(min = 2, message = "Campo ordenação inválido")
            String campoOrdenacao
    ) {
        return ResponseEntity.ok(inadimplentesService.findAll(numeroPagina, quantidadeRegistros, ordem, campoOrdenacao));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(inadimplentesService.findById(id));
    }

    @GetMapping("/filtro")
    public ResponseEntity<List<ClienteDTO>> findAllByFilter(
            @RequestHeader(value = "inadimplente", required = false) boolean inadimplente,
            @RequestHeader(value = "tipoCartao", required = false) String tipoCartao
    ) {
        return ResponseEntity.ok(inadimplentesService.findByFilter(inadimplente, tipoCartao));
    }

}
