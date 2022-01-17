package uppercase;

public class Upper {
	public static void main(String [] args)  {
		String data = "10 welcome to lab";
		String[] part = data.split(" ");
		int len= part.length;
		System.out.println(len);
		for(int i=0;i<len;i++) {
			System.out.println(part[i].toUpperCase());
		}
			
		}
	}

