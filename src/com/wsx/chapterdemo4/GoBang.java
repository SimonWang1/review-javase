package com.wsx.chapterdemo4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoBang {
	public static void main(String[] args) throws Exception{
		GoBang gb = new GoBang();
		gb.initBoard();
		gb.printBoard();
		//获取键盘输入的方法
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		//br.readLine():在键盘上输入一行内容按回车键，输入的内容被br读取
		while((inputStr = br.readLine()) != null){
			//将用户输入的字符串以逗号(,)作分割符，分隔成两个字符串
			String[] posStrArr = inputStr.split(",");
			//将两个字符串转换成用户下棋的坐标
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);
			//把对应数组元素赋值为"●"
			gb.board[yPos - 1][xPos - 1] = "●";
			gb.printBoard();
			System.out.println("请输入您下棋的坐标，应以(x,y)的格式：");
		}
	}
	
	//定义棋盘大小
	private static int BOARD_SIZE = 15;
	//定义二维数组当做棋盘
	private String[][] board;
	
	public void initBoard(){
		//初始化棋盘数组
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//把每个元素赋值为"+"，用于在控制台画出棋盘
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				board[i][j] = "+";
			}
		}
	}

	//在控制台输出棋盘的方法
	public void printBoard(){
		//打印每个数组元素
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				//打印数组之后不换行
				System.out.print(board[i][j]);
			}
			//每打印完一行数组元素后输出一个换行符
			System.out.print("\n");
		}
	}
}
