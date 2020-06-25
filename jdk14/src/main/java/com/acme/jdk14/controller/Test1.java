package com.acme.jdk14.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream; 

public class Test1 {
	
	private final static Logger LOGGER = Logger.getLogger(Test1.class.getName()); ;
	
	
	public static void main(String Args[]) {
		LOGGER.setLevel(Level.INFO);
		Test1 test1 = new Test1();
		test1.colecciones();
		
	}
	
	public void colecciones() {
		List<Integer> list = List.of(1, 2, 3);
		Set<String> set = Set.of("a", "b", "c");
		Stream<String> stream = Stream.of("a", "b", "c","c");
		Map<String, String> map = Map.of("clave 1", "valor 1", "clave 2",  "valor 2");

		LOGGER.info(""+list);
		LOGGER.info(""+set);
		LOGGER.info(""+stream.collect(Collectors.toList()));
		LOGGER.info(""+map);
	}
	
	public void lambdas() {
		
		LOGGER.info("entra a");
		
		Map<Integer, Integer> map = Map.of(10, 2, 3000, 400, 5, 60);
		LOGGER.info("----------------------------------------: "+map);
		map.forEach((x, y) -> LOGGER.info((x + y)+""));
		LOGGER.info("----------------------------------------");
		map.forEach((Integer x, Integer y) -> LOGGER.info((x + y)+""));
		LOGGER.info("----------------------------------------");
		map.forEach((var x, var y) -> LOGGER.info((x + y)+""));
		LOGGER.info("----------------------------------------");
		//map.forEach((@NotNull var x, @NotNull var y) -> LOGGER.info((x + y)+""));

		//map.forEach((x, var y) -> LOGGER.info(x + y)); // No compila
		//map.forEach((int x, var y) -> LOGGER.info(x + y)); // No compila
		
	}
	
	public void inferenciaDeTipos() {
		var list = List.of(1, 2, 3);
		var example = "example";
		var team = new Team();
		
		System.out.println("1 "+list);
		System.out.println("1 "+example);
		System.out.println("1 "+team);
	}
	

}
