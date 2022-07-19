package com.audit.demo.audit;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;


@Component
public class AuditAwareImpl implements AuditorAware{

	@Override
	public Optional getCurrentAuditor() {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		
		
		return Optional.ofNullable(name);
	}

}
