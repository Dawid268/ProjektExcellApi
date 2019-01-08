package com.java.excell.api.projektexcellapi.Entity;

import javax.persistence.*;
import java.util.Objects;
@NamedQueries({
        @NamedQuery(name="getAll",
                query="SELECT h.Na_Sales FROM DBModel h")
})
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
    private int Year_of_Release;
    @Column
    private String Genre;
    @Column
    private String Publisher;
    @Column
    private double Na_Sales;
    @Column
    private double EU_Sales;
    @Column
    private double JP_Sales;
    @Column
    private double Other_Sales;
    @Column
    private double Global_Sales;
    @Column
    private double Critic_Score;
    @Column
    private double Critic_Count;
    @Column
    private double User_Score;
    @Column
    private double User_Count;
    @Column
    private String Developer;
    @Column
    private String Rating;

    public DBModel(){

    }

    public DBModel(String name, String platform, int year_of_Release, String genre, String publisher, double na_Sales,
                   double EU_Sales, double JP_Sales, double other_Sales, double global_Sales, double critic_Score, double critic_Count,
                   double user_Score, double user_Count, String developer, String rating) {
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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getYear_of_Release() {
        return Year_of_Release;
    }

    public void setYear_of_Release(int year_of_Release) {
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

    public double getNa_Sales() {
        return Na_Sales;
    }

    public void setNa_Sales(double na_Sales) {
        Na_Sales = na_Sales;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DBModel dbModel = (DBModel) o;
        return Objects.equals(id, dbModel.id) &&
                Objects.equals(Name, dbModel.Name) &&
                Objects.equals(platform, dbModel.platform) &&
                Objects.equals(Year_of_Release, dbModel.Year_of_Release) &&
                Objects.equals(Genre, dbModel.Genre) &&
                Objects.equals(Publisher, dbModel.Publisher) &&
                Objects.equals(Na_Sales, dbModel.Na_Sales) &&
                Objects.equals(EU_Sales, dbModel.EU_Sales) &&
                Objects.equals(JP_Sales, dbModel.JP_Sales) &&
                Objects.equals(Other_Sales, dbModel.Other_Sales) &&
                Objects.equals(Global_Sales, dbModel.Global_Sales) &&
                Objects.equals(Critic_Score, dbModel.Critic_Score) &&
                Objects.equals(Critic_Count, dbModel.Critic_Count) &&
                Objects.equals(User_Score, dbModel.User_Score) &&
                Objects.equals(User_Count, dbModel.User_Count) &&
                Objects.equals(Developer, dbModel.Developer) &&
                Objects.equals(Rating, dbModel.Rating);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, Name, platform, Year_of_Release, Genre, Publisher, Na_Sales, EU_Sales, JP_Sales, Other_Sales, Global_Sales, Critic_Score, Critic_Count, User_Score, User_Count, Developer, Rating);
    }
}
