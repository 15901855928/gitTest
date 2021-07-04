package com.ruoyi.web.controller.test;

import java.io.IOException;
import java.util.List;

import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.utils.file.FileUploadUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.test.domain.Class2;
import com.ruoyi.test.service.IClass2Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 商铺类别详情Controller
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Controller
@RequestMapping("/test/class2")
public class Class2Controller extends BaseController
{
    private String prefix = "test/class2";

    @Autowired
    private IClass2Service class2Service;

    @RequiresPermissions("test:class2:view")
    @GetMapping()
    public String class2()
    {
        return prefix + "/class2";
    }

    /**
     * 查询商铺类别详情列表
     */
    @RequiresPermissions("test:class2:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Class2 class2)
    {
        startPage();
        List<Class2> list = class2Service.selectClass2List(class2);
        return getDataTable(list);
    }

    /**
     * 导出商铺类别详情列表
     */
    @RequiresPermissions("test:class2:export")
    @Log(title = "商铺类别详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Class2 class2)
    {
        List<Class2> list = class2Service.selectClass2List(class2);
        ExcelUtil<Class2> util = new ExcelUtil<Class2>(Class2.class);
        return util.exportExcel(list, "class2");
    }

    /**
     * 新增商铺类别详情
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商铺类别详情
     */
    @RequiresPermissions("test:class2:add")
    @Log(title = "商铺类别详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Class2 class2)
    {
        return toAjax(class2Service.insertClass2(class2));
    }

    /**
     * 修改商铺类别详情
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Class2 class2 = class2Service.selectClass2ById(id);
        mmap.put("class2", class2);
        return prefix + "/edit";
    }

    /**
     * 修改保存商铺类别详情
     */
    @RequiresPermissions("test:class2:edit")
    @Log(title = "商铺类别详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestParam("sp") MultipartFile sp,@RequestParam("lb") MultipartFile lb ,Class2 class2) throws IOException {
//        String filePath = "/home/ubuntu/zoofacestatic/yitian/class";
        String filePath = RuoYiConfig.getUploadPath();
        String sppath = FileUploadUtils.upload(filePath, sp);
        String lbpath = FileUploadUtils.upload(filePath, lb);
        class2.setChildpic("http://"+sppath);
        class2.setPic(lbpath);
        return toAjax(class2Service.updateClass2(class2));
    }

    /**
     * 删除商铺类别详情
     */
    @RequiresPermissions("test:class2:remove")
    @Log(title = "商铺类别详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(class2Service.deleteClass2ByIds(ids));
    }
}
