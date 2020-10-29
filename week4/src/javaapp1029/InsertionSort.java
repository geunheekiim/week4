package javaapp1029;

public class InsertionSort {

	public static void main(String[] args) {
		int[] data = { 5, 3, 8, 4, 9, 1, 6, 2, 7 };
		// 정렬하기 전에 데이터를 출력
		for (int imsi : data) {
			System.out.printf("%5d", imsi);
		}
		System.out.printf("\n");
		
		//2번째 데이터부터 마지막 데이터까지
		for(int i=2; i<data.length; i=i+1) {
			//데이터 복사
			int key = data[i];
			//바로 앞에서부터 맨 앞까지
			int j = i-1;
			for(; j>=0; j=j-1) {
				//삽입한 데이터가 더 크면 비교 종료 
				if(key > data[j]) {
					break;
				//비교되는 데이터가 더 크면 비교되는 데이터를 다음칸으로 복사
				}else {
					data[j+1] = data[j];
				}
			}
			//비교가 종료되면 key의 데이터를 종료된 다음에 복사
			data[j+1] = key;
			
			//각 pass 마다 과정을 출력
			for (int imsi : data) {
				System.out.printf("%5d", imsi);
			}
			System.out.printf("\n");
		}
		
	}

}
