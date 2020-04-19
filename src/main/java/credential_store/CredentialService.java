package credential_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.*;


@Service
public class CredentialService {

    @Autowired // This means to get the bean called ServiceCredentialsRepository
    private CredentialRepository credentialRepository;

    private final CredentialConverter credentialConverter = new CredentialConverter();


    public Iterable<CredentialSummaryDTO> getAllCredentials() {
        List<CredentialSummaryDTO> allCredentialSummaries = new ArrayList<>();
        Iterable<Credential> allCredentials = credentialRepository.findAll();

        for (Credential credential : allCredentials) {
            allCredentialSummaries.add(new CredentialSummaryDTO(credential.getId(), credential.getServiceName(),
                    credential.getDateLastModified(), credential.getNote(), credential.getActive()));
        }
        return allCredentialSummaries;
    }

    public CredentialDTO getCredentialById(Integer credentialId) {
        Credential credential = credentialRepository.findById(credentialId).orElseThrow(()
                -> new CredentialsNotFoundException(credentialId));

        return new CredentialDTO(credential.getId(), credential.getServiceUrl(), credential.getServiceName(),
                credential.getUsername(), credential.getEmail(), credential.getEncryptedPassword(),
                credential.getDateLastModified(), credential.getNote(), credential.getActive());
    }

    public CredentialDTO addNewCredential(CredentialDTO newCredentialDto) {
        newCredentialDto.setDateLastModified(Instant.now().toEpochMilli());
        Credential newCredentialEntity = credentialConverter.convertToEntity(newCredentialDto);
        Credential savedCredentialEntity = credentialRepository.save(newCredentialEntity);

        return credentialConverter.convertToDto(savedCredentialEntity);
    }

    public CredentialDTO deleteCredential(Integer credentialId) {
        Credential credential;
        Optional<Credential> optCredential = credentialRepository.findById(credentialId);
        if (optCredential.isPresent()) {
            credential = optCredential.get();
            credentialRepository.deleteById(credential.getId());
            return credentialConverter.convertToDto(credential);
        } else {
            throw new CredentialsNotFoundException(credentialId);
        }
    }
}
