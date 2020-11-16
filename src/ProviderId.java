import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProviderId
/*{
	public ProviderId() {
	}
	static String s;
	public static void main(String [] sara) {
//		InputStreamReader s = new InputStreamReader(System.in);
		List<String> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			s = sc.next();
			l.add(s);

		}
		System.out.println(s);
		System.out.println(l.size());
		String[] strings = s.trim().split("\\s+");
		for(String string : strings) {
			System.out.println("-----------------------------------");
			System.out.println("Provider Id:  "+string);
			System.out.println("Template Name:  "+string+"TemplateProvider");
			System.out.println("-----------------------------------");
		}

	}
}*/
{
	private static String[] ocr;
	//max 100 provider id. if you want to increase just give dynamic value
	private static String prStrings[] = new String[100];
	private static int i=0;
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(!(s=br.readLine()).matches(".") /*|| (s=br.readLine()) != null*/){
			prStrings[i] = s;
			i++;
		}
		getList();
		br.close();
	}
	private static void getList() {

		Scanner sc = new Scanner(System.in);

		for(int t=0; t<i; t++) {
			System.out.println(t+" = "+prStrings[t]);
		}

		System.out.println("Be Alert !!!");
		System.out.println("Which templates are OCR templates. Enter the digits with space seperated");
		ocr = sc.nextLine().split(" ");
		sc.close();

		/*
		 for(String oString : ocr) {
			System.out.println(oString);
		}
		 */	

		for(int x=0; x<ocr.length; x++) {
			int t = Integer.parseInt(ocr[x]);
			System.out.println(prStrings[t]);
			System.out.println("-----------------------------------");
			System.out.println("Provider Id:  "+prStrings[t]);
			System.out.println("Template Name:  "+prStrings[t]+"OCRTemplateProvider");
			System.out.println("-----------------------------------\n");
			prStrings[t]=null;
		}

		for(String s: prStrings) {
			if(s != null) {
				System.out.println(s);
				System.out.println("-----------------------------------");
				System.out.println("Provider Id:  "+s);
				System.out.println("Template Name:  "+s+"TemplateProvider");
				System.out.println("-----------------------------------\n");
			}
		}
	}
}