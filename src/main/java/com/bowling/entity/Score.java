package com.bowling.entity;

public class Score {

	public int round;
	
	public int totalScore;

	public int firstThrow;

	public int secondTrow;

	public int thirdThrow;

	public boolean isSpare;

	public boolean isStrike;

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getFirstThrow() {
		return firstThrow;
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}

	public int getThirdThrow() {
		return thirdThrow;
	}

	public void setThirdThrow(int thirdThrow) {
		this.thirdThrow = thirdThrow;
	}

	public int getSecondTrow() {
		return secondTrow;
	}
	
	

	public void setSecondTrow(int secondTrow) {
		this.secondTrow = secondTrow;
	}

	public boolean isSpare() {
		return isSpare;
	}

	public void setSpare(boolean isSpare) {
		this.isSpare = isSpare;
	}

	public boolean isStrike() {
		return isStrike;
	}

	public void setStrike(boolean isStrike) {
		this.isStrike = isStrike;
	}
	
	

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Score(int round, int totalScore, int firstThrow, int secondTrow , int thirdThrow, boolean isSpare, boolean isStrike) {
		this.round = round;
		this.totalScore = totalScore;
		this.firstThrow = firstThrow;
		this.secondTrow = secondTrow;
		this.thirdThrow = thirdThrow;
		this.isSpare = isSpare;
		this.isStrike = isStrike;
	}

	@Override
	public String toString() {
		return "Score [round=" + round + ", totalScore=" + totalScore + ", firstThrow=" + firstThrow + ", secondTrow="
				+ secondTrow + ", isSpare=" + isSpare + ", isStrike=" + isStrike + "]";
	}
	
	
	
	
}
