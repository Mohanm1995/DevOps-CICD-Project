package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	@GetMapping
	public String message(){

		return """
				<!DOCTYPE html>
				<html>
				<head>
				    <title>DevOps Project</title>

				    <style>
				        body {
				            margin: 0;
				            padding: 0;
				            height: 100vh;
				            display: flex;
				            justify-content: center;
				            align-items: center;
				            background: linear-gradient(135deg, #1e3c72, #2a5298);
				            font-family: Arial, sans-serif;
				            color: white;
				            text-align: center;
				        }

				        .container {
				            background: rgba(255,255,255,0.1);
				            padding: 50px;
				            border-radius: 20px;
				            box-shadow: 0 8px 20px rgba(0,0,0,0.3);
				        }

				        h1 {
				            font-size: 50px;
				            margin-bottom: 20px;
				        }

				        p {
				            font-size: 22px;
				        }

				        .highlight {
				            color: #ffd700;
				            font-weight: bold;
				        }

				        .author {
				            margin-top: 25px;
				            font-size: 20px;
				            font-weight: bold;
				            color: #f1f1f1;
				            letter-spacing: 1px;
				        }
				    </style>
				</head>

				<body>

				    <div class="container">

				        <h1>Welcome to DevOps</h1>

				        <p>
				            CI/CD Pipeline Successfully Deployed using
				            <span class="highlight">
				                Jenkins, Docker & Kubernetes
				            </span>
				        </p>

				        <p>Hosted on AWS</p>

				        <div class="author">
				            Mohan M | AWS & DevOps Engineer
				        </div>

				    </div>

				</body>
				</html>
				""";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
