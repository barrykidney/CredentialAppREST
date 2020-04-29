package credential_store;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;


public class CredentialConverter {

    @Autowired
    private ModelMapper modelMapper;

    protected CredentialDTO convertToDto(Credential credential) {
        // return modelMapper.map(credential, CredentialDTO.class);
        return new CredentialDTO(credential.getId(), credential.getServiceUrl(), credential.getServiceName(),
                credential.getUsername(), credential.getEmail(), credential.getEncryptedPassword(),
                credential.getDateLastModified(), credential.getNote(), credential.getUserId(), credential.getActive());
    }

    protected Credential convertToEntity(CredentialDTO credentialDto) {
        // return modelMapper.map(credentialDto, Credential.class);
        Credential credential = new Credential();
        credential.setId(credentialDto.getId());
        credential.setServiceUrl(credentialDto.getServiceUrl());
        credential.setServiceName(credentialDto.getServiceName());
        credential.setUsername(credentialDto.getUsername());
        credential.setEmail(credentialDto.getEmail());
        credential.setEncryptedPassword(credentialDto.getEncryptedPassword());
        credential.setDateLastModified(credentialDto.getDateLastModified());
        credential.setNote(credentialDto.getNote());
        credential.setUser(credentialDto.getUserId());
        credential.setActive(credentialDto.getActive());

        return credential;
    }
}
