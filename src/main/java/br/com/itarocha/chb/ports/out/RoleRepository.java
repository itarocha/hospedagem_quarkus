package br.com.itarocha.chb.ports.out;

import br.com.itarocha.chb.domain.Role;
import br.com.itarocha.chb.domain.enums.RoleNameEnum;

import java.util.Optional;

public interface RoleRepository {

    Optional<Role> findByName(RoleNameEnum roleName);

}
