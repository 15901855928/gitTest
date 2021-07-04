package com.ruoyi.test.mapper;

import java.util.List;
import com.ruoyi.test.domain.Listpage;

/**
 * 景点列表Mapper接口
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
public interface ListpageMapper 
{
    /**
     * 查询景点列表
     * 
     * @param id 景点列表ID
     * @return 景点列表
     */
    public Listpage selectListpageById(Long id);

    /**
     * 查询景点列表列表
     * 
     * @param listpage 景点列表
     * @return 景点列表集合
     */
    public List<Listpage> selectListpageList(Listpage listpage);

    /**
     * 新增景点列表
     * 
     * @param listpage 景点列表
     * @return 结果
     */
    public int insertListpage(Listpage listpage);

    /**
     * 修改景点列表
     * 
     * @param listpage 景点列表
     * @return 结果
     */
    public int updateListpage(Listpage listpage);

    /**
     * 删除景点列表
     * 
     * @param id 景点列表ID
     * @return 结果
     */
    public int deleteListpageById(Long id);

    /**
     * 批量删除景点列表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteListpageByIds(String[] ids);
}
