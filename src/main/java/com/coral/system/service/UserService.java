package com.coral.system.service;

import com.coral.common.domain.Tree;
import com.coral.system.domain.DeptDO;
import com.coral.system.domain.UserDO;
import com.coral.system.vo.UserVO;
import com.coral.system.domain.UserDO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public interface UserService {

    /**
     * @param id 用户id
     * @return UserDO
     */
    UserDO get(Long id);

    /**
     * @param map
     * @return UserDO
     */
    List<UserDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(UserDO user);

    int update(UserDO user);

    int remove(Long userId);

    int batchRemove(Long[] userIds);

    boolean exit(Map<String, Object> params);

    Set<String> listRoles(Long userId);

    int resetPwd(UserVO userVO, UserDO userDO) throws Exception;

    int adminResetPwd(UserVO userVO) throws Exception;

    Tree<DeptDO> getTree();

    /**
     * 更新个人信息
     *
     * @param userDO 用户信息
     * @return update status
     */
    int updatePersonal(UserDO userDO);

    /**
     * 更新个人图片
     *
     * @param file        图片
     * @param avatarData 裁剪信息
     * @param userId      用户ID
     * @throws Exception 异常
     * @return map
     */
    Map<String, Object> updatePersonalImg(MultipartFile file, String avatarData, Long userId) throws Exception;
}
