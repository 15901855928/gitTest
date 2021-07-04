package com.ruoyi.web.controller.test;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.test.domain.Servericon;
import com.ruoyi.test.service.IServericonService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 类目详情Controller
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Controller
@RequestMapping("/test/servericon")
public class ServericonController extends BaseController
{
    private String prefix = "test/servericon";

    @Autowired
    private IServericonService servericonService;

    @RequiresPermissions("test:servericon:view")
    @GetMapping()
    public String servericon()
    {
        return prefix + "/servericon";
    }

    /**
     * 查询类目详情列表
     */
    @RequiresPermissions("test:servericon:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Servericon servericon)
    {
        startPage();
        List<Servericon> list = servericonService.selectServericonList(servericon);
        return getDataTable(list);
    }

    /**
     * 导出类目详情列表
     */
    @RequiresPermissions("test:servericon:export")
    @Log(title = "类目详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Servericon servericon)
    {
        List<Servericon> list = servericonService.selectServericonList(servericon);
        ExcelUtil<Servericon> util = new ExcelUtil<Servericon>(Servericon.class);
        return util.exportExcel(list, "servericon");
    }

    /**
     * 新增类目详情
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存类目详情
     */
    @RequiresPermissions("test:servericon:add")
    @Log(title = "类目详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Servericon servericon)
    {
        return toAjax(servericonService.insertServericon(servericon));
    }

    /**
     * 修改类目详情
     */
    @GetMapping("/edit/{type}")
    public String edit(@PathVariable("type") Long type, ModelMap mmap)
    {
        Servericon servericon = servericonService.selectServericonById(type);
        mmap.put("servericon", servericon);
        return prefix + "/edit";
    }

    /**
     * 修改保存类目详情
     */
    @RequiresPermissions("test:servericon:edit")
    @Log(title = "类目详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Servericon servericon)
    {
        return toAjax(servericonService.updateServericon(servericon));
    }

    /**
     * 删除类目详情
     */
    @RequiresPermissions("test:servericon:remove")
    @Log(title = "类目详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(servericonService.deleteServericonByIds(ids));
    }
}
