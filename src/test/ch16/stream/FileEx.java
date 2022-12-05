package test.ch16.stream;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/images"); // 파일 경로 객체 생성
		File file1 = new File("C:/Temp/file1.txt"); // 파일 경로 객체 생성
		File file2 = new File("C:/Temp/file2.txt"); // 파일 경로 객체 생성
		File file3 = new File("C:/Temp/file3.txt"); // 파일 경로 객체 생성

		
		// 디렉토리나 파일이 없으면 생성
		if (dir.exists() == false) { // 파일이 존재하는지 확인
			dir.mkdir(); // 디렉토리 생성
		} 
		if (file1.exists() == false) { // 파일이 존재하는지 확인
			file1.createNewFile(); // 디렉토리 생성
		} 
		if (file2.exists() == false) { // 파일이 존재하는지 확인
			file2.createNewFile(); // 디렉토리 생성
		} 
		if (file3.exists() == false) { // 파일이 존재하는지 확인
			file3.createNewFile(); // 디렉토리 생성
		} 

		// Temp 폴더의 파일, 폴더 리스트 출력
		File temp = new File("C:/Temp/");
		File[] contents = temp.listFiles(); // 해당 폴더에 있는 파일 리스트 객체 가져옴
		
		for(File file : contents) {
			if(file.isDirectory()) { // 폴더(디렉토리) 인지 판단
				System.out.println(file.getName());
			} else {
				System.out.println(file.getName());
			}
		}
	}

}
