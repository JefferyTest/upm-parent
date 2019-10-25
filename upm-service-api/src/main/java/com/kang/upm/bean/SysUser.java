package com.kang.upm.bean;

import lombok.Data;

/**
 *
 * @author wangkang
 * @since 2019-09-25
 */
@Data
public class SysUser {

    private static final long serialVersionUID=1L;

    private String id;
    private String userName;

    private String passWord;

    private String nickname;

}
