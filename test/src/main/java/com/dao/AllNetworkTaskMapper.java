package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.entities.AllNetworkTask;

public interface AllNetworkTaskMapper {
	
	@Insert("insert into all_network_task (id,keyword,source,sourceId,platform,isCycle,siteName,timeEnd) "
			+ "values(#{allNetworkTask.id},#{allNetworkTask.keyword},#{allNetworkTask.source},#{allNetworkTask.sourceId},#{allNetworkTask.platform},"
			+ "#{allNetworkTask.isCycle},#{allNetworkTask.siteName},#{allNetworkTask.timeEnd})")
	public void save(@Param("allNetworkTask")AllNetworkTask allNetworkTask);
	
	@Select("select * from all_network_task")
	public List<AllNetworkTask> getAll();
	
}
