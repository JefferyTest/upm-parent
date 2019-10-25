package com.kang.upm.user.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kang.upm.bean.SysUser;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangkang
 * @since 2019-09-25
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     *  SSSSSS
     *
     * @return XX
     */
    List<SysUser> getDaulValue();
}
