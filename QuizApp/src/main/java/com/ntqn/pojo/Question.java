/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntqn.pojo;

import java.lang.Thread.Builder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Question {

    private int id;
    private String content;
    private String hint;
    private String image;
    private Category category;
    private Level level;
    private List<Choice> choice;

    public Question(Builder builder) {
        this.id = builder.id;
        this.content = builder.content;
        this.hint = builder.hint;
        this.image = builder.image;
        this.category = builder.category;
        this.level = builder.level;
        this.choice = builder.choice;
    }

    public static class Builder {

        private int id;
        private String content;
        private String hint;
        private String image;
        private Category category;
        private Level level;
        private List<Choice> choice = new ArrayList<>();
        
        public Builder(String content, Category category, Level level){
            this.content = content;
            this.category = category;
            this.level = level;
        }
        
        public Builder setHint(String hint){
            this.hint = hint;
            return this;
        }
        
        public Builder setImage(String img){
            this.image = img;
            return this;
        }
        
        public Builder addChoice(Choice choice){
            this.choice.add(choice);
            return this;
        }
        
        public Question build(){
            return new Question(this);
        }
        
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the category
     */
    
    /**
     * @return the level
     */
    public Level getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(Level level) {
        this.level = level;
    }

    /**
     * @return the choice
     */
    public List<Choice> getChoice() {
        return choice;
    }

    /**
     * @param choice the choice to set
     */
    public void setChoice(List<Choice> choice) {
        this.choice = choice;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

}
