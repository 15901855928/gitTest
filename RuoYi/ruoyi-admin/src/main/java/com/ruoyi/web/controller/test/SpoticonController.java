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
import com.ruoyi.test.domain.Spoticon;
import com.ruoyi.test.service.ISpoticonService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 景点图标Controller
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Controller
@RequestMapping("/test/spoticon")
public class SpoticonController extends BaseController
{
    private String prefix = "test/spoticon";

    @Autowired
    private ISpoticonService spoticonService;

    @RequiresPermissions("test:spoticon:view")
    @GetMapping()
    public String spoticon()
    {
        return prefix + "/spoticon";
    }

    /**
     * 查询景点图标列表
     */
    @RequiresPermissions("test:spoticon:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Spoticon spoticon)
    {
        startPage();
        List<Spoticon> list = spoticonService.selectSpoticonList(spoticon);
        return getDataTable(list);
    }

    /**
     * 导出景点图标列表
     */
    @RequiresPermissions("test:spoticon:export")
    @Log(title = "景点图标", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Spoticon spoticon)
    {
        List<Spoticon> list = spoticonService.selectSpoticonList(spoticon);
        ExcelUtil<Spoticon> util = new ExcelUtil<Spoticon>(Spoticon.class);
        return util.exportExcel(list, "spoticon");
    }

    /**
     * 新增景点图标
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存景点图标
     */
    @RequiresPermissions("test:spoticon:add")
    @Log(title = "景点图标", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Spoticon spoticon)
    {
        return toAjax(spoticonService.insertSpoticon(spoticon));
    }

    /**
     * 修改景点图标
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Spoticon spoticon = spoticonService.selectSpoticonById(id);
        mmap.put("spoticon", spoticon);
        return prefix + "/edit";
    }

    /**
     * 修改保存景点图标
     */
    @RequiresPermissions("test:spoticon:edit")
    @Log(title = "景点图标", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Spoticon spoticon)
    {
        return toAjax(spoticonService.updateSpoticon(spoticon));
    }

    /**
     * 删除景点图标
     */
    @RequiresPermissions("test:spoticon:remove")
    @Log(title = "景点图标", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(spoticonService.deleteSpoticonByIds(ids));
    }
}
