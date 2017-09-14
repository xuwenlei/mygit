package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.entities.SpecialDomain;

public interface SpecialMapper {
	@Select("SELECT `mid`, `name`, `timeStart`, `timeEnd`, `type`, `keywords`, `exclude_words`, `record_tablename`, `hotword_tablename`, `emotionword_tablename`, `label_tablename`, `lasttime` FROM `special` where timeEnd>now()")
	public List<SpecialDomain> getSpecial();

}
