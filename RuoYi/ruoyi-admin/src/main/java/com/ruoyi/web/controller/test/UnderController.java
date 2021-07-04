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
import com.ruoyi.test.domain.Under;
import com.ruoyi.test.service.IUnderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 底部图片详情Controller
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Controller
@RequestMapping("/test/under")
public class UnderController extends BaseController
{
    private String prefix = "test/under";

    @Autowired
    private IUnderService underService;

    @RequiresPermissions("test:under:view")
    @GetMapping()
    public String under()
    {
        return prefix + "/under";
    }

    /**
     * 查询底部图片详情列表
     */
    @RequiresPermissions("test:under:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Under under)
    {
        startPage();
        List<Under> list = underService.selectUnderList(under);
        return getDataTable(list);
    }

    /**
     * 导出底部图片详情列表
     */
    @RequiresPermissions("test:under:export")
    @Log(title = "底部图片详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Under under)
    {
        List<Under> list = underService.selectUnderList(under);
        ExcelUtil<Under> util = new ExcelUtil<Under>(Under.class);
        return util.exportExcel(list, "under");
    }

    /**
     * 新增底部图片详情
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存底部图片详情
     */
    @RequiresPermissions("test:under:add")
    @Log(title = "底部图片详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Under under)
    {
        return toAjax(underService.insertUnder(under));
    }

    /**
     * 修改底部图片详情
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Under under = underService.selectUnderById(id);
        mmap.put("under", under);
        return prefix + "/edit";
    }

    /**
     * 修改保存底部图片详情
     */
    @RequiresPermissions("test:under:edit")
    @Log(title = "底部图片详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Under under)
    {
        return toAjax(underService.updateUnder(under));
    }

    /**
     * 删除底部图片详情
     */
    @RequiresPermissions("test:under:remove")
    @Log(title = "底部图片详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(underService.deleteUnderByIds(ids));
    }
}
