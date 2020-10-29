package javaapp1029;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableMain {

	public static void main(String[] args) {
		// User 데이터 생성
		User user = new User();
		user.setNum(1);
		user.setName("공승연");

		ArrayList<User> list = new ArrayList<User>();
		list.add(user);

		user = new User();
		user.setNum(2);
		user.setName("배수지");
		list.add(user);

		try {
			// 인스턴스 단위로 저장할 수 있는 스트림 인스턴스 생성
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./data.dat"));
			// 저장된 클래스의 구조를 알지 못하면 어떤 데이터가 저장되었는지 알지 못함
			// 응용프로그램은 이런식으로 데이터를 저장
			oos.writeObject(list);

			oos.close();

			// 인스턴스 단위로 읽 수 있는 스트림 인스턴스 생성
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./data.dat"));

			List<User> list1 = (ArrayList<User>)ois.readObject();
			for (User u : list) {
				System.out.printf("%s\n", u);
			}
			ois.close();

		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
