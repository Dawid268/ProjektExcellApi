package com.java.excell.api.projektexcellapi.Entity;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class DBModel {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String Name;
    @Column
    private String platform;
    @Column
    private String Year_of_Release;
    @Column
    private String Genre;
    @Column
    private String Publisher;
    @Column
    private String Na_Sales;
    @Column
    private String EU_Sales;
    @Column
    private String JP_Sales;
    @Column
    private String Other_Sales;
    @Column
    private String Global_Sales;
    @Column
    private String Critic_Score;
    @Column
    private String Critic_Count;
    @Column
    private String User_Score;
    @Column
    private String User_Count;
    @Column
    private String Developer;
    @Column
    private String Rating;

    public DBModel(){

    }

    public DBModel(String name, String platform, String year_of_Release, String genre, String publisher, String na_Sales, String EU_Sales, String JP_Sales, String other_Sales, String global_Sales, String critic_Score, String critic_Count, String user_Score, String user_Count, String developer, String rating) {
        Name = name;
        this.platform = platform;
        Year_of_Release = year_of_Release;
        Genre = genre;
        Publisher = publisher;
        Na_Sales = na_Sales;
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
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getYear_of_Release() {
        return Year_of_Release;
    }

    public void setYear_of_Release(String year_of_Release) {
        Year_of_Release = year_of_Release;
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

    public String getNa_Sales() {
        return Na_Sales;
    }

    public void setNa_Sales(String na_Sales) {
        Na_Sales = na_Sales;
    }

    public String getEU_Sales() {
        return EU_Sales;
    }

    public void setEU_Sales(String EU_Sales) {
        this.EU_Sales = EU_Sales;
    }

    public String getJP_Sales() {
        return JP_Sales;
    }

    public void setJP_Sales(String JP_Sales) {
        this.JP_Sales = JP_Sales;
    }

    public String getOther_Sales() {
        return Other_Sales;
    }

    public void setOther_Sales(String other_Sales) {
        Other_Sales = other_Sales;
    }

    public String getGlobal_Sales() {
        return Global_Sales;
    }

    public void setGlobal_Sales(String global_Sales) {
        Global_Sales = global_Sales;
    }

    public String getCritic_Score() {
        return Critic_Score;
    }

    public void setCritic_Score(String critic_Score) {
        Critic_Score = critic_Score;
    }

    public String getCritic_Count() {
        return Critic_Count;
    }

    public void setCritic_Count(String critic_Count) {
        Critic_Count = critic_Count;
    }

    public String getUser_Score() {
        return User_Score;
    }

    public void setUser_Score(String user_Score) {
        User_Score = user_Score;
    }

    public String getUser_Count() {
        return User_Count;
    }

    public void setUser_Count(String user_Count) {
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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "DBModel{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", platform='" + platform + '\'' +
                ", Year_of_Release='" + Year_of_Release + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", Na_Sales='" + Na_Sales + '\'' +
                ", EU_Sales='" + EU_Sales + '\'' +
                ", JP_Sales='" + JP_Sales + '\'' +
                ", Other_Sales='" + Other_Sales + '\'' +
                ", Global_Sales='" + Global_Sales + '\'' +
                ", Critic_Score='" + Critic_Score + '\'' +
                ", Critic_Count='" + Critic_Count + '\'' +
                ", User_Score='" + User_Score + '\'' +
                ", User_Count='" + User_Count + '\'' +
                ", Developer='" + Developer + '\'' +
                ", Rating='" + Rating + '\'' +
                '}';
    }
}
