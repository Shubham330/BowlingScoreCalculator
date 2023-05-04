package com.bowling.entity;

import java.util.List;

public class BowlingScoreProfile {

	public int playerId;
	
	public List<Score> scoreList;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public List<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(List<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	

	public BowlingScoreProfile(int playerId, List<Score> scoreList) {
		this.playerId = playerId;
		this.scoreList = scoreList;
	}

	@Override
	public String toString() {
		return "BowlingScoreProfile [playerId=" + playerId + ", scoreList=" + scoreList + "]";
	}

	

}
