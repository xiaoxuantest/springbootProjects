package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 刘晓轩
 * @description 用户实体类
 * @date 2020/8/3 14:11
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name",nullable = false,length = 10)
    private String name;
    @Column(name = "age",nullable = false,length = 4)
    private Integer age;

}
