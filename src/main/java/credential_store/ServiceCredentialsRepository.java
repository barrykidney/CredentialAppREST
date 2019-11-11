package credential_store;

import org.springframework.data.repository.CrudRepository;

import credential_store.ServiceCredentials;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ServiceCredentialsRepository extends CrudRepository<ServiceCredentials, Integer> {

}
