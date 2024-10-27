package com.sumativa.tienda_fs3.Repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.sumativa.tienda_fs3.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
   
     Optional<UserEntity> findByEmail(String email);
    Boolean existsByEmail(String email);
}
