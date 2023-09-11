package ch06;

import java.util.Scanner;

class bank{
    static void print9(){
        System.out.println("이용해 주셔서 고맙습니다^^");
    }
    static void print1(){
        System.out.println("계좌 선택 : 전메뉴=0  A=1  B=2  종료=9");
    }
    static void printElse(){
        System.err.println("오류 :( 처음 화면으로");
    }
    static void printMain(){
        System.out.println("메뉴 선택 : 1.입금  2.출금  9.종료");
    }
}
public class ATM {
	public static void main(String[] args) {
		 int A=0; int B=0;
	        Scanner sc = new Scanner(System.in);
	        while(true) {
	            bank.printMain();
	            int input = sc.nextInt();
	           
	            if(input==1) {
	                bank.print1();
	                input = sc.nextInt();
	                if(input==0) {
	                    continue;
	                }else if(input==1) {
	                    System.out.println("금액 입력 :");
	                    input = sc.nextInt();
	                    A=A+input;
	                    System.out.println("A잔액:"+A+" 총금액:"+(A+B));
	                    System.out.println("B잔액:"+B+" 총금액:"+(A+B));
	                }else if(input==2) {
	                    System.out.println("금액 입력 :");
	                    input = sc.nextInt();
	                    B=B+input;
	                    System.out.println("A잔액:"+A+" 총금액:"+(A+B));
	                    System.out.println("B잔액:"+B+" 총금액:"+(A+B));
	                }else if(input==9) {
	                    bank.print9();
	                    break;
	                }else {
	                    bank.printElse();
	                    continue;
	                }//
	            }else if(input==2) {
	                bank.print1();
	                input = sc.nextInt();
	                if(input==0) {
	                    continue;
	                }else if(input==1) {
	                    System.out.println("금액 입력 :");
	                    input = sc.nextInt();
	                    A=A-input;
	                    System.out.println("A잔액:"+A+" 총금액:"+(A+B));
	                    System.out.println("B잔액:"+B+" 총금액:"+(A+B));
	                }else if(input==2) {
	                    System.out.println("금액 입력 :");
	                    input = sc.nextInt();
	                    B=B-input;
	                    System.out.println("A잔액:"+A+" 총금액:"+(A+B));
	                    System.out.println("B잔액:"+B+" 총금액:"+(A+B));
	                }else if(input==9) {
	                    bank.print9();
	                    break;
	                }else {
	                    bank.printElse();
	                    continue;
	                }//
	           
	            }else if(input==9) {
	                bank.print9();
	                break;
	            }else {
	                bank.printElse();
	                continue;
	            }
	           
	           
	            }// end while true
	}
}
