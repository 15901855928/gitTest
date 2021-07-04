package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.Class2Mapper;
import com.ruoyi.test.domain.Class2;
import com.ruoyi.test.service.IClass2Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 商铺类别详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Service
public class Class2ServiceImpl implements IClass2Service 
{
    @Autowired
    private Class2Mapper class2Mapper;

    /**
     * 查询商铺类别详情
     * 
     * @param id 商铺类别详情ID
     * @return 商铺类别详情
     */
    @Override
    public Class2 selectClass2ById(Long id)
    {
        return class2Mapper.selectClass2ById(id);
    }

    /**
     * 查询商铺类别详情列表
     * 
     * @param class2 商铺类别详情
     * @return 商铺类别详情
     */
    @Override
    public List<Class2> selectClass2List(Class2 class2)
    {
        return class2Mapper.selectClass2List(class2);
    }

    /**
     * 新增商铺类别详情
     * 
     * @param class2 商铺类别详情
     * @return 结果
     */
    @Override
    public int insertClass2(Class2 class2)
    {
        return class2Mapper.insertClass2(class2);
    }

    /**
     * 修改商铺类别详情
     * 
     * @param class2 商铺类别详情
     * @return 结果
     */
    @Override
    public int updateClass2(Class2 class2)
    {
        return class2Mapper.updateClass2(class2);
    }

    /**
     * 删除商铺类别详情对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteClass2ByIds(String ids)
    {
        return class2Mapper.deleteClass2ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商铺类别详情信息
     * 
     * @param id 商铺类别详情ID
     * @return 结果
     */
    @Override
    public int deleteClass2ById(Long id)
    {
        return class2Mapper.deleteClass2ById(id);
    }
}
