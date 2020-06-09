package chapter6.service;

import chapter6.dao.PermissionDao;
import chapter6.dao.PermissionDaoImpl;
import chapter6.entity.Permission;

public class PermissionServiceImpl implements PermissionService {

    private PermissionDao permissionDao = new PermissionDaoImpl();

    @Override
    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    @Override
    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }

}
