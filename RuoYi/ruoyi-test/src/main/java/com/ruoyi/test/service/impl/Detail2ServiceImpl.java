package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.Detail2Mapper;
import com.ruoyi.test.domain.Detail2;
import com.ruoyi.test.service.IDetail2Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 景区详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-09
 */
@Service
public class Detail2ServiceImpl implements IDetail2Service 
{
    @Autowired
    private Detail2Mapper detail2Mapper;

    /**
     * 查询景区详情
     * 
     * @param id 景区详情ID
     * @return 景区详情
     */
    @Override
    public Detail2 selectDetail2ById(Long id)
    {
        return detail2Mapper.selectDetail2ById(id);
    }

    /**
     * 查询景区详情列表
     * 
     * @param detail2 景区详情
     * @return 景区详情
     */
    @Override
    public List<Detail2> selectDetail2List(Detail2 detail2)
    {
        return detail2Mapper.selectDetail2List(detail2);
    }

    /**
     * 新增景区详情
     * 
     * @param detail2 景区详情
     * @return 结果
     */
    @Override
    public int insertDetail2(Detail2 detail2)
    {
        return detail2Mapper.insertDetail2(detail2);
    }

    /**
     * 修改景区详情
     * 
     * @param detail2 景区详情
     * @return 结果
     */
    @Override
    public int updateDetail2(Detail2 detail2)
    {
        return detail2Mapper.updateDetail2(detail2);
    }

    /**
     * 删除景区详情对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDetail2ByIds(String ids)
    {
        return detail2Mapper.deleteDetail2ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除景区详情信息
     * 
     * @param id 景区详情ID
     * @return 结果
     */
    @Override
    public int deleteDetail2ById(Long id)
    {
        return detail2Mapper.deleteDetail2ById(id);
    }
}
