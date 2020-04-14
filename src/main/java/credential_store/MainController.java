package credential_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller    // This means that this class is a Controller
@RequestMapping(path="/credentials") // This means URL's start with /credentials (after Application path)
public class MainController {

    @Autowired
    private CredentialService credentialService;

    @GetMapping(path="/")
    public @ResponseBody Iterable<CredentialSummaryDTO> getAllServiceCredentials() {
        return credentialService.getAllCredentials();
    }

    @GetMapping(path="/{credentialId}")
    public @ResponseBody CredentialDTO getCredentialsById(@PathVariable Integer credentialId) {
        return credentialService.getCredentialById(credentialId);
    }

    @PostMapping(path="/")
    public @ResponseBody CredentialDTO addNewCredentials(@RequestBody CredentialDTO newCredentialDto) {
        // This returns a JSON or XML with the ServiceCredentials
        return credentialService.addNewCredential(newCredentialDto);
    }

    @DeleteMapping("/{credentialId}")
    public @ResponseBody CredentialDTO deleteCredentials(@PathVariable Integer credentialId) {
        return credentialService.deleteCredential(credentialId);
    }
}
