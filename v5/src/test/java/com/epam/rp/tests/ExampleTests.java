package com.epam.rp.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class ExampleTests {

    public static Logger log = LoggerFactory.getLogger(ExampleTests.class);

    @BeforeAll
    static void setup() {
        log.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        log.info("@BeforeEach - executes before each test method in this class");
    }

    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        log.info("Success");
    }

    @Test
    @Disabled("Not implemented yet")
    void testShowSomething() {
    }

    @AfterEach
    void tearDown() {
        log.info("@AfterEach - executed after each test method.");
    }

    @AfterAll
    static void done() {
        log.info("@AfterAll - executed after all test methods.");
    }

    @BeforeEach
    void initializeBaseClass() {
        log.info("Before each");
    }

    @Test
    @Tag("tag1")
    @Tag("tag2")
    void baseClassTest() {
        log.info("test");
    }

    @Nested
    class FirstContext {

        @BeforeEach
        void initializeFirstNesting() {
            log.info("nested - before each");
        }

        @RepeatedTest(10)
        void firstNestedTest() {
            log.info("nested - test");
        }

        @AfterEach
        void afterFirstContext() {
            log.info("nested - after each");
        }
    }
}
