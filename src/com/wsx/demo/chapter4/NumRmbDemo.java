package com.wsx.demo.chapter4;

import java.util.Arrays;

public class NumRmbDemo {
	// 将浮点型输入按小数点拆分成数组元素，并将整数部分转换成中文大写
	private String[] hanArr = {"零", "壹", "貳", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
	private String[] unitArr = {"拾", "佰", "仟", "萬"};

	public static void main(String[] args){
		NumRmbDemo nr = new NumRmbDemo();
		System.out.println(Arrays.toString(nr.divide(475786939.22)));
		System.out.println(nr.toHanStr("75498"));
	}
	
	// 将浮点值拆分成整数和小数两部分字符串
	private String[] divide(double num){
		// 将浮点型强转成long即得到整数部分
		long zheng = (long) num;
		// 浮点减去整数得到小数，小数乘1000取整得到三位小数
		long xiao = Math.round((num - zheng) * 1000);
		return new String[]{zheng + "", String.valueOf(xiao)};
	}
	
	// 将四位数字字符串变成汉字字符串
	private String toHanStr(String numStr){
		String result = "";
		int numLen = numStr.length();
		// 依次遍历
		for(int i = 0; i < numLen; i++){
			// char类型和int类型ASCII码相差48，相减即可转换,如'4'转换成4
			int num = numStr.charAt(i) - 48;
			// 如果不是最后一位数字且不为零，添加单位
			if(i != numLen - 1 && num != 0){
				result += hanArr[num] + unitArr[numLen - 2 - i];
			}
			// 否则不加单位
			else{
				result += hanArr[num];
			}
		}
		return result;
	}
}
