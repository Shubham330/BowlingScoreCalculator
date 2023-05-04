package com.bowling.Application;

import java.util.List;
import java.util.Scanner;

import com.bowling.Service.BowlingScoreCalculatorService;
import com.bowling.Service.PlayerRecordService;
import com.bowling.entity.BowlingScoreProfile;

class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of players: ");
		PlayerRecordService prs = new PlayerRecordService();
		BowlingScoreCalculatorService bscs = new BowlingScoreCalculatorService();
		int players = sc.nextInt();
		System.out.println("Enter Number of rounds: ");
		int rounds = sc.nextInt();
		List<BowlingScoreProfile> playerRecordList = prs.recordPlayers(players,rounds);

		for (int i = 1; i <= rounds; i++) {
			
			System.out.println("Round " + i);

			for (int j = 1; j <= players; j++) {

				System.out.println("Player " + j);
				System.out.println("Enter Score for first throw: ");
				int fistThrow = sc.nextInt();
				int seconfThrow = 0;
				int thirdThrow = 0;
				if (fistThrow != 10) {
					System.out.println("Enter Score for second throw: ");
					seconfThrow = sc.nextInt();
				}
				if(i==rounds) {
					if(fistThrow == 10) {
						System.out.println("Enter Score for second throw: ");
						seconfThrow = sc.nextInt();
						System.out.println("Enter Score for Third throw: ");
						thirdThrow  = sc.nextInt();						
					} if((fistThrow+seconfThrow)==10) {
						System.out.println("Enter Score for Third throw: ");
						thirdThrow = sc.nextInt();
					}
				}
				
				bscs.updateScore(playerRecordList, fistThrow, seconfThrow,i,j,thirdThrow);
			}

		}
		sc.close();
		System.out.println(playerRecordList.toString());

	}

}