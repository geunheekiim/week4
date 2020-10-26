package javaapp1026;

public class Movie {
//	영화 정보를 저장 - 클래스이름 : Movie
//	일련번호 - 정수﻿
//	영화제목 - 문자열﻿
//	주연배우 - 문자열
//	관람등급 - 정수
//	개봉일 - 문자열
//	관객수 - 정수
//	평점 - 실수
	
	private int movieNum;
	private String movieTitle;
	private String actor;
	private int movieRating;
	private String openingDate;
	private int attendance;
	private double ratingAverage;
	
	public int getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}

	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}
	public String getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public double getRatingAverage() {
		return ratingAverage;
	}
	public void setRatingAverage(double ratingAverage) {
		this.ratingAverage = ratingAverage;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	@Override
	public String toString() {
		return "Movie [movieNum=" + movieNum + ", movieTitle=" + movieTitle + ", actor=" + actor + ", movieRating="
				+ movieRating + ", openingDate=" + openingDate + ", attendance=" + attendance + ", ratingAverage="
				+ ratingAverage + "]";
	}
	

	
}
