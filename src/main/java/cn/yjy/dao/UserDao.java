package cn.yjy.dao;

import cn.yjy.entity.MyUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * 使用Spring自动扫描MyBatis的接口并装配 （Spring将指定包中所有被@Mapper注解标注的接口自动装配为Mybatis的映射接口
 */

@Repository("userDao")
public interface UserDao {
    /**
     * 接口方法对应SQL映射文件UserMapper.xml中的id
     */
    public List<MyUser> selectUserByUname(MyUser user);
}
