// Input any crypted text in str and you will get all possible plain text.

public class Main
{
	public static void main(String[] args) {
	String str = "khoormdyd";
    char[] ch = new char[str.length()];
    for(int j =0 ; j<26;j++)
    {
    for (int i = 0; i < str.length(); i++) { 
            int ascii = (int)str.charAt(i) - j;
            if(ascii<97)
            {
                ascii = ascii+26;
            }
            
            char c = (char)ascii;
            System.out.print(c);
    }
    System.out.println("");
        } 
	}
}
