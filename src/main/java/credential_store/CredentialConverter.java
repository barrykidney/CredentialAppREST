package credential_store;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CredentialConverter {

    @Autowired
    private ModelMapper modelMapper;

    protected CredentialDTO convertToDto(Credential credential) {
        // return modelMapper.map(credential, CredentialDTO.class);
        ArrayList<String> identifiers = ConvertCommaSeparatedStringToList(credential.getIdentifiers());

        return new CredentialDTO(credential.getId(), credential.getServiceUrl(), credential.getServiceName(),
                credential.getUsername(), credential.getEmail(), credential.getEncryptedPassword(),
                credential.getDateLastModified(), identifiers, credential.getActive());
    }

    protected Credential convertToEntity(CredentialDTO credentialDto) {
        // return modelMapper.map(credentialDto, Credential.class);
        Credential credential = new Credential();
        String identifiers = ConvertListToCommaSeparatedString(credentialDto.getIdentifiers());
        credential.setId(credentialDto.getId());
        credential.setServiceUrl(credentialDto.getServiceUrl());
        credential.setServiceName(credentialDto.getServiceName());
        credential.setUsername(credentialDto.getUsername());
        credential.setEmail(credentialDto.getEmail());
        credential.setEncryptedPassword(credentialDto.getEncryptedPassword());
        credential.setDateLastModified(credentialDto.getDateLastModified());
        credential.setIdentifiers(identifiers);
        credential.setActive(credentialDto.getActive());

        return credential;
    }

    protected ArrayList<String> ConvertCommaSeparatedStringToList(String commaSeparatedString) {
        String[] elements = commaSeparatedString.split(",");
        List<String> fixedLengthList = Arrays.asList(elements);

        return new ArrayList<>(fixedLengthList);
    }

    protected String ConvertListToCommaSeparatedString(ArrayList<String> listOfStrings) {
        StringBuilder sb = new StringBuilder();

        for (String identifier : listOfStrings) {
            sb.append(identifier).append(',');
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
