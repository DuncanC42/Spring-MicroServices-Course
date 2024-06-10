package bzh.duncan.learning.loans.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component("auditAwareImplementation")
public class AuditAwareImplementation implements AuditorAware<String> {

    /**
     * Returns the current auditor of the application.
     *
     * @return the current auditor.
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("LOANS_MS");
    }

}
