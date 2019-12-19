package credential_store;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import credential_store.ServiceCredentials;

import java.util.Collection;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ServiceCredentialsRepository extends CrudRepository<ServiceCredentials, Integer> {

}
