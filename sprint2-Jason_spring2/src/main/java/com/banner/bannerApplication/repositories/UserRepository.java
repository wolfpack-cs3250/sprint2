package com.banner.bannerApplication.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.banner.bannerApplication.entities.User;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.banner.bannerApplication.repositories.UserRepository;
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CrudRepository<User, String> {
    List<User> findByLastName(String lastName);
}
