package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Control {
	Battle bt = new Battle();

	public int CheckPoint(Data data) {
		if (data.playY != 8) { // 상
			if (data.playY + 1 == data.mon0Y && data.mon0X == data.playX) {
				return 1;
			}
			if (data.playY + 1 == data.mon1Y && data.mon1X == data.playX) {
				return 1;
			}
			if (data.playY + 1 == data.mon2Y && data.mon2X == data.playX) {
				return 1;
			}
			if (data.playY + 1 == data.mon3Y && data.mon3X == data.playX) {
				return 1;
			}
			if (data.playY + 1 == data.mon4Y && data.mon4X == data.playX) {
				return 1;
			}
			if (data.playY + 1 == data.mon5Y && data.mon5X == data.playX) {
				return 1;
			}
		}

		if (data.playY != 0) { // 하
			if (data.playY - 1 == data.mon0Y && data.mon0X == data.playX) {
				return 1;

			}
			if (data.playY - 1 == data.mon1Y && data.mon1X == data.playX) {
				return 1;

			}
			if (data.playY - 1 == data.mon2Y && data.mon2X == data.playX) {
				return 1;
			}
			if (data.playY - 1 == data.mon3Y && data.mon3X == data.playX) {
				return 1;

			}
			if (data.playY - 1 == data.mon4Y && data.mon4X == data.playX) {
				return 1;

			}
			if (data.playY - 1 == data.mon5Y && data.mon5X == data.playX) {
				return 1;

			}
		}

		if (data.playX != 0) { // 좌
			if (data.playX - 1 == data.mon0X && data.mon0Y == data.playY) {
				return 1;
			}
			if (data.playX - 1 == data.mon1X && data.mon1Y == data.playY) {
				return 1;
			}
			if (data.playX - 1 == data.mon2X && data.mon2Y == data.playY) {
				return 1;
			}
			if (data.playX - 1 == data.mon3X && data.mon3Y == data.playY) {
				return 1;
			}
			if (data.playX - 1 == data.mon4X && data.mon4Y == data.playY) {
				return 1;
			}
			if (data.playX - 1 == data.mon5X && data.mon5Y == data.playY) {
				return 1;
			}
		}

		if (data.playX != 9) { // 우
			if (data.playX + 1 == data.mon0X && data.mon0Y == data.playY) {
				return 1;
			}
			if (data.playX + 1 == data.mon1X && data.mon1Y == data.playY) {
				return 1;
			}
			if (data.playX + 1 == data.mon2X && data.mon2Y == data.playY) {
				return 1;
			}
			if (data.playX + 1 == data.mon3X && data.mon3Y == data.playY) {
				return 1;

			}
			if (data.playX + 1 == data.mon4X && data.mon4Y == data.playY) {
				return 1;
			}
			if (data.playX + 1 == data.mon5X && data.mon5Y == data.playY) {
				return 1;
			}
		}
		return 0;
	}

	public void PlayerMove(Data data, Gui ui) {
		ui.btnUp.addActionListener(new ActionListener() { // Up 버튼
			public void actionPerformed(ActionEvent e) {
				if (data.turn == 1) {
					if (data.playY == 8) {
						ui.addText("그쪽으로는 이동할 수 없습니다");
					} else {
						ui.setT(data.playX, data.playY, "");
						data.playY += 1;
						ui.setData(data);
						CheckPoint(data, ui);
						if (CheckPoint(data) == 0) {
							MonMove(data);
							ui.setData(data);
							CheckPoint(data, ui);
						} else {
							MonMove(data);
							ui.setData(data);
						}
					}
				}
			}
		});

		ui.btnDown.addActionListener(new ActionListener() { // Down 버튼
			public void actionPerformed(ActionEvent e) {
				if (data.turn == 1) {
					if (data.playY == 0) {
						ui.addText("그쪽으로는 이동할 수 없습니다");
					} else {
						ui.setT(data.playX, data.playY, "");
						data.playY -= 1;
						ui.setData(data);
						CheckPoint(data, ui);
						if (CheckPoint(data) == 0) {
							MonMove(data);
							ui.setData(data);
							CheckPoint(data, ui);
						}
						MonMove(data);
						ui.setData(data);
					}
				}
			}
		});

		ui.btnLeft.addActionListener(new ActionListener() { // Left 버튼
			public void actionPerformed(ActionEvent e) {
				if (data.turn == 1) {
					if (data.playX == 0) {
						ui.addText("그쪽으로는 이동할 수 없습니다");
					} else {
						ui.setT(data.playX, data.playY, "");
						data.playX -= 1;
						ui.setData(data);
						CheckPoint(data, ui);
						if (CheckPoint(data) == 0) {
							MonMove(data);
							ui.setData(data);
							CheckPoint(data, ui);
						}
						MonMove(data);
						ui.setData(data);
					}
				}
			}
		});

		ui.btnRight.addActionListener(new ActionListener() { // Right 버튼
			public void actionPerformed(ActionEvent e) {
				if (data.turn == 1) {
					if (data.playX == 9) {
						ui.addText("그쪽으로는 이동할 수 없습니다");
					} else {
						ui.setT(data.playX, data.playY, "");
						data.playX += 1;
						ui.setData(data);
						CheckPoint(data, ui);
						if (CheckPoint(data) == 0) {
							MonMove(data);
							ui.setData(data);
							CheckPoint(data, ui);
						}
						MonMove(data);
						ui.setData(data);
					}
				}
			}
		});

	}

	public void CheckPoint(Data data, Gui ui) {
		if (data.playY != 8) { // 상
			if (data.playY + 1 == data.mon0Y && data.mon0X == data.playX) {
				bt.run(data, 0, ui);

			}
			if (data.playY + 1 == data.mon1Y && data.mon1X == data.playX) {
				bt.run(data, 1, ui);

			}
			if (data.playY + 1 == data.mon2Y && data.mon2X == data.playX) {
				bt.run(data, 2, ui);

			}
			if (data.playY + 1 == data.mon3Y && data.mon3X == data.playX) {
				bt.run(data, 3, ui);

			}
			if (data.playY + 1 == data.mon4Y && data.mon4X == data.playX) {
				bt.run(data, 4, ui);

			}
			if (data.playY + 1 == data.mon5Y && data.mon5X == data.playX) {
				bt.run(data, 5, ui);

			}
		}

		if (data.playY != 0) { // 하
			if (data.playY - 1 == data.mon0Y && data.mon0X == data.playX) {
				bt.run(data, 0, ui);

			}
			if (data.playY - 1 == data.mon1Y && data.mon1X == data.playX) {
				bt.run(data, 1, ui);

			}
			if (data.playY - 1 == data.mon2Y && data.mon2X == data.playX) {
				bt.run(data, 2, ui);

			}
			if (data.playY - 1 == data.mon3Y && data.mon3X == data.playX) {
				bt.run(data, 3, ui);

			}
			if (data.playY - 1 == data.mon4Y && data.mon4X == data.playX) {
				bt.run(data, 4, ui);

			}
			if (data.playY - 1 == data.mon5Y && data.mon5X == data.playX) {
				bt.run(data, 5, ui);

			}
		}

		if (data.playX != 0) { // 좌
			if (data.playX - 1 == data.mon0X && data.mon0Y == data.playY) {
				bt.run(data, 0, ui);

			}
			if (data.playX - 1 == data.mon1X && data.mon1Y == data.playY) {
				bt.run(data, 1, ui);

			}
			if (data.playX - 1 == data.mon2X && data.mon2Y == data.playY) {
				bt.run(data, 2, ui);

			}
			if (data.playX - 1 == data.mon3X && data.mon3Y == data.playY) {
				bt.run(data, 3, ui);

			}
			if (data.playX - 1 == data.mon4X && data.mon4Y == data.playY) {
				bt.run(data, 4, ui);

			}
			if (data.playX - 1 == data.mon5X && data.mon5Y == data.playY) {
				bt.run(data, 5, ui);

			}
		}

		if (data.playX != 9) { // 우
			if (data.playX + 1 == data.mon0X && data.mon0Y == data.playY) {
				bt.run(data, 0, ui);
			}
			if (data.playX + 1 == data.mon1X && data.mon1Y == data.playY) {
				bt.run(data, 1, ui);
			}
			if (data.playX + 1 == data.mon2X && data.mon2Y == data.playY) {
				bt.run(data, 2, ui);
			}
			if (data.playX + 1 == data.mon3X && data.mon3Y == data.playY) {
				bt.run(data, 3, ui);

			}
			if (data.playX + 1 == data.mon4X && data.mon4Y == data.playY) {
				bt.run(data, 4, ui);

			}
			if (data.playX + 1 == data.mon5X && data.mon5Y == data.playY) {
				bt.run(data, 5, ui);

			}
		}
		if (data.playX == data.mon5X && data.mon5Y == data.playY) {
			bt.run(data, 5, ui);

		}

	}

//	public void bt.run(Data data, int i, Gui ui) {
//		data.turn = 2;
//		ui.btn1.setText("1. 공격");
//		ui.btn2.setText("2. 스킬 사용");
//		ui.btn3.setText("3. 아이템 사용");
//		ui.btn4.setText("4. 도망");
//		ui.addText("Me (" + data.playH + "/" + data.playM + ")   VS   Monster " + i + " (" + data.monStat[i][0] + "/"
//				+ data.monStat[i][1] + ")");
//		ui.btn1.addActionListener(new ActionListener() { // 1번 공격
//			public void actionPerformed(ActionEvent e) {
//				if (data.turn == 2) {
//					data.turn = 3;
//					ui.addText("공격!!");
//					ui.addText("Monster HP: -" + data.playAtk);
//					data.monStat[i][0] -= data.playAtk;
//					ui.addText("Moster 의 반격!!");
//					ui.addText("Me HP: -" + data.monStat[i][2]);
//					data.playH -= data.monStat[i][2];
//					ui.addText("Me (" + data.playH + "/" + data.playM + ")        Monster " + i + " ("
//							+ data.monStat[i][0] + "/" + data.monStat[i][1] + ")");
//					data.turn = 2;
//					if (data.monStat[i][0] <= 0) {
//						ui.addText("승리했습니다!");
//						switch (i) {// 승리시
//						case 0:
//							data.mon0Y = 9;
//							data.mon0X = 0;
//							break;
//						case 1:
//							data.mon1Y = 9;
//							data.mon1X = 1;
//							break;
//						case 2:
//							data.mon2Y = 9;
//							data.mon2X = 2;
//							break;
//						case 3:
//							data.mon3Y = 9;
//							data.mon3X = 3;
//							break;
//						case 4:
//							data.mon4Y = 9;
//							data.mon4X = 4;
//							break;
//						case 5:
//							data.mon5Y = 9;
//							data.mon5X = 5;
//							break;
//						}
//						data.turn = 1;
//						ui.btn1.removeActionListener(this);
//						ui.setData(data);
//					}
//
//				}
//			}
//		});
//		ui.btn2.addActionListener(new ActionListener() { // 2번 스킬
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		ui.btn3.addActionListener(new ActionListener() { // 3번 아이템
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		ui.btn4.addActionListener(new ActionListener() { // 4번 도망
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//
//	}

	public void Open(Data data) {

	}

	public void Atk(Data data) {

	}

	public void Skill(Data data) {

	}

	public void TurnOver(Data data) {

	}

//	01 02 03 04 05  5
//	12 13 14 15 4
//	23 24 25 3 
//	34 35 2
//	45 1         = 15

	public int SameCheck(Data data) {
		if ((data.mon0X == data.mon1X && data.mon0Y == data.mon1Y)
				|| (data.mon0X == data.mon2X && data.mon0Y == data.mon2Y)
				|| (data.mon0X == data.mon3X && data.mon0Y == data.mon3Y)
				|| (data.mon0X == data.mon4X && data.mon0Y == data.mon4Y)
				|| (data.mon0X == data.mon5X && data.mon0Y == data.mon5Y)
				|| (data.mon1X == data.mon2X && data.mon1Y == data.mon2Y)
				|| (data.mon1X == data.mon3X && data.mon1Y == data.mon3Y)
				|| (data.mon1X == data.mon4X && data.mon1Y == data.mon4Y)
				|| (data.mon1X == data.mon5X && data.mon1Y == data.mon5Y)
				|| (data.mon2X == data.mon3X && data.mon2Y == data.mon3Y)
				|| (data.mon2X == data.mon4X && data.mon2Y == data.mon4Y)
				|| (data.mon2X == data.mon5X && data.mon2Y == data.mon5Y)
				|| (data.mon3X == data.mon4X && data.mon3Y == data.mon4Y)
				|| (data.mon3X == data.mon5X && data.mon3Y == data.mon5Y)
				|| (data.mon4X == data.mon5X && data.mon4Y == data.mon5Y)) {
			return 9;
		} else
			return 0;
	}

	public void MonMove(Data data) {
		int rand;
		rand = (int) (Math.random() * 5);
		switch (rand) {
		case 0: // 상
			if (data.mon0Y == 9 || data.mon0Y == 8) {
				break;
			} else {
				data.mon0Y += 1;
				if (SameCheck(data) == 9) {
					data.mon0Y -= 1;
				}
				break;
			}
		case 1: // 하
			if (data.mon0Y == 9 || data.mon0Y == 0) {
				break;
			} else {
				data.mon0Y -= 1;
				if (SameCheck(data) == 9) {
					data.mon0Y += 1;
				}
				break;
			}
		case 2: // 좌
			if (data.mon0Y == 9 || data.mon0X == 0) {
				break;
			} else {
				data.mon0X -= 1;
				if (SameCheck(data) == 9) {
					data.mon0X += 1;
				}
				break;
			}
		case 3: // 우
			if (data.mon0Y == 9 || data.mon0X == 9) {
				break;
			} else {
				data.mon0X += 1;
				if (SameCheck(data) == 9) {
					data.mon0X -= 1;
				}
				break;
			}
		default:
			break;
		}

		rand = (int) (Math.random() * 5);
		switch (rand) {
		case 0: // 상
			if (data.mon1Y == 9 || data.mon1Y == 8) {
				break;
			} else {
				data.mon1Y += 1;
				if (SameCheck(data) == 9) {
					data.mon1Y -= 1;
				}
				break;
			}
		case 1: // 하
			if (data.mon1Y == 9 || data.mon1Y == 0) {
				break;
			} else {
				data.mon1Y -= 1;
				if (SameCheck(data) == 9) {
					data.mon1Y += 1;
				}
				break;
			}
		case 2: // 좌
			if (data.mon1Y == 9 || data.mon1X == 0) {
				break;
			} else {
				data.mon1X -= 1;
				if (SameCheck(data) == 9) {
					data.mon1X += 1;
				}
				break;
			}
		case 3: // 우
			if (data.mon1Y == 9 || data.mon1X == 9) {
				break;
			} else {
				data.mon1X += 1;
				if (SameCheck(data) == 9) {
					data.mon1X -= 1;
				}
				break;
			}
		default:
			break;
		}

		rand = (int) (Math.random() * 5);
		switch (rand) {
		case 0: // 상
			if (data.mon2Y == 9 || data.mon2Y == 8) {
				break;
			} else {
				data.mon2Y += 1;
				if (SameCheck(data) == 9) {
					data.mon2Y -= 1;
				}
				break;
			}
		case 1: // 하
			if (data.mon2Y == 9 || data.mon2Y == 0) {
				break;
			} else {
				data.mon2Y -= 1;
				if (SameCheck(data) == 9) {
					data.mon2Y += 1;
				}
				break;
			}
		case 2: // 좌
			if (data.mon2Y == 9 || data.mon2X == 0) {
				break;
			} else {
				data.mon2X -= 1;
				if (SameCheck(data) == 9) {
					data.mon2X += 1;
				}
				break;
			}
		case 3: // 우
			if (data.mon2Y == 9 || data.mon2X == 9) {
				break;
			} else {
				data.mon2X += 1;
				if (SameCheck(data) == 9) {
					data.mon2X -= 1;
				}
				break;
			}
		default:
			break;
		}

		rand = (int) (Math.random() * 5);
		switch (rand) {
		case 0: // 상
			if (data.mon3Y == 9 || data.mon3Y == 8) {
				break;
			} else {
				data.mon3Y += 1;
				if (SameCheck(data) == 9) {
					data.mon3Y -= 1;
				}
				break;
			}
		case 1: // 하
			if (data.mon3Y == 9 || data.mon3Y == 0) {
				break;
			} else {
				data.mon3Y -= 1;
				if (SameCheck(data) == 9) {
					data.mon3Y += 1;
				}
				break;
			}
		case 2: // 좌
			if (data.mon3Y == 9 || data.mon3X == 0) {
				break;
			} else {
				data.mon3X -= 1;
				if (SameCheck(data) == 9) {
					data.mon3X += 1;
				}
				break;
			}
		case 3: // 우
			if (data.mon3Y == 9 || data.mon3X == 9) {
				break;
			} else {
				data.mon3X += 1;
				if (SameCheck(data) == 9) {
					data.mon3X -= 1;
				}
				break;
			}
		default:
			break;
		}

		rand = (int) (Math.random() * 5);
		switch (rand) {
		case 0: // 상
			if (data.mon4Y == 9 || data.mon4Y == 8) {
				break;
			} else {
				data.mon4Y += 1;
				if (SameCheck(data) == 9) {
					data.mon4Y -= 1;
				}
				break;
			}
		case 1: // 하
			if (data.mon4Y == 9 || data.mon4Y == 0) {
				break;
			} else {
				data.mon4Y -= 1;
				if (SameCheck(data) == 9) {
					data.mon4Y += 1;
				}
				break;
			}
		case 2: // 좌
			if (data.mon4Y == 9 || data.mon4X == 0) {
				break;
			} else {
				data.mon4X -= 1;
				if (SameCheck(data) == 9) {
					data.mon4X += 1;
				}
				break;
			}
		case 3: // 우
			if (data.mon4Y == 9 || data.mon4X == 9) {
				break;
			} else {
				data.mon4X += 1;
				if (SameCheck(data) == 9) {
					data.mon4X -= 1;
				}
				break;
			}
		default:
			break;
		}
		rand = (int) (Math.random() * 5);
		switch (rand) {
		case 0: // 상
			if (data.mon5Y == 9 || data.mon5Y == 8) {
				break;
			} else {
				data.mon5Y += 1;
				if (SameCheck(data) == 9) {
					data.mon5Y -= 1;
				}
				break;
			}
		case 1: // 하
			if (data.mon5Y == 9 || data.mon5Y == 0) {
				break;
			} else {
				data.mon5Y -= 1;
				if (SameCheck(data) == 9) {
					data.mon5Y += 1;
				}
				break;
			}
		case 2: // 좌
			if (data.mon5Y == 9 || data.mon5X == 0) {
				break;
			} else {
				data.mon5X -= 1;
				if (SameCheck(data) == 9) {
					data.mon5X += 1;
				}
				break;
			}
		case 3: // 우
			if (data.mon5Y == 9 || data.mon5X == 9) {
				break;
			} else {
				data.mon5X += 1;
				if (SameCheck(data) == 9) {
					data.mon5X -= 1;
				}
				break;
			}
		default:
			break;
		}

	}

	public void MonAppear4(Data data) {
		int x = 0;
		int y = 0;

		y = (int) (Math.random() * 7 + 2);
		x = (int) (Math.random() * 8 + 2);
		data.mon0X = x;
		data.mon0Y = y;

		y = (int) (Math.random() * 7 + 2);
		x = (int) (Math.random() * 8 + 2);
		data.mon1X = x;
		data.mon1Y = y;

		y = (int) (Math.random() * 7 + 2);
		x = (int) (Math.random() * 8 + 2);
		data.mon2X = x;
		data.mon2Y = y;

		y = (int) (Math.random() * 7 + 2);
		x = (int) (Math.random() * 8 + 2);
		data.mon3X = x;
		data.mon3Y = y;
	}

}

class Battle extends Thread {
	public void bat(Data data, int i, Gui ui) {
		data.turn = 2;
		ui.btn1.setText("1. 공격");
		ui.btn2.setText("2. 스킬 사용");
		ui.btn3.setText("3. 아이템 사용");
		ui.btn4.setText("4. 도망");
		ui.addText("Me (" + data.playH + "/" + data.playM + ")   VS   Monster " + i + " (" + data.monStat[i][0] + "/"
				+ data.monStat[i][1] + ")");
		ui.btn1.addActionListener(new ActionListener() { // 1번 공격
			public void actionPerformed(ActionEvent e) {
				if (data.turn == 2) {
					data.turn = 3;
					ui.addText("공격!!");
					ui.addText("Monster HP: -" + data.playAtk);
					data.monStat[i][0] -= data.playAtk;
					ui.addText("Moster 의 반격!!");
					ui.addText("Me HP: -" + data.monStat[i][2]);
					data.playH -= data.monStat[i][2];
					ui.addText("Me (" + data.playH + "/" + data.playM + ")        Monster " + i + " ("
							+ data.monStat[i][0] + "/" + data.monStat[i][1] + ")");
					data.turn = 2;
					if (data.monStat[i][0] <= 0) {
						ui.addText("승리했습니다!");
						switch (i) {// 승리시
						case 0:
							data.mon0Y = 9;
							data.mon0X = 0;
							break;
						case 1:
							data.mon1Y = 9;
							data.mon1X = 1;
							break;
						case 2:
							data.mon2Y = 9;
							data.mon2X = 2;
							break;
						case 3:
							data.mon3Y = 9;
							data.mon3X = 3;
							break;
						case 4:
							data.mon4Y = 9;
							data.mon4X = 4;
							break;
						case 5:
							data.mon5Y = 9;
							data.mon5X = 5;
							break;
						}
						data.turn = 1;
						ui.btn1.removeActionListener(this);
						ui.setData(data);
					}

				}
			}
		});
		ui.btn2.addActionListener(new ActionListener() { // 2번 스킬
			public void actionPerformed(ActionEvent e) {
				if (data.turn == 2) {
					ui.addText("공격!!");
					ui.addText("Monster HP: -" + data.playAtk);
					data.monStat[i][0] -= data.playAtk;
					ui.addText("Moster 의 반격!!");
					ui.addText("Me HP: -" + data.monStat[i][2]);
					data.playH -= data.monStat[i][2];
					ui.addText("Me (" + data.playH + "/" + data.playM + ")        Monster " + i + " ("
							+ data.monStat[i][0] + "/" + data.monStat[i][1] + ")");
				}
			}
		});
		ui.btn3.addActionListener(new ActionListener() { // 3번 아이템
			public void actionPerformed(ActionEvent e) {
				if (data.turn == 2) {
					ui.addText("공격!!");
					ui.addText("Monster HP: -" + data.playAtk);
					data.monStat[i][0] -= data.playAtk;
					ui.addText("Me (" + data.playH + "/" + data.playM + ")        Monster " + i + " ("
							+ data.monStat[i][0] + "/" + data.monStat[i][1] + ")");

				}
			}
		});
		ui.btn4.addActionListener(new ActionListener() { // 4번 도망
			public void actionPerformed(ActionEvent e) {
				if (data.turn == 2) {

				}
			}
		});

	}

	public void run(Data data, int i, Gui ui) {
		bat(data, i, ui);
	}
}
