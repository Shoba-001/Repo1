package class3;

public class Split {
	public static void main(String args[]) {
		String program = "java@c++@python";
		String[] words = program.split("@");
		System.out.println(words[2]);
		System.out.println(words.length);
	}

}


