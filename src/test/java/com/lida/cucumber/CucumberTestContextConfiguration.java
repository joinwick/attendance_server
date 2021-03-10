package com.lida.cucumber;

import com.lida.AttendanceApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = AttendanceApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
