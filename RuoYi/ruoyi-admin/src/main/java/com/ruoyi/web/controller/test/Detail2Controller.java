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
import com.ruoyi.test.domain.Detail2;
import com.ruoyi.test.service.IDetail2Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 景区详情Controller
 * 
 * @author ruoyi
 * @date 2021-04-09
 */
@Controller
@RequestMapping("/test/detail2")
public class Detail2Controller extends BaseController
{
    private String prefix = "test/detail2";

    @Autowired
    private IDetail2Service detail2Service;

    @RequiresPermissions("test:detail2:view")
    @GetMapping()
    public String detail2()
    {
        return prefix + "/detail2";
    }

    /**
     * 查询景区详情列表
     */
    @RequiresPermissions("test:detail2:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Detail2 detail2)
    {
        startPage();
        List<Detail2> list = detail2Service.selectDetail2List(detail2);
        return getDataTable(list);
    }

    /**
     * 导出景区详情列表
     */
    @RequiresPermissions("test:detail2:export")
    @Log(title = "景区详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Detail2 detail2)
    {
        List<Detail2> list = detail2Service.selectDetail2List(detail2);
        ExcelUtil<Detail2> util = new ExcelUtil<Detail2>(Detail2.class);
        return util.exportExcel(list, "detail2");
    }

    /**
     * 新增景区详情
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存景区详情
     */
    @RequiresPermissions("test:detail2:add")
    @Log(title = "景区详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestParam("ic") MultipartFile file, Detail2 detail2) throws IOException {
        // 上传文件路径
        String filePath = "C:\\Users\\Admin\\Desktop\\";
        // 上传并返回新文件名称
        String fileName = FileUploadUtils.upload(filePath, file);
        detail2.setIcon(fileName);
        return toAjax(detail2Service.insertDetail2(detail2));
    }

    /**
     * 修改景区详情
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Detail2 detail2 = detail2Service.selectDetail2ById(id);
        mmap.put("detail2", detail2);
        return prefix + "/edit";
    }

    /**
     * 修改保存景区详情
     */
    @RequiresPermissions("test:detail2:edit")
    @Log(title = "景区详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Detail2 detail2)
    {
        return toAjax(detail2Service.updateDetail2(detail2));
    }

    /**
     * 删除景区详情
     */
    @RequiresPermissions("test:detail2:remove")
    @Log(title = "景区详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(detail2Service.deleteDetail2ByIds(ids));
    }
}
