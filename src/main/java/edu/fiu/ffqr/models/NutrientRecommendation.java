package edu.fiu.ffqr.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="nutrients_recommendations")
public class NutrientRecommendation implements Serializable {

	@JsonProperty("questionnaireId")
	private String questionnaireId; 
	@JsonProperty("patientName")
	String patientName;
	@JsonProperty("patientAge")
	int patientAgeInMonths;
	List <Recommendation> recommendationsList;
	
	public NutrientRecommendation() {
		recommendationsList = new ArrayList<>();
	}
	
	public String getQuestionnaireId() {
		return questionnaireId;
	}

	public void setQuestionnaireId(String questionnaireId) {
		this.questionnaireId = questionnaireId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAgeInMonths() {
		return patientAgeInMonths;
	}

	public void setPatientAgeInMonths(int patientAgeInMonths) {
		this.patientAgeInMonths = patientAgeInMonths;
	}

	public List<Recommendation> getRecommendationsList() {
		return recommendationsList;
	}

	public void setRecommendationsList(List<Recommendation> recommendationsList) {
		this.recommendationsList = recommendationsList;
	}
	
}
