package game2;

import java.io.Serializable;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Data implements Serializable { // 첫번재 두번째 배열 임의 수정
	int[][] monStat = { { 700, 0, 50, 0, 2 }, // 다람쥐
			{ 800, 0, 80, 1, 2 }, // 토끼
			{ 1000, 0, 120, 0, 3 }, // 사슴
			{ 1200, 0, 150, 1, 3 }, // 여우
			{ 1500, 0, 150, 4, 9 }, // 멧돼지
			{ 1500, 0, 200, 5, 9 }, // 늑대
			{ 1800, 0, 300, 6, 9 }, // 사자
			{ 1500, 0, 350, 7, 9 }, // 호랑이
			{ 2000, 0, 350, 8, 9 }, // 곰
			{ 3000, 0, 300, 9, 9 } }; // 코끼리
	// HP , MP ,Atk ,X,Y

	int[][] star = { { 0, 9 }, { 0, 9 }, { 0, 9 }, { 0, 9 }, { 0, 9 }, { 0, 9 }, { 0, 9 }, { 0, 9 }, { 0, 9 },
			{ 0, 9 } }; // X좌표, Y좌표
	int playX = 0;
	int playY = 0;
	int playAtk = 200;
	int playH = 1000;
	int playM = 0;
	int playMaxHp = 1000;
	int playReHp = 5;
	int playDef = 0;

	int potion = 0;
	int randomX = 0;
	int randomY = 9;
	int trigger = 0;
	int turn = 1;

	int[] redZone = new int[30];

}
