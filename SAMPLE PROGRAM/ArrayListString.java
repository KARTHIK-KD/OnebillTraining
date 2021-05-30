import java.util.ArrayList;

public class ArrayListString {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("i ");
		arrayList.add("love ");
		arrayList.add("India");
		
		String[] str=new String[arrayList.size()];
		for(int i=0;i<arrayList.size();i++)
			str[i]=arrayList.get(i);
		for(String x:str)
			System.out.println(x);
	}

}
