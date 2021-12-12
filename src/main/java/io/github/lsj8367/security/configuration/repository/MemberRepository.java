package io.github.lsj8367.security.configuration.repository;

import io.github.lsj8367.security.configuration.domain.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(final String email);
}