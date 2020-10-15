package com.huang.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.List;
import java.util.Map;

/**
 * @author :huangao
 */
@Component
@ConfigurationProperties(prefix = "user")
@Validated //JSR303校验
public class User {

    private String name;
    private int age;

    @Email(message = "不是邮箱格式") //JSR303校验
    private String mail;

    private Dog dog;
    private Map<String,Object> idos;
    private List<String> hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map<String, Object> getIdos() {
        return idos;
    }

    public void setIdos(Map<String, Object> idos) {
        this.idos = idos;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mail=" + mail +
                ", dog=" + dog +
                ", idos=" + idos +
                ", hobby=" + hobby +
                '}';
    }
}
