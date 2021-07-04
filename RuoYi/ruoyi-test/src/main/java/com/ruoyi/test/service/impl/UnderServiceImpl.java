package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.UnderMapper;
import com.ruoyi.test.domain.Under;
import com.ruoyi.test.service.IUnderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 底部图片详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Service
public class UnderServiceImpl implements IUnderService 
{
    @Autowired
    private UnderMapper underMapper;

    /**
     * 查询底部图片详情
     * 
     * @param id 底部图片详情ID
     * @return 底部图片详情
     */
    @Override
    public Under selectUnderById(Long id)
    {
        return underMapper.selectUnderById(id);
    }

    /**
     * 查询底部图片详情列表
     * 
     * @param under 底部图片详情
     * @return 底部图片详情
     */
    @Override
    public List<Under> selectUnderList(Under under)
    {
        return underMapper.selectUnderList(under);
    }

    /**
     * 新增底部图片详情
     * 
     * @param under 底部图片详情
     * @return 结果
     */
    @Override
    public int insertUnder(Under under)
    {
        return underMapper.insertUnder(under);
    }

    /**
     * 修改底部图片详情
     * 
     * @param under 底部图片详情
     * @return 结果
     */
    @Override
    public int updateUnder(Under under)
    {
        return underMapper.updateUnder(under);
    }

    /**
     * 删除底部图片详情对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUnderByIds(String ids)
    {
        return underMapper.deleteUnderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除底部图片详情信息
     * 
     * @param id 底部图片详情ID
     * @return 结果
     */
    @Override
    public int deleteUnderById(Long id)
    {
        return underMapper.deleteUnderById(id);
    }
}
