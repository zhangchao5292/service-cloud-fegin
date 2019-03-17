package com.service.cloud.vo;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapperParam {
	private String serverCode;

	private Integer gameId;
	private List<Integer> gameIds;

	private Map<String, Object> params;

	private Integer start;
	private Integer size;

	private Date suffixDate;

	private String chargeTableSuffix = "";
	private String teamTableSuffix = "";
	private String goldTableSuffix = "";

	public MapperParam(String serverCode) {
		super();
		this.serverCode = serverCode;
		params = new HashMap<String, Object>();
	}

	public String getServerCode() {
		return serverCode;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public Integer getGameId() {
		return gameId;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	public void addParam(String key, Object value) {
		params.put(key, value);
	}

	public void addAll(Map<String, Object> param) {
		params.putAll(param);
	}

	public Integer getStart() {
		return start;
	}

	public Integer getSize() {
		return size;
	}

	public List<Integer> getGameIds() {
		return gameIds;
	}

	public void setGameIds(List<Integer> gameIds) {
		this.gameIds = gameIds;
	}

	public void setPage(Integer start, Integer size) {
		this.start = start;
		this.size = size;
	}

	public String getChargeTableSuffix() {
		return chargeTableSuffix;
	}

	public void setChargeTableSuffix(String chargeTableSuffix) {
		this.chargeTableSuffix = chargeTableSuffix;
	}

	public Date getSuffixDate() {
		return suffixDate;
	}

	public void setSuffixDate(Date suffixDate) {
		this.suffixDate = suffixDate;
	}

	public String getTeamTableSuffix() {
		return teamTableSuffix;
	}

	public void setTeamTableSuffix(String teamTableSuffix) {
		this.teamTableSuffix = teamTableSuffix;
	}

	public String getGoldTableSuffix() {
		return goldTableSuffix;
	}

	public void setGoldTableSuffix(String goldTableSuffix) {
		this.goldTableSuffix = goldTableSuffix;
	}
}
