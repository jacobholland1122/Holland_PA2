import java.util.Scanner;

public class Holland_p3 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String[] topic = {"Music", "Phone", "Money", "Shoes", "Watch"};
		
		int [][]response = new int [topic.length][];
		int averageRate[] = new int [topic.length];
		String highestPointTopic = "";
		String lowestPointTopic = "";
		int highestPointTotal = 0;
		int lowestPointTotal = 0;
		int numOfRating;
		int i;
		int g;
		int people;
		
		for (i = 0; i < response.length; ++i) {
			response[i] = new int [10];
			for (g = 0; g < response[i].length; ++g) 
				response[i][g] = 0;
		}
		System.out.println("Enter the amount of people participating in the survey: ");
		people = scnr.nextInt();
		
		for (i = 0; i < people; ++i) {
			System.out.println("Rate each topic from a scale of 1 (least important) to 10 (most important) for each of the " + topic.length + " topics");
			for (g = 0; g < topic.length; ++g) {
				System.out.print(topic[g] + ":");
				numOfRating = scnr.nextInt();
				
				while (numOfRating < 1 || numOfRating > 10) {
					System.out.println("Rating should be between [1,10]");
					System.out.println(topic[g] + ":");
					numOfRating = scnr.nextInt();
				}
				
				response[g][numOfRating-1]++;
			}
		}
		for (i = 0; i < response.length; ++i) {
			averageRate[i] = 0;
			for (g = 0; g < response[i].length; ++g) 
				averageRate[i] += (response[i][g] * (g + 1));
			
					if (i == 0) {
						highestPointTotal = averageRate[i];
						lowestPointTotal = averageRate[i];
						highestPointTopic = topic[i];
						lowestPointTopic = topic[i];
					}
					else {
						if (averageRate[i] > highestPointTotal) {
							highestPointTopic = topic[i];
							highestPointTotal = averageRate[i];
						}
						if (averageRate[i] < lowestPointTotal) {
							lowestPointTopic = topic[i];
							lowestPointTotal = averageRate[i];
						}
					}
					averageRate[i] = averageRate[i] / people;
			}
		System.out.printf("\n");
		
		for (i = 0; i < 10; ++i) {
			System.out.printf("", (i + 1));
		}
		System.out.print("       1  2  3  4  5  6  7  8  9  10  Average Rating");
		System.out.println();
		
		for (i = 0; i < response.length; ++i) {
			System.out.printf("\n" + topic[i]);
			for (g = 0; g < response[i].length; ++g) 
				System.out.printf("  " + response[i][g]);
			
			System.out.printf("    " + averageRate[i]);
		}
		System.out.println();
		System.out.println("Hightest Point Total: " + highestPointTotal);
		System.out.println("Topic: " + highestPointTopic);
		System.out.println("Lowest Point Total: " + lowestPointTotal);
		System.out.println("Topic: " + lowestPointTopic);
		
		scnr.close();
				
	}	
}	

