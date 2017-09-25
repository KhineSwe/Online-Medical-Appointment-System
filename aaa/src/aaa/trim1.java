package aaa;

public class trim1 {

	public static void main(String[] args) {
		System.out.println("aaa");
		String a="aaaa.jpg";
		System.out.println("test.jpg".replaceAll(".jpg+$", ""));
		String filename = "abc.def.ghi";

		String s = "123dance456";
		String[] split = s.split("dance");
		String firstSubString = split[0];
		String secondSubString = split[1];
		
		System.out.println("....."+firstSubString);
		
		// TODO Auto-generated method stub

	}

}
