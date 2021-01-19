package com.ngovanngoc.service.impl;

import com.ngovanngoc.model.Role;
import com.ngovanngoc.repository.IRoleIRepository;
import com.ngovanngoc.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleIRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void remove(Long id) {
        roleRepository.remove(id);
    }
}
