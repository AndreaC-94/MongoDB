package co.develhope.MongoDB.repositories;

import co.develhope.MongoDB.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {


}
