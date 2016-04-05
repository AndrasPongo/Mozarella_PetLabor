package com.hybridtheory.studentbot;

import java.util.Map;

public class PetLabor {
	public static final String[] attitudes = {"lazy", "normal", "enthusiast"};
	public static final  String[] difficulties = {"easy", "normal", "advanced", "hard"}; 
	public static final String[] percentageOfCorrectAnswers = {"1%", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "99%"};
	public static final String[] proportionsOfLearningNewWordsAgainstPractice =  {"justNewWords", "1/3", "2/3", "justPractice"};

	public static void main(String[] args) {
		TrainingMaterialProvider trainingMaterialProvider = new TrainingMaterialProvider();
		Map<Integer, String> fetchedTraningMaterial = trainingMaterialProvider.FetchTrainingMaterial();
		StudentBot c3po = new StudentBot(fetchedTraningMaterial, attitudes[1], difficulties[1], percentageOfCorrectAnswers[6], proportionsOfLearningNewWordsAgainstPractice[1]);
		
		c3po.performStudySequence(365);
	}
	
	//TODO: use this to generate all possible scenarios to run a Rainbow Experiment
	public String[][] scenarioGenerator() {
		return null;
	}
}
