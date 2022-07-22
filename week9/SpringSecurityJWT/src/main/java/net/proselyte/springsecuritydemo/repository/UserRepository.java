package net.proselyte.springsecuritydemo.repository;

import net.proselyte.springsecuritydemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

//Now we can use JpaRepository’s methods:
// save(), findOne(), findById(), findAll(),
// count(), delete(), deleteById()…
// without implementing these methods

