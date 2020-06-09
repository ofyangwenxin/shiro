package chapter6.dao;

import chapter6.entity.Permission;

public interface PermissionDao {

    Permission createPermission(Permission permission);

    void deletePermission(Long permissionId);

}
