package id.taufiq.latihanspringsecurity.repository;

import id.taufiq.latihanspringsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
