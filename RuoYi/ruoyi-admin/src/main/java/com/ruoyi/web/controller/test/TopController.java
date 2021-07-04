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
import com.ruoyi.test.domain.Top;
import com.ruoyi.test.service.ITopService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 首页顶部图片Controller
 * 
 * @author ruoyi
 * @date 2021-03-30
 */
@Controller
@RequestMapping("/test/top")
public class TopController extends BaseController
{
    private String prefix = "test/top";

    @Autowired
    private ITopService topService;

    @RequiresPermissions("test:top:view")
    @GetMapping()
    public String top()
    {
        return prefix + "/top";
    }

    /**
     * 查询首页顶部图片列表
     */
    @RequiresPermissions("test:top:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Top top)
    {
        startPage();
        List<Top> list = topService.selectTopList(top);
        return getDataTable(list);
    }

    /**
     * 导出首页顶部图片列表
     */
    @RequiresPermissions("test:top:export")
    @Log(title = "首页顶部图片", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Top top)
    {
        List<Top> list = topService.selectTopList(top);
        ExcelUtil<Top> util = new ExcelUtil<Top>(Top.class);
        return util.exportExcel(list, "top");
    }

    /**
     * 新增首页顶部图片
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存首页顶部图片
     */
    @RequiresPermissions("test:top:add")
    @Log(title = "首页顶部图片", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave( @RequestParam("addr") MultipartFile addr,Top top) throws IOException {
        // 上传文件路径
        String filePath = RuoYiConfig.getUploadPath();
        // 上传并返回新文件名称
        String fileName = FileUploadUtils.upload(filePath, addr);
        String[] filenameList=fileName.split("/");
        String upload="upload";
        for(int i=3;i<filenameList.length;i++){
            upload=upload+"/"+filenameList[i];
        }
        top.setAddress(upload);
        return toAjax(topService.insertTop(top));
    }

    /**
     * 修改首页顶部图片
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Top top = topService.selectTopById(id);
        mmap.put("top", top);
        return prefix + "/edit";
    }

    /**
     * 修改保存首页顶部图片
     */
    @RequiresPermissions("test:top:edit")
    @Log(title = "首页顶部图片", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestParam("addr") MultipartFile addr,Top top) throws IOException {
        String filePath = RuoYiConfig.getUploadPath();
        // 上传并返回新文件名称
        String fileName = FileUploadUtils.upload(filePath, addr);
        top.setAddress(fileName);
        return toAjax(topService.updateTop(top));
    }

    /**
     * 删除首页顶部图片
     */
    @RequiresPermissions("test:top:remove")
    @Log(title = "首页顶部图片", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(topService.deleteTopByIds(ids));
    }
}
