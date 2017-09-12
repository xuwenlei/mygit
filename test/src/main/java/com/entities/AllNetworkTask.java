package com.entities;

import java.util.Date;

public class AllNetworkTask {

	private Integer id;
	private String keyword;
	private Integer source;
	private Integer sourceId;
	private Integer platform;
	private Integer isCycle;
	private String siteName;
	private Date timeEnd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public Integer getIsCycle() {
		return isCycle;
	}

	public void setIsCycle(Integer isCycle) {
		this.isCycle = isCycle;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public AllNetworkTask() {
		// TODO Auto-generated constructor stub
	}

	public AllNetworkTask(Integer id, String keyword, Integer source, Integer sourceId, Integer platform,
			Integer isCycle, String siteName, Date timeEnd) {
		super();
		this.id = id;
		this.keyword = keyword;
		this.source = source;
		this.sourceId = sourceId;
		this.platform = platform;
		this.isCycle = isCycle;
		this.siteName = siteName;
		this.timeEnd = timeEnd;
	}

	@Override
	public String toString() {
		return "AllNetworkTask [id=" + id + ", keyword=" + keyword + ", source=" + source + ", sourceId=" + sourceId
				+ ", platform=" + platform + ", isCycle=" + isCycle + ", siteName=" + siteName + ", timeEnd=" + timeEnd
				+ "]";
	}

}
