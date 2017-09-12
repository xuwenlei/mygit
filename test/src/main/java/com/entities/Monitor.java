package com.entities;

import java.util.Date;

public class Monitor {

	private Integer mid;
	private String name;
	private Date timeStart;
	private Date timeEnd;
	private String type;
	private String keywords;
	private String excludeWords;
	private String status;
	private Integer count;
	private Integer addCount;
	private String trend7days;
	private String recordTableName;
	private String hotwordTableName;
	private Double warningNegaPercent;
	private Integer warningNegaCount;
	private Integer warningCount;
	private String warningWord;
	private String warningResultDesc;
	private Integer pushMode;
	private String phoneNum;
	private String email;
	private Date lastTime;

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date gettimeStart() {
		return timeStart;
	}

	public void settimeStart(Date timeStart) {
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

	public String getExcludeWords() {
		return excludeWords;
	}

	public void setExcludeWords(String excludeWords) {
		this.excludeWords = excludeWords;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getAddCount() {
		return addCount;
	}

	public void setAddCount(Integer addCount) {
		this.addCount = addCount;
	}

	public String getTrend7days() {
		return trend7days;
	}

	public void setTrend7days(String trend7days) {
		this.trend7days = trend7days;
	}

	public String getRecordTableName() {
		return recordTableName;
	}

	public void setRecordTableName(String recordTableName) {
		this.recordTableName = recordTableName;
	}

	public String getHotwordTableName() {
		return hotwordTableName;
	}

	public void setHotwordTableName(String hotwordTableName) {
		this.hotwordTableName = hotwordTableName;
	}

	public Double getWarningNegaPercent() {
		return warningNegaPercent;
	}

	public void setWarningNegaPercent(Double warningNegaPercent) {
		this.warningNegaPercent = warningNegaPercent;
	}

	public Integer getWarningNegaCount() {
		return warningNegaCount;
	}

	public void setWarningNegaCount(Integer warningNegaCount) {
		this.warningNegaCount = warningNegaCount;
	}

	public Integer getWarningCount() {
		return warningCount;
	}

	public void setWarningCount(Integer warningCount) {
		this.warningCount = warningCount;
	}

	public String getWarningWord() {
		return warningWord;
	}

	public void setWarningWord(String warningWord) {
		this.warningWord = warningWord;
	}

	public String getWarningResultDesc() {
		return warningResultDesc;
	}

	public void setWarningResultDesc(String warningResultDesc) {
		this.warningResultDesc = warningResultDesc;
	}

	public Integer getPushMode() {
		return pushMode;
	}

	public void setPushMode(Integer pushMode) {
		this.pushMode = pushMode;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	@Override
	public String toString() {
		return "Monitor [mid=" + mid + ", name=" + name + ", timeStart=" + timeStart + ", timeEnd=" + timeEnd
				+ ", type=" + type + ", keywords=" + keywords + ", excludeWords=" + excludeWords + ", status=" + status
				+ ", count=" + count + ", addCount=" + addCount + ", trend7days=" + trend7days + ", recordTableName="
				+ recordTableName + ", hotwordTableName=" + hotwordTableName + ", warningNegaPercent="
				+ warningNegaPercent + ", warningNegaCount=" + warningNegaCount + ", warningCount=" + warningCount
				+ ", warningWord=" + warningWord + ", warningResultDesc=" + warningResultDesc + ", pushMode=" + pushMode
				+ ", phoneNum=" + phoneNum + ", email=" + email + ", lastTime=" + lastTime + "]";
	}

}
