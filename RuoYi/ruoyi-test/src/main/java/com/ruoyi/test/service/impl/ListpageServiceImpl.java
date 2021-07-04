package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.ListpageMapper;
import com.ruoyi.test.domain.Listpage;
import com.ruoyi.test.service.IListpageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 景点列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Service
public class ListpageServiceImpl implements IListpageService 
{
    @Autowired
    private ListpageMapper listpageMapper;

    /**
     * 查询景点列表
     * 
     * @param id 景点列表ID
     * @return 景点列表
     */
    @Override
    public Listpage selectListpageById(Long id)
    {
        return listpageMapper.selectListpageById(id);
    }

    /**
     * 查询景点列表列表
     * 
     * @param listpage 景点列表
     * @return 景点列表
     */
    @Override
    public List<Listpage> selectListpageList(Listpage listpage)
    {
        return listpageMapper.selectListpageList(listpage);
    }

    /**
     * 新增景点列表
     * 
     * @param listpage 景点列表
     * @return 结果
     */
    @Override
    public int insertListpage(Listpage listpage)
    {
        return listpageMapper.insertListpage(listpage);
    }

    /**
     * 修改景点列表
     * 
     * @param listpage 景点列表
     * @return 结果
     */
    @Override
    public int updateListpage(Listpage listpage)
    {
        return listpageMapper.updateListpage(listpage);
    }

    /**
     * 删除景点列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteListpageByIds(String ids)
    {
        return listpageMapper.deleteListpageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除景点列表信息
     * 
     * @param id 景点列表ID
     * @return 结果
     */
    @Override
    public int deleteListpageById(Long id)
    {
        return listpageMapper.deleteListpageById(id);
    }
}
