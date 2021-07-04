package com.ruoyi.test.service;

import java.util.List;
import com.ruoyi.test.domain.Under;

/**
 * 底部图片详情Service接口
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
public interface IUnderService 
{
    /**
     * 查询底部图片详情
     * 
     * @param id 底部图片详情ID
     * @return 底部图片详情
     */
    public Under selectUnderById(Long id);

    /**
     * 查询底部图片详情列表
     * 
     * @param under 底部图片详情
     * @return 底部图片详情集合
     */
    public List<Under> selectUnderList(Under under);

    /**
     * 新增底部图片详情
     * 
     * @param under 底部图片详情
     * @return 结果
     */
    public int insertUnder(Under under);

    /**
     * 修改底部图片详情
     * 
     * @param under 底部图片详情
     * @return 结果
     */
    public int updateUnder(Under under);

    /**
     * 批量删除底部图片详情
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUnderByIds(String ids);

    /**
     * 删除底部图片详情信息
     * 
     * @param id 底部图片详情ID
     * @return 结果
     */
    public int deleteUnderById(Long id);
}
