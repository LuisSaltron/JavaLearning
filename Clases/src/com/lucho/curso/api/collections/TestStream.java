package com.lucho.curso.api.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> message1 = Arrays.asList("este", "", "", "mensaje");
		List<String> message2 = Arrays.asList("", "es", "", "mensaje");
		List<String> message3 = Arrays.asList("este", "", "un", "mensaje");

		List<String> msgList = new ArrayList<String>();
		msgList.addAll(message1);
		msgList.addAll(message2);
		msgList.addAll(message3);

		List<String> listWords = new ArrayList<String>();

		listWords = Stream.concat(listWords.stream(), msgList.stream()).distinct().collect(Collectors.toList());

		listWords.remove("");
		System.out.println(listWords);
		
		
	}
	
	

}
