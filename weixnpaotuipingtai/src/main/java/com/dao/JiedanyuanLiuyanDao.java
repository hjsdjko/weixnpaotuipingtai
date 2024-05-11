package com.dao;

import com.entity.JiedanyuanLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiedanyuanLiuyanView;

/**
 * 跑腿员评论 Dao 接口
 *
 * @author 
 */
public interface JiedanyuanLiuyanDao extends BaseMapper<JiedanyuanLiuyanEntity> {

   List<JiedanyuanLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
