package id.taufiq.latihanspringsecurity.service.impl;

import id.taufiq.latihanspringsecurity.model.Role;
import id.taufiq.latihanspringsecurity.repository.RoleRepository;
import id.taufiq.latihanspringsecurity.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

}
