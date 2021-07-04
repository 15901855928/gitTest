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
import com.ruoyi.test.domain.Listpage;
import com.ruoyi.test.service.IListpageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 景点列表Controller
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Controller
@RequestMapping("/test/listpage")
public class ListpageController extends BaseController
{
    private String prefix = "test/listpage";

    @Autowired
    private IListpageService listpageService;

    @RequiresPermissions("test:listpage:view")
    @GetMapping()
    public String listpage()
    {
        return prefix + "/listpage";
    }

    /**
     * 查询景点列表列表
     */
    @RequiresPermissions("test:listpage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Listpage listpage)
    {
        startPage();
        List<Listpage> list = listpageService.selectListpageList(listpage);
        return getDataTable(list);
    }

    /**
     * 导出景点列表列表
     */
    @RequiresPermissions("test:listpage:export")
    @Log(title = "景点列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Listpage listpage)
    {
        List<Listpage> list = listpageService.selectListpageList(listpage);
        ExcelUtil<Listpage> util = new ExcelUtil<Listpage>(Listpage.class);
        return util.exportExcel(list, "listpage");
    }

    /**
     * 新增景点列表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存景点列表
     */
    @RequiresPermissions("test:listpage:add")
    @Log(title = "景点列表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Listpage listpage)
    {
        return toAjax(listpageService.insertListpage(listpage));
    }

    /**
     * 修改景点列表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Listpage listpage = listpageService.selectListpageById(id);
        mmap.put("listpage", listpage);
        return prefix + "/edit";
    }

    /**
     * 修改保存景点列表
     */
    @RequiresPermissions("test:listpage:edit")
    @Log(title = "景点列表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Listpage listpage)
    {
        return toAjax(listpageService.updateListpage(listpage));
    }

    /**
     * 删除景点列表
     */
    @RequiresPermissions("test:listpage:remove")
    @Log(title = "景点列表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(listpageService.deleteListpageByIds(ids));
    }
}
