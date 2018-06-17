package formatStr;

public class Solution {
	public static void main(String[] args) {

		String str = "D ,on,ec       pharetra,arcu id eleifend .";

		System.out.println(format (str));

	}

	public static String format(String str) {

		str = str.replaceAll(" {2,}", " ");

		StringBuilder res = new StringBuilder(str);

		for (int i = 0; i < res.length(); i++) {
			if (res.substring(i).matches("\\p{Punct}[^ ].*")) {
				res.insert(i + 1, " ");
			}
			if (res.substring(i).matches(" \\p{Punct}.*")) {
				res.deleteCharAt(i--);
			}
		}
		
		return res.toString();
	}

}
