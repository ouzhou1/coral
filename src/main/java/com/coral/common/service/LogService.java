package com.coral.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coral.common.domain.LogDO;
import com.coral.common.domain.PageDO;
import com.coral.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
