package com.example;

import static spark.Spark.*;

public class App 
{
    public static void main( String[] args )
    {	// default 4567
		port(3000); // schimbă portul la 3000
		get("/", (req,res) -> "Hello devops!");
        System.out.println( "App is running on port 3000, but 4567 - implicit for Spark Java-micro-framework for API");
    }
}
