package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.SpoticonMapper;
import com.ruoyi.test.domain.Spoticon;
import com.ruoyi.test.service.ISpoticonService;
import com.ruoyi.common.core.text.Convert;

/**
 * 景点图标Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Service
public class SpoticonServiceImpl implements ISpoticonService 
{
    @Autowired
    private SpoticonMapper spoticonMapper;

    /**
     * 查询景点图标
     * 
     * @param id 景点图标ID
     * @return 景点图标
     */
    @Override
    public Spoticon selectSpoticonById(Long id)
    {
        return spoticonMapper.selectSpoticonById(id);
    }

    /**
     * 查询景点图标列表
     * 
     * @param spoticon 景点图标
     * @return 景点图标
     */
    @Override
    public List<Spoticon> selectSpoticonList(Spoticon spoticon)
    {
        return spoticonMapper.selectSpoticonList(spoticon);
    }

    /**
     * 新增景点图标
     * 
     * @param spoticon 景点图标
     * @return 结果
     */
    @Override
    public int insertSpoticon(Spoticon spoticon)
    {
        return spoticonMapper.insertSpoticon(spoticon);
    }

    /**
     * 修改景点图标
     * 
     * @param spoticon 景点图标
     * @return 结果
     */
    @Override
    public int updateSpoticon(Spoticon spoticon)
    {
        return spoticonMapper.updateSpoticon(spoticon);
    }

    /**
     * 删除景点图标对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSpoticonByIds(String ids)
    {
        return spoticonMapper.deleteSpoticonByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除景点图标信息
     * 
     * @param id 景点图标ID
     * @return 结果
     */
    @Override
    public int deleteSpoticonById(Long id)
    {
        return spoticonMapper.deleteSpoticonById(id);
    }
}
