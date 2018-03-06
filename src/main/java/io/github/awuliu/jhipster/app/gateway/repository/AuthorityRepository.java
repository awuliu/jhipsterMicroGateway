package io.github.awuliu.jhipster.app.gateway.repository;

import io.github.awuliu.jhipster.app.gateway.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
