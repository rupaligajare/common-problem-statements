package persistent;

		public class VowelConsonantCounter {
		    public static void main(String[] args) {
		        String inputString = "Hello World";
		        int vowelCount = 0;
		        int consonantCount = 0;

		   inputString = inputString.toLowerCase(); // Convert to lowercase for case-insensitive matching
		   for (int i = 0; i < inputString.length(); i++) {
		         char ch = inputString.charAt(i);
		         if (ch >= 'a' && ch <= 'z') { // Check if the character is an alphabet
		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		            vowelCount++;
		             } else {
		                    consonantCount++;
		                }
		            }
		        }

		        System.out.println("Vowels: " + vowelCount);
		        System.out.println("Consonants: " + consonantCount);
		    }
		}
