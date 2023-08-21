package com.ada.inadimplentes.repository.spec;

import com.ada.inadimplentes.model.Cliente;
import com.ada.inadimplentes.repository.filter.ClienteFilter;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteSpecification {

    private final ClienteFilter clienteFilter;

    public ClienteSpecification(ClienteFilter clienteFilter) {

        this.clienteFilter = clienteFilter;
    }

    public Specification<Cliente> findByFilter() {
        return (Root<Cliente> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (Objects.nonNull(clienteFilter.isInadimplente())) {
                predicates.add(criteriaBuilder.equal(root.get("inadimplente"), clienteFilter.isInadimplente()));
            }

            if (Objects.nonNull(clienteFilter.getTipoCartao())) {
                predicates.add(criteriaBuilder.like(root.get("tipoCartao"), clienteFilter.getTipoCartao()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }

}
