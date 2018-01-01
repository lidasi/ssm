package cwweb.com.service;

import java.util.List;

import cwweb.com.model.AdminUser;
import cwweb.com.model.AdminUserExample;

public interface AdminUserService {
    List<AdminUser> userCheck(AdminUserExample adminUserExample);
}
