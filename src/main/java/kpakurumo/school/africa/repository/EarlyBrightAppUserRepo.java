package kpakurumo.school.africa.repository;

import kpakurumo.school.africa.data.models.EarlyBrightAppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface EarlyBrightAppUserRepo extends JpaRepository<EarlyBrightAppUser, String> {

   Optional<EarlyBrightAppUser> findEarlyBrightAppUserByUsername(String username);
}
