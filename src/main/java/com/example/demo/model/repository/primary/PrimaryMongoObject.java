package com.example.demo.model.repository.primary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @program: chenpan
 * @description:
 * @author: chenp
 * @create: 2018-11-13 17:35
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "first_mongo")
public class PrimaryMongoObject {
    @Id
    private String id;

    private String value;

    public String toString() {
        return "SecondaryMongoObject{"+"id='"+id + '\'' + ", value='" + value +'\''+'}';
    }

}