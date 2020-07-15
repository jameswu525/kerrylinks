package com.ruoyi.project.kerry_bu.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.kerry_bu.domain.KerryBuilding;
import com.ruoyi.project.kerry_bu.service.IKerryBuildingService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 楼盘Controller
 * 
 * @author ruoyi
 * @date 2020-07-01
 */
@RestController
@RequestMapping("/kerry/building")
public class KerryBuildingController extends BaseController
{
    @Autowired
    private IKerryBuildingService kerryBuildingService;

    /**
     * 查询楼盘列表
     */
    @PreAuthorize("@ss.hasPermi('kerry:building:list')")
    @GetMapping("/list")
    public TableDataInfo list(KerryBuilding kerryBuilding)
    {
        startPage();
        List<KerryBuilding> list = kerryBuildingService.selectKerryBuildingList(kerryBuilding);
        return getDataTable(list);
    }

    /**
     * 导出楼盘列表
     */
    @PreAuthorize("@ss.hasPermi('kerry:building:export')")
    @Log(title = "楼盘", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(KerryBuilding kerryBuilding)
    {
        List<KerryBuilding> list = kerryBuildingService.selectKerryBuildingList(kerryBuilding);
        ExcelUtil<KerryBuilding> util = new ExcelUtil<KerryBuilding>(KerryBuilding.class);
        return util.exportExcel(list, "building");
    }

    /**
     * 获取楼盘详细信息
     */
    @PreAuthorize("@ss.hasPermi('kerry:building:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(kerryBuildingService.selectKerryBuildingById(id));
    }

    /**
     * 新增楼盘
     */
    @PreAuthorize("@ss.hasPermi('kerry:building:add')")
    @Log(title = "楼盘", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KerryBuilding kerryBuilding)
    {
        return toAjax(kerryBuildingService.insertKerryBuilding(kerryBuilding));
    }

    /**
     * 修改楼盘
     */
    @PreAuthorize("@ss.hasPermi('kerry:building:edit')")
    @Log(title = "楼盘", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KerryBuilding kerryBuilding)
    {
        return toAjax(kerryBuildingService.updateKerryBuilding(kerryBuilding));
    }

    /**
     * 删除楼盘
     */
    @PreAuthorize("@ss.hasPermi('kerry:building:remove')")
    @Log(title = "楼盘", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(kerryBuildingService.deleteKerryBuildingByIds(ids));
    }
}
