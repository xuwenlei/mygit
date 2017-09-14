package com.entities;

public class Search {

	private Integer source;
	private Integer sourceId;
	private String siteName;

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

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public Search() {
		// TODO Auto-generated constructor stub
	}

	public Search(Integer source, Integer sourceId, String siteName) {
		super();
		this.source = source;
		this.sourceId = sourceId;
		this.siteName = siteName;
	}

	@Override
	public String toString() {
		return "Search [source=" + source + ", sourceId=" + sourceId + ", siteName=" + siteName + "]";
	}

}
