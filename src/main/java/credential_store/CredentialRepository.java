package credential_store;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called credentialRepository
// CRUD refers Create, Read, Update, Delete

public interface CredentialRepository extends CrudRepository<Credential, Integer> {

    List<Credential> findByUserId(Integer userId);
}
