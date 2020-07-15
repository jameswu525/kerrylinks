package com.ruoyi.project.kerry_bu.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.kerry_bu.mapper.KerryBuildingMapper;
import com.ruoyi.project.kerry_bu.domain.KerryBuilding;
import com.ruoyi.project.kerry_bu.service.IKerryBuildingService;

/**
 * 楼盘Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-07-01
 */
@Service
public class KerryBuildingServiceImpl implements IKerryBuildingService 
{
    @Autowired
    private KerryBuildingMapper kerryBuildingMapper;

    /**
     * 查询楼盘
     * 
     * @param id 楼盘ID
     * @return 楼盘
     */
    @Override
    public KerryBuilding selectKerryBuildingById(Long id)
    {
        return kerryBuildingMapper.selectKerryBuildingById(id);
    }

    /**
     * 查询楼盘列表
     * 
     * @param kerryBuilding 楼盘
     * @return 楼盘
     */
    @Override
    public List<KerryBuilding> selectKerryBuildingList(KerryBuilding kerryBuilding)
    {
        return kerryBuildingMapper.selectKerryBuildingList(kerryBuilding);
    }

    /**
     * 新增楼盘
     * 
     * @param kerryBuilding 楼盘
     * @return 结果
     */
    @Override
    public int insertKerryBuilding(KerryBuilding kerryBuilding)
    {
        return kerryBuildingMapper.insertKerryBuilding(kerryBuilding);
    }

    /**
     * 修改楼盘
     * 
     * @param kerryBuilding 楼盘
     * @return 结果
     */
    @Override
    public int updateKerryBuilding(KerryBuilding kerryBuilding)
    {
        return kerryBuildingMapper.updateKerryBuilding(kerryBuilding);
    }

    /**
     * 批量删除楼盘
     * 
     * @param ids 需要删除的楼盘ID
     * @return 结果
     */
    @Override
    public int deleteKerryBuildingByIds(Long[] ids)
    {
        return kerryBuildingMapper.deleteKerryBuildingByIds(ids);
    }

    /**
     * 删除楼盘信息
     * 
     * @param id 楼盘ID
     * @return 结果
     */
    @Override
    public int deleteKerryBuildingById(Long id)
    {
        return kerryBuildingMapper.deleteKerryBuildingById(id);
    }
}
