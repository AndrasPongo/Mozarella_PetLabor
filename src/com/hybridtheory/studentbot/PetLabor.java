package com.hybridtheory.studentbot;

import java.util.Arrays;
import java.util.Map;

public class PetLabor {
	public static final String[] attitudes = {"lazy", "normal", "enthusiast"};
	public static final  String[] difficulties = {"easy", "normal", "advanced", "hard"}; 
	public static final String[] percentageOfCorrectAnswers = {"1%", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "99%"};
	public static final String[] proportionsOfLearningNewWordsAgainstPractice =  {"justNewWords", "1/3", "2/3", "justPractice"};
	private static final int sampleSize = 100;
	private static String[] availableScenarios = new String[3*4*11*4];

	public static void main(String[] args) {
		TrainingMaterialProvider trainingMaterialProvider = new TrainingMaterialProvider();
		Map<Integer, String> fetchedTraningMaterial = trainingMaterialProvider.FetchTrainingMaterial();
		
		scenarioGenerator();
		System.out.println(Arrays.toString(availableScenarios));
		
		int scenarioNr = -1;
		for (int experimentScenario = 0; experimentScenario<availableScenarios.length; experimentScenario++){
			scenarioNr++;
			for (int numberOfExperimentsPerUserType = 0; numberOfExperimentsPerUserType <= sampleSize; numberOfExperimentsPerUserType++) {
				StudentBot c3po = new StudentBot(
						fetchedTraningMaterial, 
						attitudes[Integer.parseInt(availableScenarios[scenarioNr].split(":")[0])], 
						difficulties[Integer.parseInt(availableScenarios[scenarioNr].split(":")[1])],
						percentageOfCorrectAnswers[Integer.parseInt(availableScenarios[scenarioNr].split(":")[2])],
						proportionsOfLearningNewWordsAgainstPractice[Integer.parseInt(availableScenarios[scenarioNr].split(":")[3])]);
				c3po.performStudySequence(365);			
			}
		}
	}
	
	//TODO: use this to generate all possible scenarios to run a Rainbow Experiment
	public static String[] scenarioGenerator() {
		int scenarioNr = 0;
		
		int attitudeNr = 0;
		int difficultyNr = 0;
		int percentageNr = 0;
		int proportionNr = 0;
		
		for (String attitude: attitudes) {
			difficultyNr = 0;
			for (String difficulty: difficulties) {
				percentageNr = 0;
				for (String percenpercentageOfCorrectAnswer: percentageOfCorrectAnswers) {
					proportionNr = 0;
					for (String proportionOfLearningNewWordsAgainstPractice: proportionsOfLearningNewWordsAgainstPractice) {
						availableScenarios[scenarioNr] = attitudeNr+":"+difficultyNr+":"+percentageNr+":"+proportionNr;
						proportionNr++;
						scenarioNr++;
					}
					percentageNr++;
				}
				difficultyNr++;
			}
			attitudeNr++;
		}
		attitudeNr = 0;
		return availableScenarios;
	}
}
