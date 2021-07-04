package com.ruoyi.test.mapper;

import java.util.List;
import com.ruoyi.test.domain.Servericon;

/**
 * 类目详情Mapper接口
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
public interface ServericonMapper 
{
    /**
     * 查询类目详情
     * 
     * @param type 类目详情ID
     * @return 类目详情
     */
    public Servericon selectServericonById(Long type);

    /**
     * 查询类目详情列表
     * 
     * @param servericon 类目详情
     * @return 类目详情集合
     */
    public List<Servericon> selectServericonList(Servericon servericon);

    /**
     * 新增类目详情
     * 
     * @param servericon 类目详情
     * @return 结果
     */
    public int insertServericon(Servericon servericon);

    /**
     * 修改类目详情
     * 
     * @param servericon 类目详情
     * @return 结果
     */
    public int updateServericon(Servericon servericon);

    /**
     * 删除类目详情
     * 
     * @param type 类目详情ID
     * @return 结果
     */
    public int deleteServericonById(Long type);

    /**
     * 批量删除类目详情
     * 
     * @param types 需要删除的数据ID
     * @return 结果
     */
    public int deleteServericonByIds(String[] types);
}
