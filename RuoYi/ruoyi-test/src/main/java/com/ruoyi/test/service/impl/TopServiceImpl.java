package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.TopMapper;
import com.ruoyi.test.domain.Top;
import com.ruoyi.test.service.ITopService;
import com.ruoyi.common.core.text.Convert;

/**
 * 首页顶部图片Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Service
public class TopServiceImpl implements ITopService 
{
    @Autowired
    private TopMapper topMapper;

    /**
     * 查询首页顶部图片
     * 
     * @param id 首页顶部图片ID
     * @return 首页顶部图片
     */
    @Override
    public Top selectTopById(Long id)
    {
        return topMapper.selectTopById(id);
    }

    /**
     * 查询首页顶部图片列表
     * 
     * @param top 首页顶部图片
     * @return 首页顶部图片
     */
    @Override
    public List<Top> selectTopList(Top top)
    {
        return topMapper.selectTopList(top);
    }

    /**
     * 新增首页顶部图片
     * 
     * @param top 首页顶部图片
     * @return 结果
     */
    @Override
    public int insertTop(Top top)
    {
        return topMapper.insertTop(top);
    }

    /**
     * 修改首页顶部图片
     * 
     * @param top 首页顶部图片
     * @return 结果
     */
    @Override
    public int updateTop(Top top)
    {
        return topMapper.updateTop(top);
    }

    /**
     * 删除首页顶部图片对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTopByIds(String ids)
    {
        return topMapper.deleteTopByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除首页顶部图片信息
     * 
     * @param id 首页顶部图片ID
     * @return 结果
     */
    @Override
    public int deleteTopById(Long id)
    {
        return topMapper.deleteTopById(id);
    }
}
