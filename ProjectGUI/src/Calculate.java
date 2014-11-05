/*
 * extends the properties of Class GUI into Class Calculate
 * csc200
 * EloheYonas
 * 
 */
public class Calculate extends GUI {
	
	public static double calscore(int [] score, double [] weight) {
		/*
		 * initializing the scores to double to include integers
		 */
		double avgScore=0;
		double totalScore=0;
			for(int i=0; i<score.length; i++) {
				totalScore+=score[i]*weight[i];
			}
			/*
			 * set i to increase until the total score matches total score * Weight
			 */
			avgScore = totalScore/score.length;
			/*
			 * set average score to be totalscore divided by the score
			 */
		return avgScore; 
	}
}