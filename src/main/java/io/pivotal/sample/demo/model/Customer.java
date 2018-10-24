package io.pivotal.sample.demo.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Region("Customer")
@Data
public class Customer {

    private String name;
    @NonNull
    private String id;
    private Long ssn;

}