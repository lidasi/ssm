package cwweb.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cwweb.com.dao.AdminUserMapper;
import cwweb.com.model.AdminUser;
import cwweb.com.model.AdminUserExample;
import cwweb.com.service.AdminUserService;

@Service
public class AdminUserServiceImpl implements AdminUserService{

    @Autowired
    private AdminUserMapper adminUserMapper;
    
    @Override
    public List<AdminUser> userCheck(AdminUserExample adminUserExample) {
        List<AdminUser> list = adminUserMapper.selectByExample(adminUserExample);
        return list;
    }

}
