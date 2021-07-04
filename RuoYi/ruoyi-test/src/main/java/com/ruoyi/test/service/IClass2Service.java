package com.ruoyi.test.service;

import java.util.List;
import com.ruoyi.test.domain.Class2;

/**
 * 商铺类别详情Service接口
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
public interface IClass2Service 
{
    /**
     * 查询商铺类别详情
     * 
     * @param id 商铺类别详情ID
     * @return 商铺类别详情
     */
    public Class2 selectClass2ById(Long id);

    /**
     * 查询商铺类别详情列表
     * 
     * @param class2 商铺类别详情
     * @return 商铺类别详情集合
     */
    public List<Class2> selectClass2List(Class2 class2);

    /**
     * 新增商铺类别详情
     * 
     * @param class2 商铺类别详情
     * @return 结果
     */
    public int insertClass2(Class2 class2);

    /**
     * 修改商铺类别详情
     * 
     * @param class2 商铺类别详情
     * @return 结果
     */
    public int updateClass2(Class2 class2);

    /**
     * 批量删除商铺类别详情
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteClass2ByIds(String ids);

    /**
     * 删除商铺类别详情信息
     * 
     * @param id 商铺类别详情ID
     * @return 结果
     */
    public int deleteClass2ById(Long id);
}
