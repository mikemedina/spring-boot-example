package com.example.projects.example;

import org.junit.experimental.categories.Category;

/**
 * Created by Mike on 9/4/2016.
 */
@Category(ExampleTest.class)
public class BaseTest implements ExampleTest {  // This is a convenience class.
// It implements the marker interface so other test classes can just extend this class
// It also allows for having shared functionality between tests later
}
