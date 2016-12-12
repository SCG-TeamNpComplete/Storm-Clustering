package com.milestone1.Dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.milestone1.aurora.bean.JobDetailsBean;

public class ConvertToJson {

	public String convertToJSON(List<JobDetailsBean> jdb) throws JsonProcessingException {

		ObjectMapper objectMapper = new ObjectMapper();
		// Set pretty printing of json
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

		List<List<JobDetailsBean>> personList = Stream.of(jdb).collect(Collectors.toList());
		String arrayToJson = objectMapper.writeValueAsString(personList);
    	System.out.println("1. Convert List of person objects to JSON :");
    	System.out.println(arrayToJson);
    	
    	
    	
    	
		return arrayToJson;
	}

}
