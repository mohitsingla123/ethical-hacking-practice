import java.util.Scanner;
import java.lang.Math; 

public class Encrypt  
{ 
static void getKeyMatrix(String key, int keyMatrix[][]) 
{ 
    int k = 0; 
    int len = key.length();
    int p =(int)Math.sqrt(len);
    for (int i = 0; i < p; i++)  
    { 
        for (int j = 0; j < p; j++)  
        { 
            keyMatrix[i][j] = (key.charAt(k)) % 65; 
            k++; 
        } 
    } 
} 
  static void encrypt(int cipherMatrix[][], 
            int keyMatrix[][],  
            int messageVector[][],int len) 
{ 
    int x, i, j; 
    for (i = 0; i < len; i++)  
    { 
        for (j = 0; j < 1; j++) 
        { 
            cipherMatrix[i][j] = 0; 
          
            for (x = 0; x < len; x++) 
            { 
                cipherMatrix[i][j] +=  
                    keyMatrix[i][x] * messageVector[x][j]; 
            } 
          
            cipherMatrix[i][j] = cipherMatrix[i][j] % 26; 
        } 
    } 
} 
  
static void HillCipher(String message, String key) 
{ 
    int len = message.length();
    int [][]keyMatrix = new int[len][len]; 
    getKeyMatrix(key, keyMatrix); 
  
    int [][]messageVector = new int[len][1]; 
  
    for (int i = 0; i < len; i++) 
        messageVector[i][0] = (message.charAt(i)) % 65; 
  
    int [][]cipherMatrix = new int[len][1]; 
  
    encrypt(cipherMatrix, keyMatrix, messageVector,len); 
  
    String CipherText=""; 
  
    for (int i = 0; i < len; i++) 
        CipherText += (char)(cipherMatrix[i][0] + 65); 
  
    System.out.print(" Ciphertext : " + CipherText); 
} 
  
public static void main(String[] args)  
{ 
    Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter the Message you want to encrypt in capital letters");
    String message = scan.nextLine();
    System.out.println("Please Enter the Keyt in capital letters");
    String key = scan.nextLine();
    HillCipher(message, key); 
    } 
} 