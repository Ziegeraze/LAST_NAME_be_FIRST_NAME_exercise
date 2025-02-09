package com.ecore.roles.service;

import com.ecore.roles.model.Membership;
import com.ecore.roles.model.Role;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RolesService {

    Role createRole(Role role);

    Role getRole(UUID id);

    List<Role> getRoles();

    Role getRole(UUID teamMemberId, UUID teamId);

}
