package com.dhcc.demp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.dhcc")//注意不要直接写到controller，，因为还要注入service
@MapperScan("com.dhcc.dao")
public class DemoApplication {

	public static void main(String[] args) {
		float money = get(100,200000);
		System.out.println("money = " + money);
//		SpringApplication.run(DemoApplication.class, args);
	}

	public  static  float get(int day,float money){
		//总钱数
		float sumMoney = 0;
		//一年时间
		int year = 360;
		//倍率临界点
		float critical = 0.12f;
		//初始倍率
		float a = 0.05f;
		//时间段
		int timeSlot = 30;
		//小于等于90天的钱
		if(day<=90) {
			sumMoney = money * a * day / year;
		}else{
			//前90天的钱
			System.out.println("<=12%--->  "+money+" * "+a+" * "+90+" / "+year+" = " + money * a * 90 / year);
			sumMoney = money * a * 90 / year;
			//日期天数
			day = day-90;
			//余处的天数
			int surplus = day%timeSlot;
			//倍率次数
			int count = day/timeSlot;
			//循环算出倍率
			for(int i=0;i<count;i++){
				a = a*0.2f+a;
				//如果倍率大于等于12%，则以后都为12%
				if(a>=critical){
					System.out.println(">12%--->  "+sumMoney+" + "+money+" * "+critical+" * "+timeSlot+" / "+year+" = " + (sumMoney+money*critical*timeSlot/year));
					sumMoney = sumMoney+money*critical*timeSlot/year;
				}else{
					System.out.println("<=12%--->  "+sumMoney+" + "+money+" * "+a+" * "+timeSlot+" / "+year+" = " + (sumMoney+money*a*timeSlot/year));
					sumMoney = sumMoney+money*a*timeSlot/year;
				}
			}
			//将多余的天数加上倍率在加上天数
			if(surplus!=0){
				a = a*0.2f+a;
				if(a>=critical){
					System.out.println(">12%--->  "+sumMoney+" + "+money+" * "+critical+" * "+surplus+" / "+year+" = " + (sumMoney+money*critical*surplus/year));
					sumMoney = sumMoney+money*critical*surplus/year;
				}else{
					System.out.println("<=12%--->  "+sumMoney+" + "+money+" * "+a+" * "+surplus+" / "+year+" = " + (sumMoney+money*a*surplus/year));
					sumMoney = sumMoney+money*a*surplus/year;
				}
			}
		}
		return sumMoney;
	}
}
