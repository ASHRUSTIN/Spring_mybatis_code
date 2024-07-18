package com.syq.code.mapper;

import com.syq.code.entity.Euser;
import com.syq.code.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EuserMapper {
    List<Euser> FindByAllEuser(Euser euser);
    boolean UpdataByEusername(String eusername,String epermission);
    Euser FindByEusername(String username);
}
