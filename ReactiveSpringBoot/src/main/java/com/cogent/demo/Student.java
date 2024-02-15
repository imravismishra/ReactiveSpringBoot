package com.cogent.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "record")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

	@Id
	private int id;
	private String name;

}
