package com.ngovanngoc.service;

import com.ngovanngoc.model.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();

    Role findById(Long id);

    void save(Role role);

    void remove(Long id);
}
