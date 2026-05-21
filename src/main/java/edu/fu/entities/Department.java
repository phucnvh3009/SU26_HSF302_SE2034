package edu.fu.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "departments")
@NoArgsConstructor@AllArgsConstructor
@Setter@Getter
@ToString
@Builder
public class Department extends  BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_name", unique = true, columnDefinition = "VARCHAR(255)")
    private String departmentName;

    private String description;

    // List of Job
    // Map vs List vs Set --> cho nợ
    @OneToMany(mappedBy = "department")
    private Set<Job> jobs = new HashSet<>();

    @OneToMany(mappedBy = "department")
    private Set<User> users = new HashSet<>();

}
