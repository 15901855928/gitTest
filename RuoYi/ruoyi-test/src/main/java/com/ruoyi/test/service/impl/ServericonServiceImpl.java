package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.ServericonMapper;
import com.ruoyi.test.domain.Servericon;
import com.ruoyi.test.service.IServericonService;
import com.ruoyi.common.core.text.Convert;

/**
 * 类目详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Service
public class ServericonServiceImpl implements IServericonService 
{
    @Autowired
    private ServericonMapper servericonMapper;

    /**
     * 查询类目详情
     * 
     * @param type 类目详情ID
     * @return 类目详情
     */
    @Override
    public Servericon selectServericonById(Long type)
    {
        return servericonMapper.selectServericonById(type);
    }

    /**
     * 查询类目详情列表
     * 
     * @param servericon 类目详情
     * @return 类目详情
     */
    @Override
    public List<Servericon> selectServericonList(Servericon servericon)
    {
        return servericonMapper.selectServericonList(servericon);
    }

    /**
     * 新增类目详情
     * 
     * @param servericon 类目详情
     * @return 结果
     */
    @Override
    public int insertServericon(Servericon servericon)
    {
        return servericonMapper.insertServericon(servericon);
    }

    /**
     * 修改类目详情
     * 
     * @param servericon 类目详情
     * @return 结果
     */
    @Override
    public int updateServericon(Servericon servericon)
    {
        return servericonMapper.updateServericon(servericon);
    }

    /**
     * 删除类目详情对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteServericonByIds(String ids)
    {
        return servericonMapper.deleteServericonByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除类目详情信息
     * 
     * @param type 类目详情ID
     * @return 结果
     */
    @Override
    public int deleteServericonById(Long type)
    {
        return servericonMapper.deleteServericonById(type);
    }
}
