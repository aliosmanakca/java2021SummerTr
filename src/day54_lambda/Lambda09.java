package day54_lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda09 {

	public static void main(String[] args) {
		try {
			Files.lines(Paths.get("C:\\Users\\Ali Osman\\eclipse-workspace\\java2021SummerTr\\src\\day54_lambda\\LambdaFile")).forEach(System.out::print);
		} catch (IOException e) { 
			System.out.println(e);
		}
		
		try {
			Files.lines(Paths.get("C:\\Users\\Ali Osman\\eclipse-workspace\\java2021SummerTr\\src\\day54_lambda\\LambdaFile")).map(String::toUpperCase).forEach(t->System.out.println(t));
		} catch (IOException e) { 
			System.out.println(e);
		}
		
		//metindeki farklı kelimeleri yazdır
		System.out.println();
        try {
            Files.lines(Paths.get("C:\\Users\\Ali Osman\\eclipse-workspace\\java2021SummerTr\\src\\day54_lambda\\LambdaFile")).map(t->t.split(" ")).
                    flatMap(Arrays::stream).map(t->t.replaceAll("\\W","")).distinct().forEach(System.out::print);
        } catch (IOException e) {
            System.out.println(e);
        }
        // metinde "e" içeren tüm kelimeleri yazdırın. (sayısınıda yazdırabilirsin)
        System.out.println();


        try {
            Files.lines(Paths.get("C:\\Users\\Ali Osman\\eclipse-workspace\\java2021SummerTr\\src\\day54_lambda\\LambdaFile")).
                    map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("e")).forEach(System.out::print);
        } catch (IOException e) {
            System.out.println(e);
        }

	}

}
