package com.ruoyi.project.kerry_bu.mapper;

import java.util.List;
import com.ruoyi.project.kerry_bu.domain.KerryBuilding;

/**
 * 楼盘Mapper接口
 * 
 * @author ruoyi
 * @date 2020-07-01
 */
public interface KerryBuildingMapper 
{
    /**
     * 查询楼盘
     * 
     * @param id 楼盘ID
     * @return 楼盘
     */
    public KerryBuilding selectKerryBuildingById(Long id);

    /**
     * 查询楼盘列表
     * 
     * @param kerryBuilding 楼盘
     * @return 楼盘集合
     */
    public List<KerryBuilding> selectKerryBuildingList(KerryBuilding kerryBuilding);

    /**
     * 新增楼盘
     * 
     * @param kerryBuilding 楼盘
     * @return 结果
     */
    public int insertKerryBuilding(KerryBuilding kerryBuilding);

    /**
     * 修改楼盘
     * 
     * @param kerryBuilding 楼盘
     * @return 结果
     */
    public int updateKerryBuilding(KerryBuilding kerryBuilding);

    /**
     * 删除楼盘
     * 
     * @param id 楼盘ID
     * @return 结果
     */
    public int deleteKerryBuildingById(Long id);

    /**
     * 批量删除楼盘
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKerryBuildingByIds(Long[] ids);
}
