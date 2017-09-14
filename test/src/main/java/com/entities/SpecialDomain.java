package com.entities;

import java.util.Date;

public class SpecialDomain {
	private int mid;
	private String name;
	private String timeStart;
	private Date timeEnd;
	private String type;
	private String keywords;
	private String exclude_words;
	private String record_tablename;
	private String hotword_tablename;
	private String emotionword_tablename;
	private String index_tablename;
	private String label_tablename;
	private String lasttime;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getLabel_tablename() {
		return label_tablename;
	}

	public void setLabel_tablename(String label_tablename) {
		this.label_tablename = label_tablename;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getExclude_words() {
		return exclude_words;
	}

	public void setExclude_words(String exclude_words) {
		this.exclude_words = exclude_words;
	}

	public String getRecord_tablename() {
		return record_tablename;
	}

	public void setRecord_tablename(String record_tablename) {
		this.record_tablename = record_tablename;
	}

	public String getHotword_tablename() {
		return hotword_tablename;
	}

	public void setHotword_tablename(String hotword_tablename) {
		this.hotword_tablename = hotword_tablename;
	}

	public String getEmotionword_tablename() {
		return emotionword_tablename;
	}

	public void setEmotionword_tablename(String emotionword_tablename) {
		this.emotionword_tablename = emotionword_tablename;
	}

	public String getIndex_tablename() {
		return index_tablename;
	}

	public void setIndex_tablename(String index_tablename) {
		this.index_tablename = index_tablename;
	}

	public String getLasttime() {
		return lasttime;
	}

	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}

	@Override
	public String toString() {
		return "SpecialDomain [mid=" + mid + ", name=" + name + ", timeStart=" + timeStart + ", timeEnd=" + timeEnd
				+ ", type=" + type + ", keywords=" + keywords + ", exclude_words=" + exclude_words
				+ ", record_tablename=" + record_tablename + ", hotword_tablename=" + hotword_tablename
				+ ", emotionword_tablename=" + emotionword_tablename + ", index_tablename=" + index_tablename
				+ ", label_tablename=" + label_tablename + ", lasttime=" + lasttime + "]";
	}

}
