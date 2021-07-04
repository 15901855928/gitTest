package com.ruoyi.test.mapper;

import java.util.List;
import com.ruoyi.test.domain.Detail2;

/**
 * 景区详情Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-09
 */
public interface Detail2Mapper 
{
    /**
     * 查询景区详情
     * 
     * @param id 景区详情ID
     * @return 景区详情
     */
    public Detail2 selectDetail2ById(Long id);

    /**
     * 查询景区详情列表
     * 
     * @param detail2 景区详情
     * @return 景区详情集合
     */
    public List<Detail2> selectDetail2List(Detail2 detail2);

    /**
     * 新增景区详情
     * 
     * @param detail2 景区详情
     * @return 结果
     */
    public int insertDetail2(Detail2 detail2);

    /**
     * 修改景区详情
     * 
     * @param detail2 景区详情
     * @return 结果
     */
    public int updateDetail2(Detail2 detail2);

    /**
     * 删除景区详情
     * 
     * @param id 景区详情ID
     * @return 结果
     */
    public int deleteDetail2ById(Long id);

    /**
     * 批量删除景区详情
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDetail2ByIds(String[] ids);
}
