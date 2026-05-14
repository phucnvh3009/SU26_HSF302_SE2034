package edu.fu.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departments")
@NoArgsConstructor@AllArgsConstructor
@Setter@Getter
@ToString
public class Department extends  BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_name", unique = true, columnDefinition = "VARCHAR(255)")
    private String departmentName;

    private String description;
    private static String university;
}
