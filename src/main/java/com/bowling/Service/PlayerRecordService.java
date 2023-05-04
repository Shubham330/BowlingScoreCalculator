package com.bowling.Service;

import java.util.ArrayList;
import java.util.List;

import com.bowling.entity.BowlingScoreProfile;
import com.bowling.entity.Score;

public class PlayerRecordService {
	
	public List recordPlayers(int noOfPlayers, int rounds) {

		List<BowlingScoreProfile> playerRecordList = new ArrayList<>();
		for(int i =1; i<=noOfPlayers;i++) {
			List<Score> scoreList = new ArrayList<Score>();
			for(int j=1;j<=rounds;j++) {
				scoreList.add(new Score(j, 0, 0, 0, 0, false, false));
			}
			BowlingScoreProfile profile = new BowlingScoreProfile(i, scoreList);
			playerRecordList.add(profile);
		}
			return playerRecordList;
	}

}
