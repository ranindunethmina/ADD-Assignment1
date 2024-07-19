package com.ijse.aadassignment01;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Student implements Serializable {
    String id;
    String name;
    String age;

}