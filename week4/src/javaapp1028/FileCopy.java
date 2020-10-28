package javaapp1028;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {

	public static void main(String[] args) {
		//파일의 경로를 Path 클래스로 생성
		//현재 작업 디렉토리에 있는 13.IO.pdf 파일의 경로를 생성
		Path from = Paths.get("./13.IO.pdf");
		//동일한 이름으로 상위 디렉토리 경로를 생성
		Path to = Paths.get("../13.IO.pdf");
		//파일 복사
		try {
			Files.copy(from, to);
			System.out.println("복사 성공");
		} catch (IOException e) {
			System.out.printf("예외:%s\n");
			e.printStackTrace();
		}
	}

}
