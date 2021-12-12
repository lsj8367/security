package io.github.lsj8367.security.configuration.service;

import io.github.lsj8367.security.configuration.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
        return memberRepository.findByEmail(email)
            .orElseThrow(() -> new UsernameNotFoundException("UserName Not Found"))
            .toUserDetails();
    }

}
