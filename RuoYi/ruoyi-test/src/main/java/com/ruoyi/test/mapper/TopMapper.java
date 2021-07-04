package com.ruoyi.test.mapper;

import java.util.List;
import com.ruoyi.test.domain.Top;

/**
 * 首页顶部图片Mapper接口
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
public interface TopMapper 
{
    /**
     * 查询首页顶部图片
     * 
     * @param id 首页顶部图片ID
     * @return 首页顶部图片
     */
    public Top selectTopById(Long id);

    /**
     * 查询首页顶部图片列表
     * 
     * @param top 首页顶部图片
     * @return 首页顶部图片集合
     */
    public List<Top> selectTopList(Top top);

    /**
     * 新增首页顶部图片
     * 
     * @param top 首页顶部图片
     * @return 结果
     */
    public int insertTop(Top top);

    /**
     * 修改首页顶部图片
     * 
     * @param top 首页顶部图片
     * @return 结果
     */
    public int updateTop(Top top);

    /**
     * 删除首页顶部图片
     * 
     * @param id 首页顶部图片ID
     * @return 结果
     */
    public int deleteTopById(Long id);

    /**
     * 批量删除首页顶部图片
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTopByIds(String[] ids);
}
