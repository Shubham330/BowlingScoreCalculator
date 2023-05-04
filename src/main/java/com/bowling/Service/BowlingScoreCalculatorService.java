package com.bowling.Service;

import java.util.List;

import com.bowling.entity.BowlingScoreProfile;
import com.bowling.entity.Score;

public class BowlingScoreCalculatorService {

	public void updateScore(List<BowlingScoreProfile> playerRecordList, int firstThrow, int secondTrow, int round,
			int player, int thirdThrow) {
		boolean strike = false, spare = false;
		BowlingScoreProfile bowlingScoreProfile = playerRecordList.stream().filter(p -> p.getPlayerId() == player)
				.findFirst().orElse(null);
		Score score = bowlingScoreProfile.getScoreList().stream().filter(p -> p.getRound() == round).findFirst()
				.orElse(null);
		score.setFirstThrow(firstThrow);
		score.setSecondTrow(secondTrow);
		score.setThirdThrow(thirdThrow);
		strike = isStrike(firstThrow, score);
		if (!strike) {
			spare = isSpare(firstThrow, secondTrow, score);
		}
		UpdateScoreForPreviousEntry(bowlingScoreProfile, round);
		if(round>1) {
			score.setTotalScore(bowlingScoreProfile.getScoreList().stream().filter(p -> p.getRound() == round-1).findFirst()
					.orElse(null).getTotalScore() + firstThrow + secondTrow+thirdThrow);
		} else {
			score.setTotalScore(firstThrow+secondTrow+thirdThrow);
		}

	}

	private void UpdateScoreForPreviousEntry(BowlingScoreProfile bowlingScoreProfile, int round) {

		if (round > 1) {
			Score score = bowlingScoreProfile.getScoreList().stream().filter(p -> p.getRound() == round - 1).findFirst()
					.orElse(null);
			if (score.isSpare) {
				score.setTotalScore(score.getTotalScore() + bowlingScoreProfile.getScoreList().stream()
						.filter(p -> p.getRound() == round).findFirst().orElse(null).getFirstThrow());
			} else if (score.isStrike) {
				score.setTotalScore(score.getTotalScore()
						+ bowlingScoreProfile.getScoreList().stream().filter(p -> p.getRound() == round).findFirst()
								.orElse(null).getFirstThrow()
						+ bowlingScoreProfile.getScoreList().stream().filter(p -> p.getRound() == round).findFirst()
								.orElse(null).getSecondTrow());
			}

		}

	}

	private boolean isStrike(int firstThrow, Score score) {
		if ((firstThrow) == 10) {

			score.setStrike(true);
			return true;
		}
		return false;
	}

	private boolean isSpare(int firstThrow, int secondTrow, Score score) {
		if ((firstThrow + secondTrow) == 10) {
			score.setSpare(true);
			return true;
		}
		return false;

	}

}
