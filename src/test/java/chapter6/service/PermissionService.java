package chapter6.service;

import chapter6.entity.Permission;

public interface PermissionService {

    Permission createPermission(Permission permission);

    void deletePermission(Long permissionId);

}
