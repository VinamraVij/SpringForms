package com.mvcproject;

import java.util.Arrays;
import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class InternPrimaryDetails 
{
	
	@Override
	public String toString() {
		return "InternPrimaryDetails [favLanguage=" + favLanguage + ", language=" + Arrays.toString(language)
				+ ", internTenInstitute=" + internTenInstitute + ", internTenPercent=" + internTenPercent
				+ ", internTenYOP=" + internTenYOP + ", internTenBoard=" + internTenBoard + ", internTwelveInstitute="
				+ internTwelveInstitute + ", internTwelvePercent=" + internTwelvePercent + ", internTwelveYOP="
				+ internTwelveYOP + ", internTwelveBoard=" + internTwelveBoard + ", internCollegeName="
				+ internCollegeName + ", internCurrentSem=" + internCurrentSem + ", internCurrentCGPA="
				+ internCurrentCGPA + ", internPassingYear=" + internPassingYear + "]";
	}


	private LinkedHashMap<String, String> favLanguage;
	
	
	public InternPrimaryDetails() {
		favLanguage = new LinkedHashMap<String, String>();
		favLanguage.put("JAVA", "JAVA");
		favLanguage.put("Python", "Python");
		favLanguage.put("C#", "C#");
		favLanguage.put("MySQL", "MySQL");
	}
	
	
	@NotEmpty(message="select at least one")
	private String[] language;
	
	
	
	@NotNull(message="is required")
	private String internTenInstitute;
	
	@NotNull(message="is required")
	@Min(value=0,message="enter valid percentage")
	@Max(value=100,message="Enter valid percentage")
	private Float internTenPercent;
	@NotNull(message="is required")
	private Integer internTenYOP;
	@NotNull(message="is required")
	
	private String internTenBoard;
	@NotNull(message="is required")
	
	private String internTwelveInstitute;
	@NotNull(message="is required")
	@Min(value=0,message="enter valid percentage")
	@Max(value=100,message="Enter valid percentage")
	private Float internTwelvePercent;
	@NotNull(message="is required")
	private Integer internTwelveYOP;
	@NotBlank(message="is required")
	private String internTwelveBoard;
	
	@NotNull(message="is required")
	
	private String internCollegeName;
	@NotNull(message="is required")
	private Integer internCurrentSem;
	@NotNull(message="is required")
	@Min(value=0,message="enter valid CGPA")
	@Max(value=10,message="enter valid CGPA")
	private Float internCurrentCGPA;
	@NotNull(message="is required")
	@Min(value=2020,message="2020-2024")
	@Max(value=2024,message="2020-2024")
	private Integer internPassingYear;
	public String getInternCollegeName() {
		return internCollegeName;
	}
	public void setInternCollegeName(String internCollegeName) {
		this.internCollegeName = internCollegeName;
	}
	public Integer getInternCurrentSem() {
		return internCurrentSem;
	}
	public void setInternCurrentSem(Integer internCurrentSem) {
		this.internCurrentSem = internCurrentSem;
	}
	public Float getInternCurrentCGPA() {
		return internCurrentCGPA;
	}
	public void setInternCurrentCGPA(Float internCurrentCGPA) {
		this.internCurrentCGPA = internCurrentCGPA;
	}
	public Integer getInternPassingYear() {
		return internPassingYear;
	}
	public void setInternPassingYear(Integer internPassingYear) {
		this.internPassingYear = internPassingYear;
	}
	
	
	public String getInternTenInstitute() {
		return internTenInstitute;
	}
	public void setInternTenInstitute(String internTenInstitute) {
		this.internTenInstitute = internTenInstitute;
	}
	public String getInternTwelveInstitute() {
		return internTwelveInstitute;
	}
	public void setInternTwelveInstitute(String internTwelveInstitute) {
		this.internTwelveInstitute = internTwelveInstitute;
	}
	public Float getInternTenPercent() {
		return internTenPercent;
	}
	public void setInternTenPercent(Float internTenPercent) {
		this.internTenPercent = internTenPercent;
	}
	public Integer getInternTenYOP() {
		return internTenYOP;
	}
	public void setInternTenYOP(Integer internTenYOP) {
		this.internTenYOP = internTenYOP;
	}
	public String getInternTenBoard() {
		return internTenBoard;
	}
	public void setInternTenBoard(String internTenBoard) {
		this.internTenBoard = internTenBoard;
	}
	
	public Float getInternTwelvePercent() {
		return internTwelvePercent;
	}
	public void setInternTwelvePercent(Float internTwelvePercent) {
		this.internTwelvePercent = internTwelvePercent;
	}
	public Integer getInternTwelveYOP() {
		return internTwelveYOP;
	}
	public void setInternTwelveYOP(Integer internTwelveYOP) {
		this.internTwelveYOP = internTwelveYOP;
	}
	public String getInternTwelveBoard() {
		return internTwelveBoard;
	}
	public void setInternTwelveBoard(String internTwelveBoard) {
		this.internTwelveBoard = internTwelveBoard;
	}
	public String[] getLanguage() {
		return language;
	}
	public void setLanguage(String[] language) {
		this.language = language;
	}
	public LinkedHashMap<String, String> getFavLanguage() {
		return favLanguage;
	}
	
	
	
	
}
