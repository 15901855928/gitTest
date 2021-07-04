package com.ruoyi.test.mapper;

import java.util.List;
import com.ruoyi.test.domain.Spoticon;

/**
 * 景点图标Mapper接口
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
public interface SpoticonMapper 
{
    /**
     * 查询景点图标
     * 
     * @param id 景点图标ID
     * @return 景点图标
     */
    public Spoticon selectSpoticonById(Long id);

    /**
     * 查询景点图标列表
     * 
     * @param spoticon 景点图标
     * @return 景点图标集合
     */
    public List<Spoticon> selectSpoticonList(Spoticon spoticon);

    /**
     * 新增景点图标
     * 
     * @param spoticon 景点图标
     * @return 结果
     */
    public int insertSpoticon(Spoticon spoticon);

    /**
     * 修改景点图标
     * 
     * @param spoticon 景点图标
     * @return 结果
     */
    public int updateSpoticon(Spoticon spoticon);

    /**
     * 删除景点图标
     * 
     * @param id 景点图标ID
     * @return 结果
     */
    public int deleteSpoticonById(Long id);

    /**
     * 批量删除景点图标
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSpoticonByIds(String[] ids);
}
