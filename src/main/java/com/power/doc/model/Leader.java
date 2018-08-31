package com.power.doc.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Description:
 * 领导者
 *
 * @author yu 2018/06/28.
 */
public class Leader {

    /**
     * 姓名
     */
    @NotEmpty
    @Length(max = 5)
    private String name;

    /**
     * 生日
     */
    @NotNull(message = "生日不能为空")
    @Pattern(regexp = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$", message = "出生日期格式不正确")
    private String birthday;

    /**
     * 年龄
     */
    @Min(value = 0)
    private Integer age;

    /**
     * 科目
     */
    @Valid
    private Subject subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
