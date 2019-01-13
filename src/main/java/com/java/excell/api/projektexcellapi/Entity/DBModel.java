package com.java.excell.api.projektexcellapi.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "game")
public class DBModel {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long Id;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Platform")
    private String Platform;
    @Column(name = "Year_Of_Release")
    private int Year_Of_Release;
    @Column(name = "Genre")
    private String Genre;
    @Column(name = "Publisher")
    private String Publisher;
    @Column(name = "NA_Sales")
    private double NA_Sales;
    @Column(name = "EU_Sales")
    private double EU_Sales;
    @Column(name = "JP_Sales")
    private double JP_Sales;
    @Column(name = "Other_Sales")
    private double Other_Sales;
    @Column(name = "Global_Sales")
    private double Global_Sales;
    @Column(name = "Critic_Score")
    private double Critic_Score;
    @Column(name = "Critic_Count")
    private double Critic_Count;
    @Column(name = "User_Score")
    private double User_Score;
    @Column(name = "User_Count")
    private double User_Count;
    @Column(name = "Developer")
    private String Developer;
    @Column(name = "Rating")
    private String Rating;

    public DBModel(){

    }

    public DBModel(String name, String platform, int year_of_Release, String genre, String publisher, double NA_Sales, double EU_Sales, double JP_Sales, double other_Sales, double global_Sales, double critic_Score, double critic_Count, double user_Score, double user_Count, String developer, String rating) {
        Name = name;
        Platform = platform;
        Year_Of_Release = year_of_Release;
        Genre = genre;
        Publisher = publisher;
        this.NA_Sales = NA_Sales;
        this.EU_Sales = EU_Sales;
        this.JP_Sales = JP_Sales;
        Other_Sales = other_Sales;
        Global_Sales = global_Sales;
        Critic_Score = critic_Score;
        Critic_Count = critic_Count;
        User_Score = user_Score;
        User_Count = user_Count;
        Developer = developer;
        Rating = rating;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public int getYear_of_Release() {
        return Year_Of_Release;
    }

    public void setYear_of_Release(int year_of_Release) {
        Year_Of_Release = year_of_Release;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public double getNA_Sales() {
        return NA_Sales;
    }

    public void setNA_Sales(double NA_Sales) {
        this.NA_Sales = NA_Sales;
    }

    public double getEU_Sales() {
        return EU_Sales;
    }

    public void setEU_Sales(double EU_Sales) {
        this.EU_Sales = EU_Sales;
    }

    public double getJP_Sales() {
        return JP_Sales;
    }

    public void setJP_Sales(double JP_Sales) {
        this.JP_Sales = JP_Sales;
    }

    public double getOther_Sales() {
        return Other_Sales;
    }

    public void setOther_Sales(double other_Sales) {
        Other_Sales = other_Sales;
    }

    public double getGlobal_Sales() {
        return Global_Sales;
    }

    public void setGlobal_Sales(double global_Sales) {
        Global_Sales = global_Sales;
    }

    public double getCritic_Score() {
        return Critic_Score;
    }

    public void setCritic_Score(double critic_Score) {
        Critic_Score = critic_Score;
    }

    public double getCritic_Count() {
        return Critic_Count;
    }

    public void setCritic_Count(double critic_Count) {
        Critic_Count = critic_Count;
    }

    public double getUser_Score() {
        return User_Score;
    }

    public void setUser_Score(double user_Score) {
        User_Score = user_Score;
    }

    public double getUser_Count() {
        return User_Count;
    }

    public void setUser_Count(double user_Count) {
        User_Count = user_Count;
    }

    public String getDeveloper() {
        return Developer;
    }

    public void setDeveloper(String developer) {
        Developer = developer;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    @Override
    public String toString() {
        return "DBModel{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Platform='" + Platform + '\'' +
                ", Year_of_Release=" + Year_Of_Release +
                ", Genre='" + Genre + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", NA_Sales=" + NA_Sales +
                ", EU_Sales=" + EU_Sales +
                ", JP_Sales=" + JP_Sales +
                ", Other_Sales=" + Other_Sales +
                ", Global_Sales=" + Global_Sales +
                ", Critic_Score=" + Critic_Score +
                ", Critic_Count=" + Critic_Count +
                ", User_Score=" + User_Score +
                ", User_Count=" + User_Count +
                ", Developer='" + Developer + '\'' +
                ", Rating='" + Rating + '\'' +
                '}';
    }
}
