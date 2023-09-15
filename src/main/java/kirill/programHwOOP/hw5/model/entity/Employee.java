package kirill.programHwOOP.hw5.model.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Integer id;
    private String name;
    private Integer reportsTo; //кто главнее
    private List<Integer> unit; //подчинение
}
