package com.coral.common.controller;

import com.coral.system.domain.UserToken;
import com.coral.system.domain.UserDO;
import org.springframework.stereotype.Controller;
import com.coral.common.utils.ShiroUtils;
import com.coral.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}